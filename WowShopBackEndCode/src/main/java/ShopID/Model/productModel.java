package ShopID.Model;

import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "productModel")
public class productModel {

	
	public productModel() {
		super();
	}

	@Id
    @Column(name="productid")
	private String productid;
	
	@Column(name="pname")
	private String pname;
	
	
	@Column(name="price")
    private double price;
	
	private String pimage;
	
	public String getPimage() {
		return pimage;
	}

	public void setPimage(String pimage) {
		this.pimage = pimage;
	}

	@ManyToOne
	@JoinColumn(name="supplierId")
    private supplierModel supplier;
	
    @ManyToOne
    @JoinColumn(name="categoryId")
	private categoryModel Category;
    
	

	public productModel(String id, String pname, double price, supplierModel supplier, categoryModel category) {
		super();
		this.productid = id;
		this.pname = pname;
		this.price = price;
		this.supplier = supplier;
		Category = category;
	}

	public String getId() {
		return productid;
	}

	public void setId(String id) {
		this.productid = id;
	}

	
	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	public supplierModel getSupplier() {
		return supplier;
	}

	public void setSupplier(supplierModel supplier) {
		this.supplier = supplier;
	}

	public categoryModel getCategory() {
		return Category;
	}

	public void setCategory(categoryModel category) {
		Category = category;
	}

	
	
    }
