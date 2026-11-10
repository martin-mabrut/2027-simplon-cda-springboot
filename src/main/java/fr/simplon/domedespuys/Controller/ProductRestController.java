package fr.simplon.domedespuys.Controller;

import com.fasterxml.jackson.annotation.JsonView;
import fr.simplon.domedespuys.Model.Brand;
import fr.simplon.domedespuys.Model.Product;
import fr.simplon.domedespuys.Model.Purchase;
import fr.simplon.domedespuys.Repository.ProductRepository;
import fr.simplon.domedespuys.Repository.PurchaseRepository;
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

    private ProductRepository productRepository;

    @GetMapping
    @JsonView(ProductView.ProductListView.class)
    public List<Product> getProducts() { return this.productRepository.findAll(); }

    @GetMapping("/{id}")
    public Optional<Product> getProduct(@PathVariable("id") Long id) {return this.productRepository.findById(id); }

    @GetMapping("/purchase/{purchase}")
    public List<Product> getProductsByPurchase(@PathVariable String purchase) {
        return this.productRepository.findAllByPurchase(purchase);
    }
}
