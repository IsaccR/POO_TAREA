package Encapsulacion;

public class Main {

	    public static void main(String[] args) {

	       
	        Persona2 p1 = new Persona2("Juan", "Perez", 20);
	        Persona2 p2 = new Persona2("Maria", "Lopez", 25);
	        Persona2 p3 = new Persona2("Carlos", "Ramirez", 30);

	        System.out.println(p1);
	        System.out.println(p2);
	        System.out.println(p3);

	    
	    Rectangulo r1 = new Rectangulo(5, 3);
        Rectangulo r2 = new Rectangulo(4, 6);

        System.out.println(r1);
        System.out.println(r2);

        if (r1.area() > r2.area()) {
            System.out.println("El rectangulo 1 tiene mayor area");
        } else {
            System.out.println("El rectangulo 2 tiene mayor area");
        }
        Producto pr1 = new Producto("001", "Laptop", 5000);
        Producto pr2 = new Producto("002", "Mouse", 200);

        pr1.aplicarDescuento(10);
        pr2.aplicarDescuento(5);

        System.out.println(pr1);
        System.out.println(pr2);
        
        Cuenta c1 = new Cuenta("Ana", 1000);

        c1.depositar(500);
        c1.retirar(200);
        c1.retirar(2000);

        System.out.println(c1);
        
        Libro l1 = new Libro("Java Basico", "Luis", 350);
        Libro l2 = new Libro("Programacion", "Ana", 200);
        Libro l3 = new Libro("Estructuras", "Carlos", 500);

        System.out.println(l1 + " Largo: " + l1.esLargo());
        System.out.println(l2 + " Largo: " + l2.esLargo());
        System.out.println(l3 + " Largo: " + l3.esLargo());
        
        Calculadora calc = new Calculadora();
        System.out.println("Suma: " + calc.sumar(10, 5));
        System.out.println("Resta: " + calc.restar(10, 5));
        System.out.println("Multiplicacion: " + calc.multiplicar(10, 5));
        System.out.println("Division: " + calc.dividir(10, 0));
}
}
