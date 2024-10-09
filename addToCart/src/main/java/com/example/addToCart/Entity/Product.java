package com.example.addToCart.Entity;

import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;
import java.util.UUID;

public class Product {


    @Getter
    @Setter
    public BigInteger id;

    public UUID productID;
    public String name;
    public double price;
    public double rating;
    public String imageURL;
}
