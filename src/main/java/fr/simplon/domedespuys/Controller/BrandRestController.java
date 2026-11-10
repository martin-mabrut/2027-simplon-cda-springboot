package fr.simplon.domedespuys.Controller;

import com.fasterxml.jackson.annotation.JsonView;
import fr.simplon.domedespuys.Model.Brand;
import fr.simplon.domedespuys.Service.Interfaces.IBrandService;
import fr.simplon.domedespuys.View.BrandView;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/api/brand")
public class BrandRestController {

    private IBrandService brandService;

    @GetMapping
    @JsonView(BrandView.BrandListView.class)
    public List<Brand> getBrands() {
        return brandService.();
    }

    @GetMapping("/{id}")
    public Optional<Brand> getBrand(@PathVariable String id) {
        return brandRepository.findById(Long.valueOf(id));
    }

    @PostMapping
    JsonView
}
