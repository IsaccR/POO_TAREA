package Encapsulacion;

public class Libro {

	  String titulo;
	    String autor;
	    int paginas;

	    public Libro(String titulo, String autor, int paginas) {
	        this.titulo = titulo;
	        this.autor = autor;
	        this.paginas = paginas;
	    }

	    public boolean esLargo() {
	        return paginas > 300;
	    }

	    public String toString() {
	        return "Titulo: " + titulo + " Autor: " + autor + " Paginas: " + paginas;
	    }
}
