package com.challenge.churn.controller;

import com.challenge.churn.model.Empresa;
import com.challenge.churn.repo.EmpresaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<?> getEmpresa(@PathVariable long id){
        Empresa empresa = empresaRepo.findById(id).orElse(null);
        if (empresa != null) {
            return ResponseEntity.ok(empresa);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping(value = "/empresa/create")
    public ResponseEntity<?> saveEmpresa(@RequestBody Empresa empresa){
        empresaRepo.save(empresa);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping(value = "/empresa/update/{id}")
    public ResponseEntity<?> updateEmpresa(@PathVariable long id, @RequestBody Empresa empresa){
        Empresa updatedEmpresa = empresaRepo.findById(id).orElse(null);
        if (updatedEmpresa != null) {
            updatedEmpresa.setNome(empresa.getNome());
            updatedEmpresa.setEndereco(empresa.getEndereco());
            empresaRepo.save(updatedEmpresa);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping(value = "/empresa/delete/{id}")
    public ResponseEntity<?> deleteEmpresa(@PathVariable long id){
        Empresa deletedEmpresa = empresaRepo.findById(id).orElse(null);
        if (deletedEmpresa != null) {
            empresaRepo.delete(deletedEmpresa);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
