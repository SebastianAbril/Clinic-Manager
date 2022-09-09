import './MainScreen.css';
import { useState, useEffect } from 'react';
import DataTable from '../../components/DataTable/DataTable';

export const MainScreen = () => {
  const URL = 'http://localhost:8080/patient';
  const [items, setItems] = useState([]);

  const getDataItems = () => {
    fetch(URL)
      .then((response) => response.json())
      .then((data) => setItems(data));
  };

  useEffect(() => {
    getDataItems();
  }, []);
  console.log(items);

  return (
    <div className="MainScreen">
      <div>Welcome to Clinic Manager</div> <DataTable data={items} />
    </div>
  );
};
