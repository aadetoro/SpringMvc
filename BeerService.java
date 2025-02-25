package com.example.myappdemo.Service;

import com.example.myappdemo.Model.Beer;
import com.example.myappdemo.Repository.BeerRepository;
import org.springframework.stereotype.Service;

@Service
public class BeerService {

    private final BeerRepository beerRepository;

    public BeerService(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    public String findBeerById(Long id) {
        return "Beer found with ID: " + id;
    }

    public Beer saveBeer(Beer beer) {
        return beer;
    }

    public Beer updateBeer(Long id, Beer beer) {
        return beer;
    }

    public void deleteBeer(Long id) {
        return;
    }
}

