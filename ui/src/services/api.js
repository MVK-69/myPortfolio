import axios from 'axios';

export const getGreeting = async () => {
    const res = await axios.get('http://localhost:8080/api/greeting');
    return res.data;
};