package com.utn.dao.interfaces;

import java.sql.SQLException;
import java.util.List;

import com.utn.model.Reseller;

public interface ITransactions extends IConnection {

	void insert(String nombre, String razonSocial, int dni, String direccion,int cantidadBebidas,  String tipoBebidas, double precioUnitario, int ventas) throws SQLException;
	
	List<Reseller> getReseller();
	
	Reseller getResellerById(int id);
	
}
