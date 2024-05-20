package com.challenge.churn.controller;

import com.challenge.churn.model.Empresa;
import com.challenge.churn.repo.EmpresaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpresaController {

    @Autowired
    private EmpresaRepo empresaRepo;

    @GetMapping(value = "/empresa")
    public List<Empresa> getEmpresas(){
        return empresaRepo.findAll();
    }

    @GetMapping(value = "/empresa/{id}")
    public Empresa getEmpresas(@PathVariable long id){
        return empresaRepo.findById(id).get();
    }

    @PostMapping(value = "/empresa/create")
    public void saveEmpresa(@RequestBody Empresa empresa){
        empresaRepo.save(empresa);
    }

    @PutMapping(value = "/empresa/update/{id}")
    public void updateEmpresa(@PathVariable long id, @RequestBody Empresa empresa){
        Empresa updatedEmpresa = empresaRepo.findById(id).get();
        updatedEmpresa.setNome(empresa.getNome());
        updatedEmpresa.setEndereco(empresa.getEndereco());
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteEmpresa(@PathVariable long id){
        Empresa deletedEmpresa = empresaRepo.findById(id).get();
        empresaRepo.delete(deletedEmpresa);
    }
}
