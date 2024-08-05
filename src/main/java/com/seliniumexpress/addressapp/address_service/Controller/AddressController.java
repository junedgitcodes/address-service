package com.seliniumexpress.addressapp.address_service.Controller;

import com.seliniumexpress.addressapp.address_service.Entity.AddressResponse;
import com.seliniumexpress.addressapp.address_service.Model.Address;
import com.seliniumexpress.addressapp.address_service.Service.AddressService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping("/adsress")
    public AddressResponse addAddress(@RequestBody Address address) {

        return addressService.addAddress(address);
    }

//    @GetMapping("/address/{id}")
//    public ResponseEntity<AddressResponse> getAddress(@PathVariable int id) {
//        log.info("Getting Address by id");
//        AddressResponse addressEntity = addressService.getAddress(id);
//
//        return ResponseEntity.status(HttpStatus.OK).body(addressEntity);
//    }

    @GetMapping("/address/{employeeId}")
    public ResponseEntity<AddressResponse> getAddressByEmployeeId(@PathVariable("employeeId") int empId) {
        log.info("Getting Address by id");
        AddressResponse addressResponse = addressService.getAddressByEmpId(empId);

        return ResponseEntity.status(HttpStatus.OK).body(addressResponse);
    }
}
