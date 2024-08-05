package com.seliniumexpress.addressapp.address_service.AddressConfiguration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AddressConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
