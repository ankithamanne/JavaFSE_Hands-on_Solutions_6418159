import React, { useState } from 'react';

function LoginButton({ onClick }) {
  return <button onClick={onClick}>Login</button>;
}

function LogoutButton({ onClick }) {
  return <button onClick={onClick}>Logout</button>;
}

function GuestGreeting() {
  return (
    <div>
      <h2>Welcome Guest</h2>
      <p>Please log in to book tickets.</p>
      <ul>
        <li>Flight A1 – Hyderabad to Delhi</li>
        <li>Flight B1 – Mumbai to Dubai</li>
        <li>Flight C1 – Chennai to Singapore</li>
      </ul>
    </div>
  );
}

function UserGreeting() {
  return (
    <div>
      <h2>Welcome User</h2>
      <p>You can now book tickets.</p>
      <ul>
        <li>Flight A1 –  Hyderabad to Delhi <button>Book</button></li>
        <li>Flight B1 – Mumbai to Dubai <button>Book</button></li>
        <li>Flight C1 – Chennai to Singapore <button>Book</button></li>
      </ul>
    </div>
  );
}

function Greeting({ isLoggedIn }) {
  return isLoggedIn ? <UserGreeting /> : <GuestGreeting />;
}

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  return (
    <div style={{ padding: '20px' }}>
      <h1>Ticket Booking App</h1>
      {isLoggedIn ? (
        <LogoutButton onClick={() => setIsLoggedIn(false)} />
      ) : (
        <LoginButton onClick={() => setIsLoggedIn(true)} />
      )}
      <Greeting isLoggedIn={isLoggedIn} />
    </div>
  );
}

export default App;
