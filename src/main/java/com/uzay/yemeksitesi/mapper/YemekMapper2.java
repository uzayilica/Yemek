package com.uzay.yemeksitesi.mapper;

import com.uzay.yemeksitesi.dto.YemekRequestDto;
import com.uzay.yemeksitesi.dto.YemekResponseDto;
import com.uzay.yemeksitesi.entity.Yemek;
import org.springframework.stereotype.Component;

@Component
public class YemekMapper2 implements YemekMapperInterface {

    @Override
    public Yemek toYemek(YemekRequestDto yemekRequestDto) {
        return
                Yemek
                        .builder()
                        .foodName(yemekRequestDto.getFoodName())
                        .foodDescription(yemekRequestDto.getFoodDescription())
                        .foodPrice(yemekRequestDto.getFoodPrice())
                        .cookingTime(yemekRequestDto.getCookingTime())
                        .build();
    }

    @Override
    public YemekResponseDto toYemekResponseDto(Yemek yemek) {
       return YemekResponseDto
                .builder()
                .foodName(yemek.getFoodName())
                .foodDescription(yemek.getFoodDescription())
                .foodPrice(yemek.getFoodPrice())
                .cookingTime(yemek.getCookingTime())
                .build();
    }
}
