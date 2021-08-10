package com.ditgitalinnovation.experts.shoppingcarts.controller;

import com.ditgitalinnovation.experts.shoppingcarts.model.Cart;
import com.ditgitalinnovation.experts.shoppingcarts.model.Item;
import com.ditgitalinnovation.experts.shoppingcarts.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/cart")
public class CartController {

    @Autowired
    private CartRepository cartRepository;

    @PostMapping(value = "/{id}")
    public Cart addItem(@PathVariable Integer id, @RequestBody Item item){
        Optional<Cart> savedCart = cartRepository.findById(id);
        Cart cart;
        if(savedCart.equals(Optional.empty())){
            cart = new Cart(id);
        }else{
            cart = savedCart.get();
        }
        cart.getItems().add(item);
        return cartRepository.save(cart);
    }

    @GetMapping(value = "/{id}")
    public Optional<Cart> findById(@PathVariable Integer id){
        return cartRepository.findById(id);
    }

    @DeleteMapping(value = "/{id}")
    public void clear(@PathVariable("id") Integer id){
        cartRepository.deleteById(id);
    }

}
