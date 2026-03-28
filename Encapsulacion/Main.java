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
}
}
