import React from 'react';
import '../Stylesheets/mystyle.css';

function CalculateScore() {
  const name = 'Preethi';
  const school = 'ABC Public School';
  const total = 450;
  const goal = 500;
  const average = (total / goal) * 100;

  return (
    <div className="container">
      <h2>Student Score Calculator</h2>
      <p><strong>Name:</strong> {name}</p>
      <p><strong>School:</strong> {school}</p>
      <p><strong>Total Marks:</strong> {total}</p>
  
      <p><strong>Average Score:</strong> {average.toFixed(2)}%</p>
    </div>
  );
}

export default CalculateScore;
