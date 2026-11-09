package fr.simplon.domedespuys.Repository;

import fr.simplon.domedespuys.Model.Address;
import fr.simplon.domedespuys.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends JpaRepository<Address,Long> {
    public List<Address> findAllByUser(User user);
}
