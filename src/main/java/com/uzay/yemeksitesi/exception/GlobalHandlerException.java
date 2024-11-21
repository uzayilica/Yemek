package com.uzay.yemeksitesi.exception;


import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

@ControllerAdvice
public class GlobalHandlerException {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
        ArrayList<Object> list = new ArrayList<>();
        ex.getBindingResult().getFieldErrors().forEach(error -> {
            HashMap<Object, Object> map = new HashMap<>();
            map.put("hata mesajı:", error.getDefaultMessage());
            map.put("hatalı alan:", error.getField());
            map.put("reddedilen değer:", error.getRejectedValue());
            map.put("hata kodu:", error.getCode());
            list.add(map);
        });
        return  ResponseEntity.ok(list);
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<?> handleDataIntegrityViolationException(DataIntegrityViolationException ex) {
        HataSinifi hataSinifi = HataSinifi
                .builder()
                .hataZamani(LocalDateTime.now())
                .hataMesaj("Bu Email zaten kullanılıyor")
                .hataliAlan("Email")
                .hataKodu("409 Conlift")
                .build();
        return ResponseEntity.status(HttpStatus.CONFLICT).body(hataSinifi);

    }

    @ExceptionHandler(YemekNotFoundException.class)
    public ResponseEntity<?> handleYemekNotFoundException(YemekNotFoundException ex) {
        HataSinifi hataSinifi = HataSinifi
                .builder()
                .hataZamani(LocalDateTime.now())
                .hataMesaj("Yemek Bulunamadı")
                .hataliAlan("Yemek Adı")
                .hataKodu("404 Not Found")
                .build();
        return ResponseEntity.status(HttpStatus.CONFLICT).body(hataSinifi);


    }


}
