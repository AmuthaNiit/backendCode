package ShopID.Model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import ShopID.Model.productModel;

@Entity
@Table(name = "supplierModel")
public class supplierModel implements Serializable
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SupplierId")
	private int supplierId;
	
	@Column(name="suppliername")
	private String suppliername;
	
	
	@OneToMany(targetEntity=productModel.class,mappedBy="supplier",cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	private Set<productModel> product;
	
	public int getSupplierId() {
		return supplierId;
	}

	public supplierModel() {
		super();
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	public String getSuppliername() {
		return suppliername;
	}

	public void setSuppliername(String suppliername) {
		this.suppliername = suppliername;
	}

	public Set<productModel> getProduct() {
		return product;
	}

	public void setProduct(Set<productModel> product) {
		this.product = product;
	}

	public supplierModel(int supplierId, String suppliername) {
		super();
		this.supplierId = supplierId;
		this.suppliername = suppliername;
	}

	@Override
	public String toString() {
		return "supplierModel [supplierId=" + supplierId + ", suppliername=" + suppliername + ", product=" + product
				+ "]";
	}

	
	


}
