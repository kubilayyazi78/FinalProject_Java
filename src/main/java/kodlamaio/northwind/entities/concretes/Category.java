package kodlamaio.northwind.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Table(name="categories")
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","products"})
public class Category {
@Column(name="category_id")
@Id
private int categoryId;
@Column(name="category_name")
private String categoryName;

@OneToMany(mappedBy = "category")
private List<Product> products;


public Category() {}


public int getCategoryId() {
	return categoryId;
}


public void setCategoryId(int categoryId) {
	this.categoryId = categoryId;
}


public String getCategoryName() {
	return categoryName;
}


public void setCategoryName(String categoryName) {
	this.categoryName = categoryName;
}


public List<Product> getProducts() {
	return products;
}


public void setProducts(List<Product> products) {
	this.products = products;
}


public Category(int categoryId, String categoryName, List<Product> products) {
	super();
	this.categoryId = categoryId;
	this.categoryName = categoryName;
	this.products = products;
}
}
