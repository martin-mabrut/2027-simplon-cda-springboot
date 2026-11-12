package fr.simplon.domedespuys.Service;

import fr.simplon.domedespuys.Dto.AddressDTO;
import fr.simplon.domedespuys.Model.Address;
import fr.simplon.domedespuys.Service.Interfaces.IAddressService;

public class AddressServiceImpl implements IAddressService {

    @Override
    public Address create(AddressDTO dto) { return null; }

    @Override
    public Address update(String id, AddressDTO dto) { return null; }

    @Override
    public boolean delete(String id) { return false; }
}
