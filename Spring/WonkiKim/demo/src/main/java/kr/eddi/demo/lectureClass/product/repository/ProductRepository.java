package kr.eddi.demo.lectureClass.product.repository;

import kr.eddi.demo.lectureClass.product.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
