package com.ditgitalinnovation.experts.shoppingcarts.repository;

import com.ditgitalinnovation.experts.shoppingcarts.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository  extends CrudRepository <Cart, Integer> {
}
