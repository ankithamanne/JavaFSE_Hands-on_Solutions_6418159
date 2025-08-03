import React from 'react';
import './App.css';

const offices = [
  {
    id: 1,
    name: 'Urban Hive',
    rent: 55000,
    address: 'Hyderabad, Telangana',
    image: 'images/1.png'
  },
  {
    id: 2,
    name: 'TechSpace',
    rent: 65000,
    address: 'Bangalore, Karnataka',
    image: 'images/2.jpg'
  },
  {
    id: 3,
    name: 'Cowork Den',
    rent: 48000,
    address: 'Pune, Maharashtra',
    image: 'images/3.jpg'
  }
];

function App() {
  return (
    <div className="App">
      <h1 className="main-heading">Office Space Rental App</h1>
      <div className="office-container">
        {offices.map((office) => (
          <div key={office.id} className="office-card">
            <img src={office.image} alt={office.name} />
            <h3>Name: {office.name}</h3>
            <p className={office.rent > 60000 ? 'green' : 'red'}>
              <strong>Rent:</strong> ₹{office.rent}
            </p>
            <p><strong>Address:</strong> {office.address}</p>
          </div>
        ))}
      </div>
    </div>
  );
}

export default App;
