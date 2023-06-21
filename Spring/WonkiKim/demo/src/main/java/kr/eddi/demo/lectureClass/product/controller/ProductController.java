package kr.eddi.demo.lectureClass.product.controller;

import kr.eddi.demo.lectureClass.product.controller.form.ProductReqForm;
import kr.eddi.demo.lectureClass.product.entity.ProductEntity;
import kr.eddi.demo.lectureClass.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/product")
@Slf4j
@RequiredArgsConstructor
@RestController
public class ProductController {
    final ProductService productService;

    @GetMapping("/products")
    public List<ProductEntity> getProductList() {
        return productService.getProductList();
    }

    @PostMapping("/product")
    public ProductEntity writeProduct(@RequestBody ProductReqForm req) {
        return productService.writeProduct(req);
    }

    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }

    @PutMapping("/product/{id}")
    public void updateProduct(@PathVariable Long id, @RequestBody ProductReqForm req) {
        productService.updateProduct(id, req);
    }
}
