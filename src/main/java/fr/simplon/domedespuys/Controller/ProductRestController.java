package fr.simplon.domedespuys.Controller;

import com.fasterxml.jackson.annotation.JsonView;
import fr.simplon.domedespuys.Model.Brand;
import fr.simplon.domedespuys.Model.Product;
import fr.simplon.domedespuys.Repository.BrandRepository;
import fr.simplon.domedespuys.Repository.ProductRepository;
import fr.simplon.domedespuys.View.BrandView;
import fr.simplon.domedespuys.View.ProductView;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/api/product")
public class ProductRestController {

    private final ProductRepository productRepository;

    @GetMapping
    @JsonView(ProductView.ProductListView.class)
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @GetMapping("/slug/{slug}")
    @JsonView(ProductView.ProductDetailView.class)
    public Optional<Product> getBrandBySlug(@PathVariable String slug) {
        return productRepository.findBySlug(slug);
    }

    @GetMapping("/{id}")
    @JsonView(ProductView.ProductDetailView.class)
    public Optional<Product> getBrandById(@PathVariable String id) {
        return productRepository.findById(Long.valueOf(id));
    }

}
