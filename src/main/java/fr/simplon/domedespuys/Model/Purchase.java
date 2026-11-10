package fr.simplon.domedespuys.Model;

import com.fasterxml.jackson.annotation.JsonView;
import fr.simplon.domedespuys.View.ProductView;
import fr.simplon.domedespuys.View.PurchaseView;
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
    @JsonView(PurchaseView.Id.class)
    private Long id;

    @Column(length = 20, unique = true, nullable = false)
    @JsonView(PurchaseView.Number.class)
    private String number;

    @Column(nullable = false)
    @JsonView(PurchaseView.CreatedAt.class)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    @JsonView(PurchaseView.Status.class)
    private String status;

    @ManyToOne(optional = false)
    @JoinColumn(nullable = false)
    @JsonView(PurchaseView.User.class)
    private User user;

    @ManyToOne(optional = false)
    @JoinColumn(nullable = false)
    @JsonView(PurchaseView.Address.class)
    private Address address;

    @OneToMany(mappedBy = "purchase")
    @JsonView(PurchaseView.PurchasesProducts.class)
    List<PurchaseProduct> purchasesProducts;

}
