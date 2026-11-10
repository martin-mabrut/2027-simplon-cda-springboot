package fr.simplon.domedespuys.Repository;

import fr.simplon.domedespuys.Model.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PurchaseRepository extends JpaRepository<Purchase,Long> {
    public List<Purchase> findAllByUser(@Param("user") String user);
}
