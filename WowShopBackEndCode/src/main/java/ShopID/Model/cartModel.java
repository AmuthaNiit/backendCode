package ShopID.Model;
 
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity	
@Table(name="CartModel")
public class cartModel implements Serializable
{

	
	private static final long serialVersionUID = 1L;
	
	@Id
     private int cartid;
	//private int suplierid;
	//private int productid;
	//private int userid;
	private productModel productid;
	private supplierModel supplierId;
	private userModel userid;
	
	private double prices;
	private int quantity;
	private String status;
	
	@Id
	@GeneratedValue
	@Column(name="cartid")//defining the database column
	public int getCartid() {
		return cartid;
	}
	public void setCartid(int cartid) {
		this.cartid = cartid;
	}
	//In One productid display in cart
		@OneToOne
		@JoinColumn(name="productid")
		public productModel getProductid() {
			return productid;
		}
		public void setProductid(productModel productid) {
			this.productid = productid;
		}
		/*@OneToOne
		@JoinColumn(name="suplierid")
		public SupplierModel getSuplierid() {
			return suplierid;
		}
		public void setSuplierid(SupplierModel suplierid) {
			this.suplierid = suplierid;
		}*/
		/*@OneToOne
		@JoinColumn(name="userid")
		public UserModel getUserid() {
			return userid;
		}
		public void setUserid(UserModel userid) {
			this.userid = userid;
		}*/
	@Column(name="prices")
	public double getPrices() {
		return prices;
	}
	public void setPrices(double prices) {
		this.prices = prices;
	}
	@Column(name="quantity")
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	/*@Column(name="status")
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}*/
	
}




