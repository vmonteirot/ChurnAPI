package com.challenge.churn.controller;

import com.challenge.churn.model.ChurnPrediction;
import com.challenge.churn.repo.ChurnPredctionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ChurnPredictionController {

    @Autowired
    private ChurnPredctionRepo churnPredictionRepo;

    @GetMapping(value = "/churn_prediction")
    public List<ChurnPrediction> getChurnPredictions(){
        return churnPredictionRepo.findAll();
    }

    @GetMapping(value = "/churn_prediction/{id}")
    public ChurnPrediction getChurnPredictions(@PathVariable long id){
        return churnPredictionRepo.findById(id).get();
    }

    @PostMapping(value = "/churn_prediction/create")
    public void saveChurnPrediction(@RequestBody ChurnPrediction churnPrediction){
        churnPredictionRepo.save(churnPrediction);
    }

    @PutMapping(value = "/churn_prediction/update/{id}")
    public void updateChurnPrediction(@PathVariable long id, @RequestBody ChurnPrediction churnPrediction){
        ChurnPrediction updatedChurnPrediction = ChurnPredctionRepo.findById(id).get();
        updatedChurnPrediction.setCliente(churnPrediction.getCliente());
        updatedChurnPrediction.setProbabilidadeChurn(churnPrediction.getProbabilidadeChurn());
        updatedChurnPrediction.setDataPredicao(churnPrediction.getDataPredicao());
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteChurnPrediction(@PathVariable long id){
        ChurnPrediction deletedChurnPrediction = churnPredictionRepo.findById(id).get();
        churnPredictionRepo.delete(deletedChurnPrediction);
    }
}
