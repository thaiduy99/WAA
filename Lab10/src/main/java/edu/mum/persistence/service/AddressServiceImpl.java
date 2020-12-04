package edu.mum.persistence.service;

import edu.mum.persistence.domain.Address;
import edu.mum.persistence.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class AddressServiceImpl implements AddressService{
    @Autowired
    AddressRepository addressRepository;

    @Override
    public Address save(Address add) {
        return addressRepository.save(add);
    }

    @Override
    public List<Address> getAll() {
        Iterable<Address> itr = addressRepository.findAll();
        List<Address> list = new ArrayList<>();
        itr.forEach(address -> list.add(address));
        return list;
    }
}
