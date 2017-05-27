package ShopID.productModel;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "category")
public class categoryModel {
	
	@Id
    @Column(name="id")
	private int id;
	@Column(name="categoryname")
	private String categoryname;
	
	@Column(name="description")
	private String description;
	
	
	public categoryModel(int id, String categoryname, String description) {
		super();
		this.id = id;
		this.categoryname = categoryname;
		this.description = description;
	}

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	
}
