package com.utn.view;

import com.utn.dao.factory.ResellerrFactory;

public class TestGetReseller {
	public static void main(String[] args) {

		/* Devuelve List<Reseller> */
		ResellerrFactory rs = new ResellerrFactory();
		rs.getReseller();
	}

}
