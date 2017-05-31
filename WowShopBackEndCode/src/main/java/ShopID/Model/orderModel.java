package ShopID.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orderModel")
public class orderModel implements Serializable {
	
	private static final long serialVersionUID=1L;
	@Id
	@Column(name="orderId")
	private String orderId;
	@ManyToOne  
	@JoinColumn(name="UsId")
	private userModel user;
	@Column(name="ordertotal")
	private double ordertotal;	
	@Column(name="payment")
	private String payment;
	public String getOrderId() {
		return orderId;
	}
	public orderModel(String orderId, userModel userId, String payment, double ordertotal) {
		super();
		this.orderId = orderId;
		this.user = userId;
		this.payment = payment;
		this.ordertotal = ordertotal;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	
	
		public userModel getUser() {
		return user;
	}
	public void setUserId(userModel userId) {
		this.user = userId;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public double getOrdertotal() {
		return ordertotal;
	}
	public void setOrdertotal(double ordertotal) {
		this.ordertotal = ordertotal;
	}
	
	
	
}
