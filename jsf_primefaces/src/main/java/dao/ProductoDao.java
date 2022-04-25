package dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.ProductModelo;

public class ProductoDao extends Conexion {

	public List<ProductModelo> listar() throws Exception {
		List<ProductModelo> listar = null;
		ProductModelo prod;
		this.conectar();
		try {
			Statement st = this.getCnx().createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM PRODUCTO");
			
			listar = new ArrayList();
			
			while (rs.next()) {
				prod = new ProductModelo();
				prod.setCodprod(rs.getInt("codprod"));
				prod.setNameprod(rs.getString("nomprod"));
				prod.setImgprod(rs.getString("imgprod"));
				prod.setPrice(rs.getDouble("priceprod"));
				prod.setCategory(rs.getString("categoryprod"));
				
				listar.add(prod);
			}
			
			rs.close();
			st.close();
		} catch (Exception e) {
			System.out.println(e.getClass().getName() + ": " + e.getMessage());
		}
		
		return listar;
	}
	
}