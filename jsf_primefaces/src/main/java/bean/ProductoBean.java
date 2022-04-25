package bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import dao.ProductoDao;
import model.ProductModelo;

@Named(value = "productoBean")
@SessionScoped
public class ProductoBean implements Serializable {
	
	private ProductModelo prod;
	
	private ProductoDao prodDao;
	
	private List<ProductModelo> listProd;
	
	public ProductoBean() {
		prod = new ProductModelo();
		prodDao = new ProductoDao();
		listProd = new ArrayList<>();
	}
	
	@PostConstruct
	public void construir() {
		listar();
	}
	
	public void listar() {
		try {
			listProd = prodDao.listar();
		} catch (Exception e) {
			System.out.println();
		}
	}

	public ProductModelo getProd() {
		return prod;
	}

	public void setProd(ProductModelo prod) {
		this.prod = prod;
	}

	public ProductoDao getProdDao() {
		return prodDao;
	}

	public void setProdDao(ProductoDao prodDao) {
		this.prodDao = prodDao;
	}

	public List<ProductModelo> getListProd() {
		return listProd;
	}

	public void setListProd(List<ProductModelo> listProd) {
		this.listProd = listProd;
	}
}