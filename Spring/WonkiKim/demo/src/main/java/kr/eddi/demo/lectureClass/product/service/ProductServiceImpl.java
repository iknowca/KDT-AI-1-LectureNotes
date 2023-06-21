package kr.eddi.demo.lectureClass.product.service;

import kr.eddi.demo.lectureClass.product.controller.form.ProductReqForm;
import kr.eddi.demo.lectureClass.product.entity.ProductEntity;
import kr.eddi.demo.lectureClass.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{
    final ProductRepository productRepository;
    @Override
    public List<ProductEntity> getProductList() {
        return productRepository.findAll();
    }

    @Override
    public ProductEntity writeProduct(ProductReqForm req) {
        return productRepository.save(req.toProduct());
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public void updateProduct(Long id, ProductReqForm req) {
        Optional<ProductEntity> maybeProduct = productRepository.findById(id);
        ProductEntity updatedProduct = req.updateProduct(maybeProduct.get());
        productRepository.save(updatedProduct);

    }
}
