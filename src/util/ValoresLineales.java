/*
* En esta superclase se determina como se manjan los datos y contiene los métodos
* para tratar los arrays.
*/
package util;


public abstract class ValoresLineales {
	
	private String[] arrElementos;
	private double[] arrValores;//El elemento y el valor deben ocupar la misma posición en el array

	//los respectivos getter y setters
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
	//Este método es para dar con posicíon de un valor en un array y retunr
	public double ValorDelElemento(String[] arrMoneda,String moneda) {
		int posicion = busArray(arrMoneda,moneda);
		return arrValores[posicion];
	}
	//Este método es para buscarl los valores equivales en los arrays.
	public double relacion (String elemEntrada,String elemSalida) {
		
		double entrada = ValorDelElemento(getArrElementos(),elemEntrada);
		double salida = ValorDelElemento(getArrElementos(),elemSalida);
		double relacion = salida/entrada;
		return relacion; 
		
	}
	//El metodo para buscar posiciones en un array, sacado de internet
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
