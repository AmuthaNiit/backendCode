package ShopID.productModel;

import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Model {

	public Model(String id, String brand, String pname, String description, double price, int quantity, String category,
			String supplier) {
		super();
		this.id = id;
		this.brand = brand;
		this.pname = pname;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
		this.supplier = supplier;
	}
	@Id
    @Column(name="id")
	private String id;
	
	@Column(name="brand")
	private String brand;
    
	@Column(name="pname")
	private String pname;
	
	@Column(name="description")
    private String description;
	
	@Column(name="price")
    private double price;
	
	@Column(name="quantity")
    private int quantity;
	
	@Column(name="category")
    private String category;
	
	@Column(name="supplier")
    private String supplier;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	
}
