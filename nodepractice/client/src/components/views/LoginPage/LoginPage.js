import React, { useState } from 'react'

function LoginPage() {

    const [Email, setEmail] = useState("")
    const [Password, setPassword] = useState("")

    const onEmailHander = (event) => {

        setEmail(event.currrentTarget.value)
    }

    const onPasswordHander = (event) => {

      setPassword(event.currrentTarget.value)
  }

  const onSubmitHander = (event) => {

   
}










  return (
    <div sytle={{
      display: 'flex', justifyContent: 'center', alignItems: 'center', width: '100%', height: '100vh'
    }}>

      <form style={{ display: 'flex', flexdirection: 'column' }}
      onSubmit={onSubmitHandler}>
        <label>Email</label>
        <input type="email" value={Email} onChange={onEmailHandler} />
        <lable>Password</lable>
        <input type="password" value={Password} onChange />
      </form>
      <br />
      <button>
        Login
      </button>
    </div>
  )
}

export default LoginPage