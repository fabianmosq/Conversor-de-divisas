package util;


public abstract class ValoresLineales {
	
	private String[] arrElementos;
	private double[] arrValores;//El elemento y el valor deben ocupar la misma posición en el array


	public String[] getArrElementos() {
		return arrElementos;
	}
	
	public double[] getArrValores() {
		return arrValores;
	}
	
	public void setArrElementos(String[] arrElementos) {
		this.arrElementos = arrElementos;
	}
	public void setArrValores(double[] valores) {
		this.arrValores = valores;
	}
	public double ValorDelElemento(String[] arrMoneda,String moneda) {
		int posicion = busArray(arrMoneda,moneda);
		return arrValores[posicion];
	}
	public double relacion (String elemEntrada,String elemSalida) {
		
		double entrada = ValorDelElemento(getArrElementos(),elemEntrada);
		double salida = ValorDelElemento(getArrElementos(),elemSalida);
		double relacion = salida/entrada;
		return relacion; 
		
	}
	private int busArray(String[] arryss, String buscar) {
		int position = -1;
		for (int i = 0; i < arryss.length; i++) {
			if (arryss[i].equals(buscar)) {
				position = i;
				break;
			}
		}
		return position;
	}
}
