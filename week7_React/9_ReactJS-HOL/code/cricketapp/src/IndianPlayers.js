import React from 'react';

function IndianPlayers() {
  const T20players = ['Virat', 'Rohit', 'Hardik', 'Surya'];
  const RanjiTrophy = ['Pujara', 'Rahane', 'Unadkat', 'Saha'];
  const allPlayers = [...T20players, ...RanjiTrophy];
  const oddTeam = allPlayers.filter((_, index) => index % 2 === 0);    
  const evenTeam = allPlayers.filter((_, index) => index % 2 !== 0);  
  return (
    <div>
      <h2>Odd Team Players</h2>
      <ul>
        {oddTeam.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>

      <h2>Even Team Players</h2>
      <ul>
        {evenTeam.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>

      <h2>Merged Team</h2>
      <ul>
        {allPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>
    </div>
  );
}

export default IndianPlayers;
