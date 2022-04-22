package model;

public class ProductModelo {

	private String codprod;
	
	private String nameprod;
	
	private double price;
	
	private String category;

	public ProductModelo() {
		super();
	}

	public ProductModelo(String codprod, String nameprod, double price, String category) {
		super();
		this.codprod = codprod;
		this.nameprod = nameprod;
		this.price = price;
		this.category = category;
	}

	public String getCodprod() {
		return codprod;
	}

	public void setCodprod(String codprod) {
		this.codprod = codprod;
	}

	public String getNameprod() {
		return nameprod;
	}

	public void setNameprod(String nameprod) {
		this.nameprod = nameprod;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
}