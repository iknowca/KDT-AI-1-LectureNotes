import axios from "axios"

export const fetchProductList = () => axios.get("http://localhost:7777/products")
