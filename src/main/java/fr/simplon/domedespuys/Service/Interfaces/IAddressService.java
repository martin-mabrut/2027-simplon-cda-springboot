package fr.simplon.domedespuys.Service.Interfaces;

import fr.simplon.domedespuys.Dto.AddressDTO;
import fr.simplon.domedespuys.Model.Address;

public interface IAddressService extends
        ICreate<Address, AddressDTO>,
        IUpdate<Address, AddressDTO>,
        IDelete
{
}
