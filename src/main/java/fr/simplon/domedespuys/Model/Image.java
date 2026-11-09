package fr.simplon.domedespuys.Model;

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
    private Long id;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String path;

    @Column(nullable = false, length = 10)
    private String extension;

    @Column(nullable = false)
    private boolean isDefault;

    @ManyToOne(optional = false)
    @JoinColumn(nullable = false)
    private Product product;
}
