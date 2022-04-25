package model;

public class ProductModelo {

	private int codprod;
	
	private String nameprod;
	
	private double price;
	
	private String imgprod;
	
	private String category;

	public ProductModelo() {
		super();
	}

	public ProductModelo(int codprod, String nameprod, double price, String imgprod, String category) {
		super();
		this.codprod = codprod;
		this.nameprod = nameprod;
		this.price = price;
		this.imgprod = imgprod;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getImgprod() {
		return imgprod;
	}

	public void setImgprod(String imgprod) {
		this.imgprod = imgprod;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
}