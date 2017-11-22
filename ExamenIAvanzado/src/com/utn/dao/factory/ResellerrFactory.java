package com.utn.dao.factory;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.utn.dao.interfaces.IConnection;
import com.utn.dao.interfaces.ITransactions;
import com.utn.io.FileLog;
import com.utn.model.Reseller;

public class ResellerrFactory implements ITransactions {

	@Override
	public List<Reseller> getReseller() {

		List<Reseller> list = new ArrayList<>();
		String nombre = null;
		String razonSocial = null;
		int dni = 0;
		String direccion = null;
		int cantidadBebidas = 0;
		String tipoBebidas = null;
		double precioUnitario = 0;
		int ventas = 0;
		
		IConnection conn = new IConnection() {
		};

		try {
			Statement st = conn.getConnection().createStatement();
			ResultSet rs = st.executeQuery("select * from proveedores");

			while (rs.next()) {
				/* Solo a modo de prueba salen por pantalla, devuelve una List<Reseller> */
				System.out.println("Nombre: "+rs.getString("nombre"));
				System.out.println("Razon social: "+ rs.getString("razon_social"));
				System.out.println("DNI: "+ rs.getInt("dni"));
				System.out.println("Dirección"+ rs.getString("direccion"));
				System.out.println("Cantidad de Bebidas: "+ rs.getInt("cantidad_bebidas"));
				System.out.println("Tipo de Bebidas: "+ rs.getString("tipo_bebidas"));
				System.out.println("Precio Unitario: "+ rs.getDouble("precio_unitario"));
				System.out.println("Ventas totales: "+ rs.getInt("ventas"));
				
				nombre = rs.getString("nombre");
				razonSocial = rs.getString("razon_social");
				dni = rs.getInt("dni");
				direccion = rs.getString("direccion");
				cantidadBebidas = rs.getInt("cantidad_bebidas");
				tipoBebidas = rs.getString("tipo_bebidas");
				precioUnitario = rs.getDouble("precio_unitario");
				ventas = rs.getInt("ventas");
				list.add(new Reseller(nombre, razonSocial,dni, direccion, cantidadBebidas, tipoBebidas, precioUnitario, ventas));
				
				FileLog.saveLog("Vendedor: "+nombre +", Cantidad vendida: "+ ventas+"\n", nombre);
			}
			

		} catch (Exception error) {
			System.out.println("No funcionó: " + error.getMessage());
		}
		return list;
	}

	@Override
	public void insert(String nombre, String razonSocial, int dni, String direccion, int cantidadBebidas,
			String tipoBebidas, double precioUnitario, int ventas) throws SQLException {

		IConnection conn = new IConnection() {
		};
		PreparedStatement ps;
		String sql = "INSERT INTO proveedores(nombre, razon_social, dni, direccion, cantidad_bebidas, tipo_bebidas, precio_unitario, ventas) VALUES(?,?,?,?,?,?,?,?)";
		ps = conn.getConnection().prepareStatement(sql);
		ps.setString(1, nombre);
		ps.setString(2, razonSocial);
		ps.setInt(3, dni);
		ps.setString(4, direccion);
		ps.setInt(5, cantidadBebidas);
		ps.setString(6, tipoBebidas);
		ps.setDouble(7, precioUnitario);
		ps.setInt(8, ventas);
		ps.executeUpdate();
		ps.close();
	}

	@Override
	public Reseller getResellerById(int id) {

		Reseller reseller = null;
		
		IConnection conn = new IConnection() {
		};

		try {
			Statement st = conn.getConnection().createStatement();
			ResultSet rs = st.executeQuery("select ventas from proveedores where id="+id);
			while(rs.next()) {
				reseller = new Reseller(rs.getInt("id"), rs.getString("nombre"), rs.getInt("ventas"));
			}
		}catch(Exception error) {
			
		}
		return reseller;
	}
	

}
