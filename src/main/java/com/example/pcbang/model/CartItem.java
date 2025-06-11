package com.example.pcbang.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CartItem {
    private Long id;
    private String name;
    private int price;
    private int quantity;
}
