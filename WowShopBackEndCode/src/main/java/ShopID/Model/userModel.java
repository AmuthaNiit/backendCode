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
@Table(name = "userModel")
public class userModel implements Serializable
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	

	@Id
	@GeneratedValue
	 @Column(name="UsId")
	private int usid;
	@Column(name="usermail")
	private String usermail;
		
	@Column(name="userName")
	private String userName;
	
	@Column(name="age")
	private int age;
	
	public int getAge() {
		return age;
	}


	public void setAge(int u_age) {
		this.age = u_age;
	}
	public userModel() {
		super();
	}

	@Column(name="pwd")
	private String pwd;
	
	@Column(name="address")
	private String address;
	
	

	public String getUsermail() {
		return usermail;
	}


	public void setUsermail(String usermail) {
		this.usermail = usermail;
	}


	public void setUsid(int usid) {
		this.usid = usid;
	}

	@Column(name="phonenumber")
	private String phonenumber;
	@Column(name="city")
	private String city;
	
	@OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="cartId")
	private cartModel cartId;
    
	@OneToMany(targetEntity=orderModel.class, mappedBy = "user", cascade = CascadeType.ALL)
	private Set<orderModel> orders;
	
    @Column(name="Role")
    private String role;
    
    
	



	public userModel(int usid, String usermail, String userName, int age, String pwd, String address,
			String phonenumber, String city, cartModel cartId, Set<orderModel> orders, String role) {
		super();
		this.usid = usid;
		this.usermail = usermail;
		this.userName = userName;
		this.age = age;
		this.pwd = pwd;
		this.address = address;
		this.phonenumber = phonenumber;
		this.city = city;
		this.cartId = cartId;
		this.orders = orders;
		this.role = role;
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


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPhonenumber() {
		return phonenumber;
	}


	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public cartModel getCartId() {
		return cartId;
	}


	public void setCartId(cartModel cartId) {
		this.cartId = cartId;
	}


	public Set<orderModel> getOrders() {
		return orders;
	}


	public void setOrders(Set<orderModel> orders) {
		this.orders = orders;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	@Override
	
	public String toString() {
		return "userModel [Usid=" + usid + ", userName=" + userName + ", age=" + age + ", pwd=" + pwd + ", address="
				+ address + ", phonenumber=" + phonenumber + ", city=" + city + ", cartId=" + cartId + ", orders="
				+ orders + ", role=" + role + "]";
	}

		
	
}
