import React from "react";

const players = [
  { name: "Virat Kohli", score: 95 },
  { name: "Rohit Sharma", score: 88 },
  { name: "KL Rahul", score: 45 },
  { name: "Shubman Gill", score: 76 },
  { name: "Hardik Pandya", score: 63 },
  { name: "Ravindra Jadeja", score: 84 },
  { name: "R. Ashwin", score: 54 },
  { name: "Bumrah", score: 92 },
  { name: "Kuldeep Yadav", score: 43 },
  { name: "Shami", score: 74 },
  { name: "Surya Kumar", score: 66 },
];

function ListofPlayers() {
  const playerList = players.map((player, index) => (
    <li key={index}>
      {player.name} - {player.score}
    </li>
  ));

  const below70 = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>All Players:</h2>
      <ul>{playerList}</ul>

      <h2>Players with Score Below 70:</h2>
      <ul>
        {below70.map((player, index) => (
          <li key={index}>
            {player.name} - {player.score}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default ListofPlayers;
