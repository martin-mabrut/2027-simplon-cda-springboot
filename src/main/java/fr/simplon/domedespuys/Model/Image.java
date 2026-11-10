package fr.simplon.domedespuys.Model;

import com.fasterxml.jackson.annotation.JsonView;
import fr.simplon.domedespuys.View.ImageView;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonView(ImageView.Id.class)
    private Long id;

    @Column(nullable = false, columnDefinition = "TEXT")
    @JsonView(ImageView.Path.class)
    private String path;

    @Column(nullable = false, length = 10)
    @JsonView(ImageView.Extension.class)
    private String extension;

    @Column(nullable = false)
    @JsonView(ImageView.IsDefault.class)
    private boolean isDefault;

    @ManyToOne(optional = false)
    @JoinColumn(nullable = false)
    private Product product;
}
