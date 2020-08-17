import React from 'react';
// import PropTypes from 'prop-types';

// import { CSSTransitionGroup } from 'react-transition-group';

function Result(props) {
  console.log(props)
  return (
    // <CSSTransitionGroup
    //   className="container result"
    //   component="div"
    //   transitionName="fade"
    //   transitionEnterTimeout={800}
    //   transitionLeaveTimeout={500}
    //   transitionAppear
    //   transitionAppearTimeout={500}
    // >
      <div>
          <div>
        You prefer <strong>{props.result}</strong>!
        </div>
      </div>
    // </CSSTransitionGroup>
  );
}

// Result.propTypes = {
//   result: PropTypes.string.isRequired
// };

export default Result;