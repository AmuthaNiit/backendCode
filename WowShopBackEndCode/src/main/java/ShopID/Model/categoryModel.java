package ShopID.Model;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "categoryModel")
public class categoryModel {
	
	@Id
    @Column(name="categoryId")
	private int id;
	
	@Column(name="categoryname")
	private String categoryname;
	
	@OneToMany(targetEntity=productModel.class,mappedBy = "Category", cascade = CascadeType.ALL, fetch=FetchType.EAGER )
	private Set<productModel> products;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoryname() {
		return categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}

	public Set<productModel> getProducts() {
		return products;
	}

	public categoryModel(int id, String categoryname) {
		super();
		this.id = id;
		this.categoryname = categoryname;
	}

	public void setProducts(Set<productModel> products) {
		this.products = products;
	}

	public categoryModel() {
		super();
	}

	@Override
	public String toString() {
		return "categoryModel [id=" + id + ", categoryname=" + categoryname + ", products=" + products + "]";
	}


	
		  
} 
