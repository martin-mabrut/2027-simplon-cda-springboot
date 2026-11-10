package fr.simplon.domedespuys.Model;

import com.fasterxml.jackson.annotation.JsonView;
import fr.simplon.domedespuys.View.ProductView;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonView(ProductView.Id.class)
    private Long id;

    @Column(nullable = false, length = 80)
    @JsonView(ProductView.Label.class)
    private String label;

    @Column(columnDefinition = "TEXT")
    @JsonView(ProductView.Description.class)
    private String description;

    @Column(nullable = false)
    @JsonView(ProductView.Price.class)
    private Long price;

    @Column(nullable = false, unique = true)
    @JsonView(ProductView.Slug.class)
    private String slug;

    @Column(nullable = false, length = 80)
    @JsonView(ProductView.CreatedAt.class)
    private LocalDateTime createdAt;

    @ManyToOne(optional = false)
    @JoinColumn(nullable = false)
    @JsonView(ProductView.Brand.class)
    private Brand brand;

    @OneToMany(mappedBy = "product")
    @JsonView(ProductView.Images.class)
    List<Image> images = new ArrayList<>();

    public void addImage(Image image) {
        this.images.add(image);
        image.setProduct(this);
    }

    @JsonView(ProductView.MainImage.class)
    public Image getMainImage() {
        for (Image image : images) {
            if (image.isDefault()) {
                return image;
            }
        }
        return null;
    }
}
