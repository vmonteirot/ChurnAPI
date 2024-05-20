package com.challenge.churn.controller;

import com.challenge.churn.model.Transacao;
import com.challenge.churn.repo.TransacaoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TransacaoController {

    @Autowired
    private TransacaoRepo transacaoRepo;

    @GetMapping(value = "/transacao")
    public List<Transacao> getTransacoes(){
        return transacaoRepo.findAll();
    }

    @GetMapping(value = "/transacao/{id}")
    public Transacao getTransacoes(@PathVariable long id){
        return transacaoRepo.findById(id).get();
    }

    @PostMapping(value = "/transacao/create")
    public void saveTransacao(@RequestBody Transacao transacao){
        transacaoRepo.save(transacao);
    }

    @PutMapping(value = "/transacao/update/{id}")
    public void updateTransacao(@PathVariable long id, @RequestBody Transacao transacao){
        Transacao updatedTransacao = transacaoRepo.findById(id).get();
        updatedTransacao.setCliente(transacao.getCliente());
        updatedTransacao.setValor(transacao.getValor());
        updatedTransacao.setData(transacao.getData());
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteTransacao(@PathVariable long id){
        Transacao deletedTransacao = transacaoRepo.findById(id).get();
        transacaoRepo.delete(deletedTransacao);
    }
}
