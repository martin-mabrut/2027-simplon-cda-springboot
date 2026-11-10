package fr.simplon.domedespuys.Controller;

import com.fasterxml.jackson.annotation.JsonView;
import fr.simplon.domedespuys.Model.Purchase;
import fr.simplon.domedespuys.Repository.PurchaseRepository;
import fr.simplon.domedespuys.View.PurchaseView;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/api/purchase")
public class PurchaseRestController {

    private PurchaseRepository purchaseRepository;

    @GetMapping
    @JsonView(PurchaseView.PurchaseListView.class)
    public List<Purchase> getPurchases() { return this.purchaseRepository.findAll(); }

    @GetMapping("/{id}")
    @JsonView(PurchaseView.PurchaseDetailView.class)
    public Optional<Purchase> getPurchase(@PathVariable Long id){ return this.purchaseRepository.findById(id); }

    @GetMapping("/user/{user}")
    @JsonView(PurchaseView.PurchaseDetailView.class)
    public List<Purchase> getPurchasesByUser(@PathVariable String user){
        return this.purchaseRepository.findAllByUser(user);
    }

}
