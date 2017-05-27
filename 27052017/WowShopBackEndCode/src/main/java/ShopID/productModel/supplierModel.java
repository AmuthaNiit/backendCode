package ShopID.productModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "supplier")

public class supplierModel {
	
	@Id
	@Column(name="SupplierId")
	private String supplierId;
	
	@Column(name="suppliername")
	private String suppliername;
	@Column(name="setOfProducts")
	private String setOfProducts;
	public supplierModel(String supplierId, String suppliername, String setOfProducts) {
		super();
		this.supplierId = supplierId;
		this.suppliername = suppliername;
		this.setOfProducts = setOfProducts;
	}
	public String getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}
	public String getSuppliername() {
		return suppliername;
	}
	public void setSuppliername(String suppliername) {
		this.suppliername = suppliername;
	}
	public String getSetOfProducts() {
		return setOfProducts;
	}
	public void setSetOfProducts(String setOfProducts) {
		this.setOfProducts = setOfProducts;
	}
	
	
	

}
