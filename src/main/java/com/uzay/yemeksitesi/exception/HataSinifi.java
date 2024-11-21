package com.uzay.yemeksitesi.exception;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HataSinifi {

    private String hataMesaj;

    private LocalDateTime hataZamani;

    private String hataKodu;

    private String hataliAlan;



}