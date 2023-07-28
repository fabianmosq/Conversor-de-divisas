package util;

public class ConversionTemp {
	private double celcius;
	private double kelvin;
	private double fah;
	
	public void fahrenheitConv (double tempFah) {
		double k = ((5)*(tempFah-32)/9) + 273.15;
		transf(k);
	}
	public void celciusConv (double tempCelcius) {
		double k = tempCelcius + 273.15;
		transf(k);
	}
	public void kelvinConv (double tempKelvin) {
		double k = tempKelvin;
		transf(k);
	}
	private void transf (double tempKelvin) {
		int decimales = 3;
		this.kelvin = Math.round(tempKelvin * Math.pow(10, decimales)) / Math.pow(10, decimales);
		double fahm = ((((9*(tempKelvin-273.15)/5)))+32);
		
		this.fah = Math.round(fahm * Math.pow(10, decimales)) / Math.pow(10, decimales);
		
		this.celcius = Math.round((tempKelvin-273.15) * Math.pow(10, decimales)) / Math.pow(10, decimales);
		System.out.println(this.celcius);
	}
	
	public double getCelcius() {
		return celcius;
	}
	public double getKelvin() {
		return kelvin;
	}
	public double getFah() {
		return fah;
	}
	
	
}
