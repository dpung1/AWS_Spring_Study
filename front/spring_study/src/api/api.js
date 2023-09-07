import axios from "axios"

const api = axios.create({ // 기본 베이스 (공통적)
    baseURL: "http://localhost:8080"
});

export default api;