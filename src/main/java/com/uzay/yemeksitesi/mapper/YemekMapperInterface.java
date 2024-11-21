package com.uzay.yemeksitesi.mapper;

import com.uzay.yemeksitesi.dto.YemekRequestDto;
import com.uzay.yemeksitesi.dto.YemekResponseDto;
import com.uzay.yemeksitesi.entity.Yemek;

public interface YemekMapperInterface {
    Yemek toYemek(YemekRequestDto yemekRequestDto);
    YemekResponseDto toYemekResponseDto(Yemek yemek);


}
