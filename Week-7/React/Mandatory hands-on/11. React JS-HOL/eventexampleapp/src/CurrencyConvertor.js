import React, { useState } from 'react';

function CurrencyConvertor() {
  const [amount, setAmount] = useState('');
  const [currency, setCurrency] = useState('Euro');

  const handleSubmit = () => {
    let result = 0;
    if (currency === 'Euro') {
      result = parseFloat(amount) * 80;
    }
    alert(`Converting to ${currency} Amount is ${result}`);
  };

  return (
    <div>
      <h2 style={{ color: 'green' }}>Currency Convertor!!!</h2>

      <div style={{ marginBottom: '10px' }}>
        <label style={{ marginRight: '25px' }}>Amount:</label>
        <input
          type="number"
          value={amount}
          onChange={(e) => setAmount(e.target.value)}
        />
      </div>

      <div style={{ marginBottom: '10px' }}>
        <label style={{ marginRight: '20px' }}>Currency:</label>
        <select value={currency} onChange={(e) => setCurrency(e.target.value)}>
          <option value="Euro">Euro</option>
        </select>
      </div>

      <div>
         <label style={{ marginRight: '85px' }}></label>
        <button onClick={handleSubmit}>Submit</button>
      </div>
    </div>
  );
}

export default CurrencyConvertor;
