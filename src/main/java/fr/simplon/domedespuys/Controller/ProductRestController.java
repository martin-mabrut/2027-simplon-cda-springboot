package fr.simplon.domedespuys.Controller;

import com.fasterxml.jackson.annotation.JsonView;
import fr.simplon.domedespuys.Dto.ProductDTO;
import fr.simplon.domedespuys.Model.Brand;
import fr.simplon.domedespuys.Model.Product;
import fr.simplon.domedespuys.Repository.BrandRepository;
import fr.simplon.domedespuys.Repository.ProductRepository;
import fr.simplon.domedespuys.Service.ProductServiceImpl;
import fr.simplon.domedespuys.View.BrandView;
import fr.simplon.domedespuys.View.ProductView;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/api/product")
public class ProductRestController {

    private final ProductServiceImpl productService;

    /*@GetMapping
    @JsonView(ProductView.ProductListView.class)
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @GetMapping("/slug/{slug}")
    @JsonView(ProductView.ProductDetailView.class)
    public Optional<Product> getBrandBySlug(@PathVariable String slug) {
        return productRepository.findBySlug(slug);
    }*/

    @GetMapping("/{id}")
    @JsonView(ProductView.ProductDetailView.class)
    public Product getProductById(@PathVariable String id) {
        return productService.getById(id);
    }

    @PostMapping
    @JsonView(ProductView.ProductDetailView.class)
    public Product createProduct(@RequestBody ProductDTO productDto) {
        return productService.create(productDto);
    }

    @PutMapping("/{id}")
    @JsonView(ProductView.ProductDetailView.class)
    public Product updateProduct(@PathVariable String id, @RequestBody ProductDTO productDto) {
        return productService.update(id,  productDto);
    }

}
