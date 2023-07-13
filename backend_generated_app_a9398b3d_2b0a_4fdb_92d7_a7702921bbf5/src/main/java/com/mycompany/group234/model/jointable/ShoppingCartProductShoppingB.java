package com.mycompany.group234.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.mycompany.group234.model.ShoppingCart;
import com.mycompany.group234.model.Category;
import com.mycompany.group234.model.Product;

@Entity(name = "ShoppingCartProductShoppingB")
@Table(schema = "\"generated_app\"", name = "\"ShoppingCartProductShoppingB\"")
@Data
public class ShoppingCartProductShoppingB{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"CartId\"")
	private Integer cartId;

    
    @Column(name = "\"ProductId\"")
    private Long productId;
 
}