package com.challenge.churn.controller;

import com.challenge.churn.model.Transacao;
import com.challenge.churn.repo.TransacaoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TransacaoController {

    @Autowired
    private TransacaoRepo transacaoRepo;

    @GetMapping(value = "/transacao")
    public ResponseEntity<List<Transacao>> getTransacoes(){
        List<Transacao> transacoes = transacaoRepo.findAll();
        return ResponseEntity.ok(transacoes);
    }

    @GetMapping(value = "/transacao/{id}")
    public ResponseEntity<?> getTransacao(@PathVariable long id){
        Transacao transacao = transacaoRepo.findById(id).orElse(null);
        if (transacao != null) {
            return ResponseEntity.ok(transacao);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping(value = "/transacao/create")
    public ResponseEntity<?> saveTransacao(@RequestBody Transacao transacao){
        transacaoRepo.save(transacao);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping(value = "/transacao/update/{id}")
    public ResponseEntity<?> updateTransacao(@PathVariable long id, @RequestBody Transacao transacao){
        Transacao updatedTransacao = transacaoRepo.findById(id).orElse(null);
        if (updatedTransacao != null) {
            updatedTransacao.setCliente(transacao.getCliente());
            updatedTransacao.setValor(transacao.getValor());
            updatedTransacao.setData(transacao.getData());
            transacaoRepo.save(updatedTransacao);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping(value = "/transacao/delete/{id}")
    public ResponseEntity<?> deleteTransacao(@PathVariable long id){
        Transacao deletedTransacao = transacaoRepo.findById(id).orElse(null);
        if (deletedTransacao != null) {
            transacaoRepo.delete(deletedTransacao);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
