const express = require('express')
const app = express()
const port = 5000
const bodyParser = require('body-parser');

const config = required('./config/key');

const { User } = require("./models/User");

//application/x-www-form-urlencoded 를 분석해서 가져옴
app.use(bodyParser.urlencoded({ extended: true }));
//application/json 제이슨 타입을 분석해서 가져옴
app.use(bodyParser.json());

const mongoose = require('mongoose')
mongoose.connect(config.mongoURI).then(() => console.log('MongoDB Connected!')).catch(err => console.log(err))


app.get('/', (req, res) => {
  res.send('Hello World!~!!!!!!!!!!!!!!!~~~~~~~~~~~~@@@~~~~~~SS!')
})



  //회원 가입 할때 필요한 정보들을 cliend에서 가져오면
  //그것들을 데이터 베이스에 넣어준다.
  app.post('/register', async (req, res) => {
    //회원가입시 필요 정보를 client에서 가져오면
    //데이터베이스에 삽입한다
  
    //body parser를 통해 body에 담긴 정보를 가져온다
    const user = new User(req.body)
  
    //mongoDB 메서드, user모델에 저장
    const result = await user.save().then(()=>{
      res.status(200).json({
        success: true
      })
    }).catch((err)=>{
      res.json({ success: false, err })
    })
  })

  app.post('/login', async (req,res) => {
    //요청된 이메일을 데이터베이스에서 있는지 찾는다.
    User.findOne({ email: req.body.email }), (err, userInfo) => {
      if(!user) {
        return res.json({
          loginSuccess: false,
          message: "유저 없음"
        })
      }
    }
  })
  //요청된 이메일이 데이터 베이스에 있다면 비밀번호가 맞는 비밀번호 인지 확인.

      user.comparePassword(req.body.password , (err, isMatch ) => {
        if(!isMatch)
        return res.json({ loginSuccess: false, message: "비밀번호 틀림"})
    //비밀번호 까지 맞다면 토큰을 생성하기.
        user.generateToken((err, user) => {

      })

    })


  



app.listen(port, () => {
  console.log(`Example app listening on port ${port}`)
})