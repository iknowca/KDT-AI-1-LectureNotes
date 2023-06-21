package kr.eddi.demo.lectureClass.product.repository;

import kr.eddi.demo.lectureClass.product.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
