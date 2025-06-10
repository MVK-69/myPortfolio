import { useEffect, useState } from 'react';
import { getGreeting } from '../services/api';
import reactLogo from '../assets/react.svg';

const Home = () => {
    const[message, setMessage] = useState('');

    useEffect(() => {
        getGreeting().then((data) => setMessage(data.message))
        .catch((err) => {
            console.error('API call failed:', err);
            setMessage('Error fetching message');
        });
    }, []);

    return(
        <div>
            <h1>PortFolio MVK is LIVE!!</h1>
            <img src={reactLogo} alt="reactLogo" width={100} />
            <p>Message from backend: {message}</p>
        </div>
    );
};

export default Home;