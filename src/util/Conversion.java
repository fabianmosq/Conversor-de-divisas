package util;



public class Conversion extends ValoresLineales {
	
	private String elemEntrada; // El de la moneda que deseamos convertir
	private String elemSalida; //  El de la moneda que queremos obtener
	
	private double relacion;
	//private double resultao;
	
	public Conversion () {}
	public Conversion (String[]arrElemento,double[] arrValores) {
		super.setArrElementos(arrElemento);
		super.setArrValores(arrValores);
		System.out.println(this.elemEntrada + "----"+this.elemSalida);
		
	}
	
	public void ingresoElementos(String elemEntrada,String elemSalida) {
		// TODO Auto-generated method stub
		this.elemEntrada = elemEntrada;
		this.elemSalida= elemSalida;
		System.out.println(this.elemEntrada + "----"+this.elemSalida);
		this.relacion = super.relacion(elemEntrada, elemSalida);
		
	}
	public String calcular (double valorIngresado) {
		double operacion = valorIngresado*relacion;
		int decimales = 3;
		double redondeo =  Math.round(operacion * Math.pow(10, decimales)) / Math.pow(10, decimales);
		return Double.toString(redondeo);
	}
	
	

}
