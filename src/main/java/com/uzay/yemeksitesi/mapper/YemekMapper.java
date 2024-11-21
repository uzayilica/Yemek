package com.uzay.yemeksitesi.mapper;

import com.uzay.yemeksitesi.dto.YemekRequestDto;
import com.uzay.yemeksitesi.dto.YemekResponseDto;
import com.uzay.yemeksitesi.entity.Yemek;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface YemekMapper {
    YemekMapper INSTANCE = Mappers.getMapper(YemekMapper.class);

    Yemek toYemek(YemekRequestDto yemekRequestDto);
    YemekResponseDto toYemekResponseDto(Yemek yemek);



}


