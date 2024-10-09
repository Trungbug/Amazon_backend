package com.example.addToCart.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id; // Sửa lại import đúng
import org.hibernate.annotations.Type;

import java.util.UUID;

@Entity(name = "Cart")
public class Cart {

    @Id
    @GeneratedValue
    public long id;

    @Column(name = "userId", updatable = false, nullable = false, columnDefinition = "VARCHAR(36)")
// Cách ánh xạ UUID chính xác
    public UUID userId;

    @Column(name = "productId", updatable = false, nullable = false, columnDefinition = "VARCHAR(36)")
  // Sửa lại đúng cú pháp cho UUID
    public UUID productId;

    public Cart() {
        super();
    }

    public Cart(long id, UUID userId, UUID productId) {
        super();
        this.id = id;
        this.userId = userId;
        this.productId = productId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public UUID getProductId() {
        return productId;
    }

    public void setProductId(UUID productId) {
        this.productId = productId;
    }
}
