package com.seliniumexpress.addressapp.address_service.Entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
public class AddressResponse {
    private int id;
    private String lane1;
    private String lane2;
    private String state;
    private String zip;

}
