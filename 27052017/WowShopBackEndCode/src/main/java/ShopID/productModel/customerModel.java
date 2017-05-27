package ShopID.productModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Customer")
public class customerModel {
	
	@Id
	@Column(name="CustomerId")
		private String CustomerId;
	
	@Column(name="email")
	private String email;
	
	@Column(name="username")
		private String username;
	
	
	@Column(name="address")
	private String address;
	




	public customerModel(String customerId, String email, String username, String address) {
		super();
		CustomerId = customerId;
		this.email = email;
		this.username = username;
		this.address = address;
	}
	
	

	public String getCustomerId() {
		return CustomerId;
	}


	public void setCustomerId(String customerId) {
		CustomerId = customerId;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}

	

}
