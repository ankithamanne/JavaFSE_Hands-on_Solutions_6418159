import React, { useState } from 'react';
import './App.css';

function ComplaintRegister() {
  const [name, setName] = useState('');
  const [complaint, setComplaint] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();
    const txnId = Math.floor(Math.random() * 100);
    alert(`Thanks ${name}\nYour Complaint was Submitted.\nTransaction ID is ${txnId}`);
    setName('');
    setComplaint('');
  };

  return (
    <div className="complaint-container">
      <div className="form-box">
        <h2 className="heading">Register your complaints here!!!</h2>
        <form onSubmit={handleSubmit}>
          <div className="form-group row">
            <label><b>Name:</b></label>
            <input
              type="text"
              value={name}
              onChange={(e) => setName(e.target.value)}
              required
            />
          </div>

          <div className="form-group row">
            <label><b>Complaint:</b></label>
            <textarea
              rows="4"
              cols="30"
              value={complaint}
              onChange={(e) => setComplaint(e.target.value)}
              required
            />
          </div>

          <div className="button-container">
            <button type="submit">Submit</button>
          </div>
        </form>
      </div>
    </div>
  );
}

export default ComplaintRegister;
