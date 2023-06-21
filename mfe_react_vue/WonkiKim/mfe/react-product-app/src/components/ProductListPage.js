import {useState} from "react";
import * as axiosClient from "../utility/axios"
import {Link} from "react-router-dom";
const ProductListPage = () => {

  const [Products, setProducts] = useState([])
  const listBoard = async () => {
    try {
      const response = await axiosClient.fetchProductList()

      setProducts(response.data)
      console.log(Products)
    } catch (e){
      throw e
    }

  }
  return (
    <div>
      <Link to="/register">글쓰기</Link>

      <table>
        <tbody>
        {Products.map((product)=>
          (
            <p key={product.id}>product.productName</p>
          )
        )}
        </tbody>
      </table>
    </div>
  )
}

export default ProductListPage