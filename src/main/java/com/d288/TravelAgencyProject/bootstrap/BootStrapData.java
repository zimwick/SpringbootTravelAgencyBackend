package com.d288.TravelAgencyProject.bootstrap;

import com.d288.TravelAgencyProject.dao.CustomerRepository;
import com.d288.TravelAgencyProject.dao.DivisionRepository;
import com.d288.TravelAgencyProject.entities.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;
    private final DivisionRepository divisionRepository;

    public BootStrapData(CustomerRepository customerRepository, DivisionRepository divisionRepository){
        this.customerRepository = customerRepository;
        this.divisionRepository = divisionRepository;
    }

    @Override
    public void run(String... args) throws Exception{

        Customer customer1 = new Customer();
        customer1.setFirstName("John");
        customer1.setLastName("Snow");
        customer1.setAddress("625 North King St");
        customer1.setPostal_code("55387");
        customer1.setPhone("777-555-2274");
        customer1.setDivision(5L);
    }

}
