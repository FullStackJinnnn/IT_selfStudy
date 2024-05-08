const mongoose = require('mongoose');
const bcrypt = require('bcrypt');
const saltRounds = 10
const jwt = require('jsonwebtoken');

const userSchema = mongoose.Schema({
    name: {
        type: String,
        maxlength: 50
    },
    email: {
        type: String,
        Trim: true,
        unique: 1,
    },
    password: {
        type: String,
        minlength: 5
    },
    lastname: {
        type: String,
        maxlength: 50
    },
    role: { //관리자 or 유저
        type: Number,
        default: 0
    },
    image: String,
    token: { // 유효성 관리
        type: String,
    },
    tokenExp: { // 토큰의 유효기간
        type: Number
    }
})


userSchema.pre('save', function (next) {
    // 비밀번호 암호화
    const user = this;

    if (user.isModified('password')) {
        bcrypt.genSalt(10, function (err, salt) {
            if (err) {
                return next(err);
            }

            bcrypt.hash(user.password, salt, function (err, hash) {
                if (err) {
                    return next(err);
                }
                user.password = hash;
                return next();
            });
        });
    }
    else {
        return next();
    }
});

userSchema.methods.comparePassword = function (plainPassword) {
    // 암호화된 비밀번호와 같은지 체크
    const user = this;
    return bcrypt.compare(plainPassword, this.password)
}

userSchema.methods.generateToken = function () {
    // jwt 생성
    user = this;
    const token = jwt.sign(user._id.toJSON(), 'secretToken');
    user.token = token;

    return user.save();
}

userSchema.statics.findByToken = function (token, cb) {
    var user = this;

    //토큰을 decode 한다.
    jwt.verify(token, 'secretToken', function (err, decoded) {
        //유저 아이디를 이용해서 유저를 찾은 다음
        //클라이언트에서 가져온 token과 DB에 보관된 토큰이 일치하는지 확인

        user.findOne({ "_id": decoded, "token": token }, function (err, user) {


            if (err) return cb(err);
            cb(null, user)

        })
    })
}

const User = mongoose.model('User', userSchema)

module.exports = { User }