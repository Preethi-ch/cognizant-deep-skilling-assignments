import React from 'react';
import styles from './CohortDetails.module.css'; 

function CohortDetails({ cohort }) {
  
  const headingColor =
    cohort.currentStatus.toLowerCase() === 'ongoing'
      ? 'green'
      : cohort.currentStatus.toLowerCase() === 'scheduled'
      ? 'blue'
      : 'black';

  return (
    <div className={styles.box}>
      <h3 style={{ color: headingColor }}>
        {cohort.cohortCode} - {cohort.technology}
      </h3>
      <dl>
        <dt>Started On</dt>
        <dd>{cohort.startDate}</dd>
        <dt>Current Status</dt>
        <dd>{cohort.currentStatus}</dd>
        <dt>Coach</dt>
        <dd>{cohort.coachName}</dd>
        <dt>Trainer</dt>
        <dd>{cohort.trainerName}</dd>
      </dl>
    </div>
  );
}

export default CohortDetails;
