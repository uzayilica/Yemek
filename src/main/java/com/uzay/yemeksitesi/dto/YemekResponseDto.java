package com.uzay.yemeksitesi.dto;

import jakarta.persistence.Column;
import lombok.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class YemekResponseDto {

    private Integer id;

    private String foodName;

    private String foodDescription;

    private Integer foodPrice;

    private Integer cookingTime;








}
