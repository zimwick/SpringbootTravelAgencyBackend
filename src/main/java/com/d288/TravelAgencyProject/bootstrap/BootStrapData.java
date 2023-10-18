package com.d288.TravelAgencyProject.bootstrap;

import com.d288.TravelAgencyProject.dao.CustomerRepository;
import com.d288.TravelAgencyProject.dao.DivisionRepository;
import com.d288.TravelAgencyProject.entities.Customer;
import com.d288.TravelAgencyProject.entities.Division;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;
    private final DivisionRepository divisionRepository;

    public BootStrapData(CustomerRepository customerRepository, DivisionRepository divisionRepository) {
        this.customerRepository = customerRepository;
        this.divisionRepository = divisionRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        boolean customer1Exists = customerRepository.existsById(2L);

        if (!customer1Exists) {
            Customer customer1 = new Customer();
            customer1.setId(2L);
            customer1.setFirstName("John");
            customer1.setLastName("Snow");
            customer1.setAddress("625 North King St");
            customer1.setPostal_code("55387");
            customer1.setPhone("777-555-2274");
            customer1.setDivision(divisionRepository.getReferenceById(14L));
            customerRepository.save(customer1);
        }

        boolean customer2Exists = customerRepository.existsById(3L);
        if (!customer2Exists) {
            Customer customer2 = new Customer();
            customer2.setId(3L);
            customer2.setFirstName("Michael");
            customer2.setLastName("Scott");
            customer2.setAddress("2500 Dundee Way");
            customer2.setPostal_code("43057");
            customer2.setPhone("111-111-1111");
            customer2.setDivision(divisionRepository.getReferenceById(11L));
            customerRepository.save(customer2);
        }

        boolean customer3Exists = customerRepository.existsById(4L);
        if (!customer3Exists) {
            Customer customer3 = new Customer();
            customer3.setId(4L);
            customer3.setFirstName("Austin");
            customer3.setLastName("Powers");
            customer3.setAddress("4276 Shaggadelic Drive");
            customer3.setPostal_code("77043");
            customer3.setPhone("345-975-8636");
            customer3.setDivision(divisionRepository.getReferenceById(27L));
            customerRepository.save(customer3);
        }

        boolean customer4Exists = customerRepository.existsById(5L);
        if (!customer4Exists) {
            Customer customer4 = new Customer();
            customer4.setId(5L);
            customer4.setFirstName("Scooby");
            customer4.setLastName("Doo");
            customer4.setAddress("3210 Ruh-oh Corner");
            customer4.setPostal_code("88356");
            customer4.setPhone("397-473-5837");
            customer4.setDivision(divisionRepository.getReferenceById(30L));
            customerRepository.save(customer4);
        }

        boolean customer5Exists = customerRepository.existsById(6L);
        if (!customer5Exists) {
            Customer customer5 = new Customer();
            customer5.setId(6L);
            customer5.setFirstName("Peter");
            customer5.setLastName("Parker");
            customer5.setAddress("542 Corner Apt 15");
            customer5.setPostal_code("90345");
            customer5.setPhone("609-357-7846");
            customer5.setDivision(divisionRepository.getReferenceById(31L));
            customerRepository.save(customer5);

        }

    }
}
