/*
 * Esta es la subclase se guardan y buscan los diferentes valores equivalentes
 * que se desea hacer la conversión.
 */
package util;

public class Conversion extends ValoresLineales {
	
	private String elemEntrada; // La unidad que queremos convertir.
	private String elemSalida; //  La unidad que queremos obtener 
	
	private double relacion; // la relacion entre 'La unidad que queremos convertir'/'La unidad que queremos obtener'
	
	public Conversion () {}
	public Conversion (String[]arrElemento,double[] arrValores) {
		//Este apartado es para guadar los arrays de los elementos y sus respectivos 
		//valores equivalentes.
		super.setArrElementos(arrElemento);
		super.setArrValores(arrValores);
		System.out.println(this.elemEntrada + "----"+this.elemSalida);
	}
	
	public void ingresoElementos(String elemEntrada,String elemSalida) {
		// Aquí se ingresan los elementos que se desean convertir, a partir de ellos se buscan
		//en sus respectivos arrays 
		this.elemEntrada = elemEntrada;
		this.elemSalida= elemSalida;
		System.out.println(this.elemEntrada + "----"+this.elemSalida);
		this.relacion = super.relacion(elemEntrada, elemSalida);
		
	}
	public String calcular (double valorIngresado) {
		//aquí se realiza la conversión, se redondea y se transforma a String
		//ya que solo así se pueden mostrar en las cajas de texto
		double operacion = valorIngresado*relacion;
		int decimales = 3;
		double redondeo =  Math.round(operacion * Math.pow(10, decimales)) / Math.pow(10, decimales);
		return Double.toString(redondeo);
	}
	
	

}
