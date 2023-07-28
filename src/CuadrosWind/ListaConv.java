/*
 * aqui se colocan los arrays de las unidades (elementos) y sus respectivos valores
 * equivalentes, las unidades y los valores deben ocupar la misma posición.
 */
package CuadrosWind;
import gui.PanelConvLineal; //Le movi y eclipse me puso esto, tenía  problemas para llamar
import gui.PanelConvTemp;							  //la ventana de prueba.
public class ListaConv {
	
	public ListaConv () {}
	
	public ListaConv (int eleccion)  {
		switch (eleccion) {
		case 0://Conversor monedas (lineal)
			String[] arrElemeMoneda = {"USD","COP","EUR","MXN"};
			double[] arrValoresMoneda = {1 , 4100 , 0.89, 16.75};
			PanelConvLineal ventana = new PanelConvLineal(eleccion);
			ventana.setVisible(true);
			ventana.ingresarArrays(arrElemeMoneda, arrValoresMoneda);
			break;
		case 1://Conversor de temperatura.
			PanelConvTemp ventana2 = new PanelConvTemp();
			ventana2.setVisible(true);
			break;
			
		
		case 2:
			String[] arrElemeMoneda3 = {"Kgr","Lb","Ton","gr"};
			double[] arrValoresMoneda3 = {1 , 2.20462 , 0.001, 1000};
			PanelConvLineal ventana3 = new PanelConvLineal(eleccion);
			ventana3.setVisible(true);
			ventana3.ingresarArrays(arrElemeMoneda3, arrValoresMoneda3);
			break;

		default:
			break;
		}
	}
	
}
