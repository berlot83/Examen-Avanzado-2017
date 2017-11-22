package com.utn.model;

public class Reseller {

	private int id;
	private String nombre;
	private String razonSocial;
	private int dni;
	private String direccion;
	private int cantidadBebidas;
	private String tipoBebidas;
	private double precioUnitario;
	private int ventas;

	public Reseller() {

	}

	public Reseller(String nombre, String razonSocial, int dni, String direccion, int cantidadBebidas,
			String tipoBebidas, double precioUnitario, int ventas) {
		this.nombre = nombre;
		this.razonSocial = razonSocial;
		this.dni = dni;
		this.direccion = direccion;
		this.cantidadBebidas = cantidadBebidas;
		this.tipoBebidas = tipoBebidas;
		this.precioUnitario = precioUnitario;
		this.ventas = ventas;
	}

	public Reseller(int id, String nombre, int ventas) {
		this.id = id;
		this.nombre = nombre;
		this.ventas = ventas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCantidadBebidas() {
		return cantidadBebidas;
	}

	public void setCantidadBebidas(int cantidadBebidas) {
		this.cantidadBebidas = cantidadBebidas;
	}

	public String getTipoBebidas() {
		return tipoBebidas;
	}

	public void setTipoBebidas(String tipoBebidas) {
		this.tipoBebidas = tipoBebidas;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public int getVentas() {
		return ventas;
	}

	public void setVentas(int ventas) {
		this.ventas = ventas;
	}
}
