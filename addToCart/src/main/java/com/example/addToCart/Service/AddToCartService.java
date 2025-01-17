package com.example.addToCart.Service;

import com.example.addToCart.Entity.Cart;
import com.example.addToCart.Entity.CartDetails;
import com.example.addToCart.Entity.Product;
import com.example.addToCart.Repository.AddToCartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;

@Service
public class AddToCartService {
    @Autowired
    AddToCartRepo addToCartRepo;


    @Autowired
    ProductDetailProxy productDetailsProxy;
    public void addItemTOCartService(Cart cart) {
        addToCartRepo.save(cart);
    }

    public void removeItemFromCartService(Cart cart) {
        addToCartRepo.delete(cart);
    }
    public ArrayList<Cart> getAll() {
        return addToCartRepo.findAll();
    }
    public CartDetails displayAllProductsInCart(UUID userId) {
        CartDetails cartDetails=new CartDetails();
        cartDetails.setUserId(userId);

        ArrayList<Cart> cartList = addToCartRepo.findByuserId(userId);
        ArrayList<Product> productList=new ArrayList<Product>();

        for(int i=0;i<cartList.size();i++) {
            Product product=productDetailsProxy.getProductById(cartList.get(i).getProductId());
            productList.add(product);
        }

        cartDetails.setList(productList);
        return cartDetails;

    }
}
