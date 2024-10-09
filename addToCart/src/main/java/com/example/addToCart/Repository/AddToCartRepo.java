package com.example.addToCart.Repository;

import com.example.addToCart.Entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.UUID;

@Repository
public interface AddToCartRepo extends JpaRepository<Cart,Long> {
    Cart save(Cart cart);
    void delete(Cart cart);
    ArrayList<Cart> findByuserId(UUID userId);
    ArrayList<Cart> findAll();
}
