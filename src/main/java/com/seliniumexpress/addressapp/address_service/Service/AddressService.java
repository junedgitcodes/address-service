package com.seliniumexpress.addressapp.address_service.Service;

import com.seliniumexpress.addressapp.address_service.Entity.AddressResponse;
import com.seliniumexpress.addressapp.address_service.Model.Address;
import com.seliniumexpress.addressapp.address_service.Repository.AddressRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private ModelMapper modelMapper;

    public AddressResponse addAddress(Address add) {

        Address address = addressRepository.save(add);
        AddressResponse addressEntity = modelMapper.map(address, AddressResponse.class);
        return addressEntity;

    }

    public AddressResponse getAddress(Integer id) {
        Address address = addressRepository.findById(id).orElse(null);
        AddressResponse addressEntity = modelMapper.map(address, AddressResponse.class);
        return addressEntity;
    }

    public AddressResponse getAddressByEmpId(int empId){
        Address address = addressRepository.findAddressByEmpId(empId);
        return modelMapper.map(address,AddressResponse.class);
    }
}
