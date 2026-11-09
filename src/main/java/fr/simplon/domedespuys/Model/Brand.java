package fr.simplon.domedespuys.Model;

import com.fasterxml.jackson.annotation.JsonView;
import fr.simplon.domedespuys.View.BrandView;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonView(BrandView.Id.class)
    private Long id;

    @Column(nullable = false, unique = true, length = 80)
    @JsonView(BrandView.Label.class)
    private String label;

    @Column(columnDefinition = "TEXT")
    @JsonView(BrandView.Logo.class)
    private String logo;

    @Column(nullable = false, unique = true)
    @JsonView(BrandView.Slug.class)
    private String slug;

    @OneToMany(mappedBy = "brand")
    @JsonView(BrandView.Products.class)
    List<Product> products;

}
