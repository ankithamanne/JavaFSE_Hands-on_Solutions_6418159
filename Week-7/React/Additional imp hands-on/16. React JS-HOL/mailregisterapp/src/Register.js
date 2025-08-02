import React, { useState } from 'react';

function Register() {
  const [name, setName] = useState('');
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();

    if (name.length < 5) {
      alert("Full Name must be 5 characters long!");
      return;
    }

    if (!email.includes('@') || !email.includes('.')) {
      alert("Invalid email format!");
      return;
    }

    if (password.length < 8) {
      alert("Password must be at least 8 characters!");
      return;
    }

    alert(`Thank you ${name}, your registration is successful!`);
    setName('');
    setEmail('');
    setPassword('');
  };

  return (
    <div style={{ textAlign: 'center', marginTop: '150px' }}>
      <h1 style={{ color: 'red' }}>Register Here!!!</h1>
      <form onSubmit={handleSubmit}>
        <div style={{ margin: '10px' }}>
          <label>Name:&nbsp;
            <input
              type="text"
              value={name}
              onChange={(e) => setName(e.target.value)}
              style={{ marginLeft: '22px'}}
            />
          </label>
        </div>
        <div style={{ margin: '10px' }}>
          <label>Email:&nbsp;
            <input
              type="text"
              value={email}
              onChange={(e) => setEmail(e.target.value)}
              style={{ marginLeft: '27px'}}
            />
          </label>
        </div>
        <div style={{ margin: '10px' }}>
          <label>Password:&nbsp;
            <input
              type="password"
              value={password}
              onChange={(e) => setPassword(e.target.value)}
            />
          </label>
        </div>
        <div>
          <div style={{ marginLeft: '140px', marginTop: '10px' }}>
            <button type="submit">Submit</button>
          </div>
        </div>
      </form>
    </div>
  );
}

export default Register;
