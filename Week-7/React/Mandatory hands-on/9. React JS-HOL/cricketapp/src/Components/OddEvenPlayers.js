import React from 'react';

function OddEvenPlayers() {
  const players = ["Virat", "Rohit", "Dhoni", "Jadeja", "Bumrah", "Shami"];

  const oddPlayers = [];
  const evenPlayers = [];

  players.map((player, index) => {
    if ((index + 1) % 2 === 1) {
      oddPlayers.push(player);
    } else {
      evenPlayers.push(player);
    }
    return null;
  });

  return (
    <div>
      <h2>Odd Team Players</h2>
      <ul>
        {oddPlayers.map((p, i) => (
          <li key={i}>{p}</li>
        ))}
      </ul>

      <h2>Even Team Players</h2>
      <ul>
        {evenPlayers.map((p, i) => (
          <li key={i}>{p}</li>
        ))}
      </ul>
    </div>
  );
}

export default OddEvenPlayers;
