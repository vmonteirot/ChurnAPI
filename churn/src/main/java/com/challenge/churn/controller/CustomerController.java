package com.challenge.churn.controller;

import com.challenge.churn.model.Customer;
import com.challenge.churn.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepo customerRepo;

    @GetMapping(value = "/")
    public String getPage(){
        return "Welcome!";
    }

    @GetMapping(value = "/customer")
    public List<Customer> getCustomers(){
        return customerRepo.findAll();
    }

    @GetMapping(value = "/customer/{id}")
    public Customer getCustomers(@PathVariable long id){
        return customerRepo.findById(id).get();
    }

    @PostMapping(value = "/customer/create")
    public void saveCustomer(@RequestBody Customer customer){
        customerRepo.save(customer);
    }

    @PutMapping(value = "/customer/update/{id}")
    public void updateCustomer(@PathVariable long id, @RequestBody Customer customer){
        Customer updatedCustomer = customerRepo.findById(id).get();
        updatedCustomer.setNome(customer.getNome());
        updatedCustomer.setSetor(customer.getSetor());
        updatedCustomer.setTamanho(customer.getTamanho());
        updatedCustomer.setLocalizacao(customer.getLocalizacao());
        updatedCustomer.setDataContrato(customer.getDataContrato());
        updatedCustomer.setValorContrato(customer.getValorContrato());
        updatedCustomer.setInteracoes(customer.getInteracoes());
        updatedCustomer.setStatusChurn(customer.isStatusChurn());
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteCustomer(@PathVariable long id){
        Customer deletedCustomer = customerRepo.findById(id).get();
        customerRepo.delete(deletedCustomer);
    }
}
