package fr.simplon.domedespuys.Repository;

import fr.simplon.domedespuys.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    public List<Product> findAllByPurchase(@Param("purchase") String purchase);
}
