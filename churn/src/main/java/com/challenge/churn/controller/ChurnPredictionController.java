package com.challenge.churn.controller;

import com.challenge.churn.model.ChurnPrediction;
import com.challenge.churn.repo.ChurnPredictionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ChurnPredictionController {

    @Autowired
    private ChurnPredictionRepo churnPredictionRepo;

    @GetMapping(value = "/churn_prediction")
    public ResponseEntity<List<ChurnPrediction>> getChurnPredictions(){
        List<ChurnPrediction> churnPredictions = churnPredictionRepo.findAll();
        return ResponseEntity.ok(churnPredictions);
    }

    @GetMapping(value = "/churn_prediction/{id}")
    public ResponseEntity<?> getChurnPrediction(@PathVariable long id){
        ChurnPrediction churnPrediction = churnPredictionRepo.findById(id).orElse(null);
        if (churnPrediction != null) {
            return ResponseEntity.ok(churnPrediction);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping(value = "/churn_prediction/create")
    public ResponseEntity<?> saveChurnPrediction(@RequestBody ChurnPrediction churnPrediction){
        churnPredictionRepo.save(churnPrediction);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping(value = "/churn_prediction/update/{id}")
    public ResponseEntity<?> updateChurnPrediction(@PathVariable long id, @RequestBody ChurnPrediction churnPrediction){
        ChurnPrediction updatedChurnPrediction = churnPredictionRepo.findById(id).orElse(null);
        if (updatedChurnPrediction != null) {
            updatedChurnPrediction.setCliente(churnPrediction.getCliente());
            updatedChurnPrediction.setProbabilidadeChurn(churnPrediction.getProbabilidadeChurn());
            updatedChurnPrediction.setDataPredicao(churnPrediction.getDataPredicao());
            churnPredictionRepo.save(updatedChurnPrediction);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping(value = "/churn_prediction/delete/{id}")
    public ResponseEntity<?> deleteChurnPrediction(@PathVariable long id){
        ChurnPrediction deletedChurnPrediction = churnPredictionRepo.findById(id).orElse(null);
        if (deletedChurnPrediction != null) {
            churnPredictionRepo.delete(deletedChurnPrediction);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
