import React from 'react';
import './App.css';
import CourseDetails from './CourseDetails';
import BookDetails from './BookDetails';
import BlogDetails from './BlogDetails';

function App() {
  return (
    <div className="container">
      <div className="box"><CourseDetails /></div>
      <div className="box"><BookDetails /></div>
      <div className="box"><BlogDetails /></div>
    </div>
  );
}

export default App;
