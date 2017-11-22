package com.utn.view;

import java.sql.SQLException;
import com.utn.dao.factory.ResellerrFactory;

public class TestInsert {

	public static void main(String[] args) {

		/* Devuelve List<Reseller> */
		ResellerrFactory rs = new ResellerrFactory();
		rs.getReseller();

		
		/* Inserta Reseller */
		try {
			rs.insert("Moreto", "SRL", 30158619, "San Martin 537", 10020, "Cerveza", 15.26, 110);
			rs.insert("Mantis", "SA", 30158619, "San Trelles 5137", 12015, "Gaseosa", 10.13, 190);
			rs.insert("Tringalis", "Monotributo", 30158619, "Cuenca 4187", 14415, "Jugos", 9.42, 130);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
