package com.uzay.yemeksitesi.exception;

public class YemekNotFoundException  extends RuntimeException{
    public YemekNotFoundException(String message){
        super(message);
    }
}
