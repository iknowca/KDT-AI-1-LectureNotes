package kr.eddi.demo.lectureClass.product.service;

import kr.eddi.demo.lectureClass.product.controller.form.ProductReqForm;
import kr.eddi.demo.lectureClass.product.entity.ProductEntity;

import java.util.List;

public interface ProductService {
    List<ProductEntity> getProductList();

    ProductEntity writeProduct(ProductReqForm req);

    void deleteProduct(Long id);

    void updateProduct(Long id, ProductReqForm req);
}
