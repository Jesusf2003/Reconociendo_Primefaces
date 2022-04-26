package model;

public class ProductModelo {

	private int codprod;
	
	private String nameprod;
	
	private String imgprod;
	
	private double price;
	
	private String category;

	public ProductModelo() {
		super();
	}

	public ProductModelo(int codprod, String nameprod, String imgprod, double price, String category) {
		super();
		this.codprod = codprod;
		this.nameprod = nameprod;
		this.imgprod = imgprod;
		this.price = price;
		this.category = category;
	}

	public int getCodprod() {
		return codprod;
	}

	public void setCodprod(int codprod) {
		this.codprod = codprod;
	}

	public String getNameprod() {
		return nameprod;
	}

	public void setNameprod(String nameprod) {
		this.nameprod = nameprod;
	}

	public String getImgprod() {
		return imgprod;
	}

	public void setImgprod(String imgprod) {
		this.imgprod = imgprod;
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