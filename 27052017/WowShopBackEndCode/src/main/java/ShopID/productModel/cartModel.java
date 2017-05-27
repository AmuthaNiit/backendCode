package ShopID.productModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Cart")
public class cartModel {
	
	@Id
	@Column(name="cartId")
	private String cartId;
	@Column(name="userobj")
	private String userobj;
	@Column(name="productId")
	private String productId;
	@Column(name="supplierId")
	private String supplierId;
	@Column(name="price")
	private double price;
	@Column(name="quantity")
	private int quantity;
	public cartModel(String cartId, String userobj, String productId, String supplierId, double price, int quantity) {
		super();
		this.cartId = cartId;
		this.userobj = userobj;
		this.productId = productId;
		this.supplierId = supplierId;
		this.price = price;
		this.quantity = quantity;
	}
	public String getCartId() {
		return cartId;
	}
	public void setCartId(String cartId) {
		this.cartId = cartId;
	}
	public String getUserobj() {
		return userobj;
	}
	public void setUserobj(String userobj) {
		this.userobj = userobj;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
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

}
