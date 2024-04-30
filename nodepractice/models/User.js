const mongoose = require('mongoose');


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
    role : { //관리자 or 유저
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

const User = mongoose.model('User',userSchema)

module.exports = {User}