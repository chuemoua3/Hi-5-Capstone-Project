import React from 'react';
import { Button } from 'react-bootstrap';
 
const home = () => {
    return (
        
       <div>
           <div>
            <hr></hr>
           <img className="logosize" src="guessthatsong6.png" alt="guess that song"></img>
            <h1 className = "h1">Home</h1>
           <p className = "p">Home page body content</p>
           <Button variant="danger" className="mr-2">Play</Button>
           <hr></hr>
            {/* <a href="youtube.com" class="btn btn-info btn-lg">
                <span class="glyphicon glyphicon-play"></span> Play
            </a> */}
            <hr></hr>
            </div>
       </div>
    );
}
 
export default home;