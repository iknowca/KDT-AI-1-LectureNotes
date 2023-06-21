package kr.eddi.demo.lectureClass.product.controller.form;

import kr.eddi.demo.lectureClass.product.entity.ProductEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ProductReqForm {
    private String productName;
    private Integer productPrice;

    public ProductEntity toProduct() {
        return new ProductEntity(productName, productPrice);
    }

    public ProductEntity updateProduct(ProductEntity product) {
        product.setProductName(productName);
        product.setProductPrice(productPrice);
        return product;
    }
}
