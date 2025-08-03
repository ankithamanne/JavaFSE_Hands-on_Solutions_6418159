import React from 'react';
import ListofPlayers from './Components/ListofPlayers';
import OddEvenPlayers from './Components/OddEvenPlayers';
import IndianPlayers from './Components/IndianPlayers';

function App() {
  const flag = true; // ✅ Change to false to test other view

  return (
    <div>
     
      {flag ? (
        <>
          <ListofPlayers />
        </>
      ) : (
        <>
          <OddEvenPlayers />
          <IndianPlayers />
        </>
      )}
    </div>
  );
}

export default App;
