package fr.simplon.domedespuys.Repository;

import fr.simplon.domedespuys.Model.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BrandRepository extends JpaRepository<Brand,Long> {
    List<Brand> findBrandBySlug(String slug);
}
