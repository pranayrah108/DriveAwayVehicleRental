//import logo from './logo.svg';
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import { Routes, Route} from 'react-router-dom';
import HomePage from './components/HomePage';



function App() {
  return (
    <div>
      <h1 style={{"backgroundColor":"blue",color:"white","border":"2px solid red"}}>DriveAwayVehicleRentle</h1>

      <Routes>
        <Route path="/" element={<HomePage></HomePage>}></Route>
      </Routes>
    </div>
  );
}

export default App;
