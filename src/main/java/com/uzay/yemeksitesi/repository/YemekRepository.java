package com.uzay.yemeksitesi.repository;

import com.uzay.yemeksitesi.entity.Yemek;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface YemekRepository extends JpaRepository<Yemek, Integer> {

    Optional<Yemek> findByFoodName(String foodName);



}
