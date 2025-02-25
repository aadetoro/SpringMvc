package com.example.myappdemo.Repository;

import com.example.myappdemo.Model.Beer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BeerRepository extends JpaRepository<Beer, Long> {
}

