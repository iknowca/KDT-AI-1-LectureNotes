import React from "react";

import "./index.css";
import { Routes, Route } from "react-router-dom";
import ProductListPage from "./components/ProductListPage";
import ProductRegisterPage from "./components/ProductRegisterPage"
const App = () => {
  return (
    <div>
      <Routes>
        <Route element={<ProductListPage/>} path="/" exact></Route>
        <Route element={<ProductRegisterPage/>} path="/register"></Route>
        {/*<Route element={<BoardReadPage/>} path="/read/:boardId"></Route>*/}
        {/*<Route element={<BoardModifyPage/>} path="/modify/:boardId"></Route>*/}
      </Routes>
    </div>
  )
};

export { App }
