package ShopID.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="cartModel")
public class cartModel {
	
	

	@Id
	@Column(name="cartId")
	private String cartId;
	
	@Column(name="price")
	private double price;
	@Column(name="quantity")
	private int quantity;
	
	@ManyToOne
    @JoinColumn(name="supplierId")
	private supplierModel supplier;
	
	@ManyToOne
    @JoinColumn(name="productId")
	private productModel product;
	
	public cartModel(String cartId,double price, int quantity) {
		super();
		this.cartId = cartId;
		this.price = price;
		this.quantity = quantity;
	}
	public String getCartId() {
		return cartId;
	}

	public void setCartId(String cartId) {
		this.cartId = cartId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public supplierModel getSupplier() {
		return supplier;
	}

	public void setSupplier(supplierModel supplier) {
		this.supplier = supplier;
	}

	public productModel getProduct() {
		return product;
	}

	public void setProduct(productModel product) {
		this.product = product;
	}

	
	
}
