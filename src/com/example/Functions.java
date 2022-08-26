package com.example;

public class Functions {
    public static void main(String[] args) {

        System.out.println(priceWithTaxes(30));
    }
    public static double priceWithTaxes (double price){
        return price + price * 0.21;
    }
}
