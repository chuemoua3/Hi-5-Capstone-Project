import React from 'react';
 
import { NavLink } from 'react-router-dom';
 
const Navigation = () => {
    return (
       <div className="navlinks">
          <NavLink to="/">Home</NavLink>  
          
          <NavLink to="/about">Leaderboard</NavLink>  
          
          <NavLink to="/quiz">Quiz</NavLink>
       </div>
    );
}
 
export default Navigation;