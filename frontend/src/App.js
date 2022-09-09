import './App.css';
import Header from './components/Header/Header';
import { MainScreen } from './screens/MainScreen/MainScreen';
import Footer from './components/Footer/Footer';

function App() {
  return (
    <div className="App">
      <Header />
      <MainScreen />
      <Footer />
    </div>
  );
}

export default App;
