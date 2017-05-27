package ShopID.productModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class userModel {
	
	@Id
	@Column(name="UserId")
	private String Usid;
	
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

	public String getEnabled() {
		return enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	@Column(name="userName")
	private String userName;
	
	@Column(name="pwd")
	private String pwd;
	
	@Column(name="enabled")
	private String enabled;
	
	@Column(name="customerId")
	private String customerId;

	public userModel(String usid, String userName, String pwd, String enabled, String customerId) {
		super();
		Usid = usid;
		this.userName = userName;
		this.pwd = pwd;
		this.enabled = enabled;
		this.customerId = customerId;
	}
	
	

}
