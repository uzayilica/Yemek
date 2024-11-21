package com.uzay.yemeksitesi.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class YemekRequestDto {


    @NotBlank(message = "foodName alanı boş bırakılamaz")
    private String foodName;

    @NotBlank(message = "foodDescription boş bırakıalamaz")
    private String foodDescription;

    @Min(value = 0,message = "fiyat minimum 0 olmalıdır.")
    private Integer foodPrice;

    @Min(value = 0,message = "süre minimum 0 olmalıdır.")
    private Integer cookingTime;


    private String createdBy;


}
