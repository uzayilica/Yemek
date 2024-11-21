package com.uzay.yemeksitesi.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "yemek",uniqueConstraints = {
        @UniqueConstraint(name = "foodName",columnNames = "foodName")
})
public class Yemek extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(unique = true)
    private String foodName;

    @Column(nullable = false)
    private String foodDescription;


    private Integer foodPrice;

    private Integer cookingTime;



    //? Kategori Eklenecek




}
