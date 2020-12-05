package edu.mum.persistence.service;

import edu.mum.persistence.domain.Address;

import java.util.List;

public interface AddressService {
    public Address save(Address add);
    public List<Address> getAll();
}
