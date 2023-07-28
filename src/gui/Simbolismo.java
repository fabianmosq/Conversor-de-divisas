package gui;

public class Simbolismo {
	private String titulo;
	
	public Simbolismo(int eleccion) {
		switch (eleccion) {
		case 0://Conversor monedas (lineal)
			this.titulo = "CONVERSOR DE DIVISAS";
			break;
		case 1://Conversor de temperatura.
			this.titulo = "CONVERSOR DE TEMPERATURAS";
			break;
			
		
		case 2://Conversor de masas
			this.titulo = "CONVERSOR DE MASAS";
			break;

		default:
			break;
		}
	}
	public String getTitulo() {
		return titulo;
	}
}
