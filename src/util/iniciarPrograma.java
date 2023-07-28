package util;
import javax.swing.JOptionPane;
import CuadrosWind.ListaConv;

public class iniciarPrograma {
	private int eleccion;

	public int getEleccion() {
		return eleccion;
	}

	public iniciarPrograma() {
		
		
	}
	
	public void desplegarOpciones() {
		/*
		 * int laats = JOptionPane.showConfirmDialog(null, "funciona plis");
		 * System.out.println(laats); 
		 * JOptionPane.showInputDialog(null,
		 * "selleccione una","ejemplo opcione",JOptionPane.QUESTION_MESSAGE,null,
		 * opciones,"selecciona"); 
		 * JOptionPane.showInputDialog(null, "dato");
		 * 
		 * Conversion copVsUsd = new Conversion(); copVsUsd.setMonedaLocal(4100);
		 * copVsUsd.setMonedaExt(1);
		 */
		// La lista de 
		Object[] listaConver = { 
				"Conversor moneda" // 0 Lineal
				,"Conversor temperatura" // 1 No lineal
				,"Conversor de masa" //2 Lineal
		};
		String tomado = (String) JOptionPane.showInputDialog(null, "selleccione una", "ejemplo opcione",
				JOptionPane.QUESTION_MESSAGE, null, listaConver, "selecciona");
		int numLista = busArray(listaConver, tomado);
		System.out.println(numLista);

		this.eleccion = numLista;
		System.out.println("eleccion es esta");
		ListaConv tipoConversion = new ListaConv(eleccion);
		System.out.println(tipoConversion);
		/*
		 * String pala = (String) opciones[3]; System.out.println(pala);
		 * System.out.println(busArray(opciones, pala));
		 */

	}

	private static int busArray(Object[] arryss, String buscar) {
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
