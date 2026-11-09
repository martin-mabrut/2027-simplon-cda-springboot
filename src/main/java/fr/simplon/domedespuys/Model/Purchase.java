package fr.simplon.domedespuys.Model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20, unique = true, nullable = false)
    private String number;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private String status;

    @ManyToOne(optional = false)
    @JoinColumn(nullable = false)
    private User user;

    @ManyToOne(optional = false)
    @JoinColumn(nullable = false)
    private Address address;

    @OneToMany(mappedBy = "purchase")
    List<PurchaseProduct> purchasesProducts;

}
