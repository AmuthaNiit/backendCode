package ShopID.Model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Users")
public class userModel implements Serializable
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="UserId")
	@GeneratedValue
	private String Usid;
		
	@Column(name="userName")
	private String userName;
	
	@Column(name="pwd")
	private String pwd;
	
	@OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="cartId")
	private cartModel cart;
    
	@OneToMany(targetEntity=orderModel.class, mappedBy = "user", cascade = CascadeType.ALL)
	private Set<orderModel> orders;
    @Column(name="Role")private String role;

		
	public void setOrders(Set<orderModel> orders) {
		this.orders = orders;
	}
	

		public String getUsid() {
			return Usid;
		}

		public void setUsid(String usid) {
			Usid = usid;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getPwd() {
			return pwd;
		}

		public void setPwd(String pwd) {
			this.pwd = pwd;
		}

				public cartModel getCart() {
			return cart;
		}

		public void setCart(cartModel cart) {
			this.cart = cart;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public Set<orderModel> getOrders() {
			return orders;
		}

		public userModel(String usid, String userName, String pwd, cartModel cart,
				Set<orderModel> orders, String role) {
			super();
			Usid = usid;
			this.userName = userName;
			this.pwd = pwd;
			this.cart = cart;
			this.orders = orders;
			this.role = role;
		}
	



	

}
