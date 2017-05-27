package ShopID.productModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order")
public class orderModel {
	@Id
	@Column(name="orderId")
	private String orderId;
	
	@Column(name="userId")
	private String userId;
	
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public orderModel(String orderId, String userId, String payment, double ordertotal) {
		super();
		this.orderId = orderId;
		this.userId = userId;
		this.payment = payment;
		this.ordertotal = ordertotal;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
	@Column(name="payment")
	private String payment;
	@Column(name="ordertotal")
	private double ordertotal;
	
	
}
