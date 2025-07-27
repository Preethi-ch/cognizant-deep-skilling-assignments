import './App.css';
import { CohortsData } from './Cohort';
import CohortDetails from './CohortDetails';
import styles from './CohortDetails.module.css'; 


function App() {
  return (
    <div className="App" style={{ padding: '20px' }}>
      <h1 style={{ fontWeight: 'bold' }}>Cohorts Details</h1>

      {}
      <div className={styles.container}>
        {CohortsData.map((cohort, index) => (
          <CohortDetails key={index} cohort={cohort} />
        ))}
      </div>
    </div>
  );
}

export default App;
