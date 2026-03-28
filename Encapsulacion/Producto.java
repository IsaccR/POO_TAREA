package Encapsulacion;

public class Producto {
	
	 String codigo;
	    String nombre;
	    double precio;

	    public Producto(String codigo, String nombre, double precio) {
	        this.codigo = codigo;
	        this.nombre = nombre;
	        this.precio = precio;
	    }

	    public void aplicarDescuento(double porcentaje) {
	        precio = precio - (precio * porcentaje / 100);
	    }

	    public String toString() {
	        return "Codigo: " + codigo + " Nombre: " + nombre + " Precio: " + precio;
	    }

}
