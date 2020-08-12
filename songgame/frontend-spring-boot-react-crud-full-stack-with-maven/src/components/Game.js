import React from 'react';
 
const Game = () => {
    return (
       <div>
          

         <div className="gameContainer">
             <div className="options">
               <tr>
                  <th><h2>"Who let the dogs out..."</h2></th>
               </tr>
               <br></br>            
               <tr>
                  <th><button className="opt">option1</button></th>
                  <th><button className="opt">Option2</button></th>
               </tr>
               <br></br>
               <tr>  
                  <th><button className="opt">Option3</button></th>
                  <th><button className="opt">Option4</button></th>
               </tr>
             </div>
          </div>
       </div>
    );
}
 
export default Game;