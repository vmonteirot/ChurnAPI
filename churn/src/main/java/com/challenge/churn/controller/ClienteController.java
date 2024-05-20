package com.challenge.churn.controller;

import com.challenge.churn.model.Cliente;
import com.challenge.churn.repo.ClienteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteController {

    @Autowired
    private ClienteRepo clienteRepo;

    @GetMapping(value = "/cliente")
    public List<Cliente> getClientes(){
        return clienteRepo.findAll();
    }

    @GetMapping(value = "/cliente/{id}")
    public Cliente getClientes(@PathVariable long id){
        return clienteRepo.findById(id).get();
    }

    @PostMapping(value = "/cliente/create")
    public void saveCliente(@RequestBody Cliente cliente){
        clienteRepo.save(cliente);
    }

    @PutMapping(value = "/cliente/update/{id}")
    public void updateCliente(@PathVariable long id, @RequestBody Cliente cliente){
        Cliente updatedCliente = clienteRepo.findById(id).get();
        updatedCliente.setNome(cliente.getNome());
        updatedCliente.setEmail(cliente.getEmail());
        updatedCliente.setEmpresa(cliente.getEmpresa());
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteCliente(@PathVariable long id){
        Cliente deletedCliente = clienteRepo.findById(id).get();
        clienteRepo.delete(deletedCliente);
    }
}
