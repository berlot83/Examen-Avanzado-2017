package com.utn.view;

import com.utn.dao.factory.ResellerrFactory;

public class TestGetReseller {
	public static void main(String[] args) {

		/* Devuelve List<Reseller> y crea un txt en path/manaos/nombre.txt y en el proyecto local */
		ResellerrFactory rs = new ResellerrFactory();
		rs.getReseller();
	}

}
