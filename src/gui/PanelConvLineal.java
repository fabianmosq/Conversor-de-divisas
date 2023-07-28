package gui;
import util.Conversion;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JButton;

import java.awt.Font;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class PanelConvLineal extends JFrame implements ActionListener {

	/**
	 * 
	 */
	
	private JPanel contentPane;
	private JTextField textEntrada;
	private JTextField textSalidaUsd;
	private JButton btnCalcular,btnEntrada,btnSalida; //se hizo private
	private JLabel lblNewLabel_2, lblNewLabel_3; //se hizo private
	private int eleccion;
	
	private String entrada = null;
	private String salida = null;
	
	Conversion star;
	Simbolismo simbolo;
	public PanelConvLineal() {}
	public PanelConvLineal(int eleccion) {
		this.eleccion = eleccion;
		simbolo = new Simbolismo(this.eleccion);
		iniciarVentana();
		
	}
	
	public void ingresarArrays(String[] arrElementos, double[] arrValores) {
		star = new Conversion(arrElementos,arrValores);//para ingresar los arrays desde la listaConv
		
		
	}
	
	/**
	 * Create the frame.
	 */
	private void iniciarVentana() {
		// TODO Auto-generated method stub
		setTitle("Alura challeng");
		setBounds(100, 100, 600, 301);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		//Botón abajo para calcular.
		btnCalcular = new JButton("CALCULAR");
		contentPane.add(btnCalcular, BorderLayout.SOUTH);
		btnCalcular.addActionListener(this);
		
		JPanel panelSuperior = new JPanel();
		contentPane.add(panelSuperior, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel(simbolo.getTitulo());
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		panelSuperior.add(lblNewLabel);
		
		JPanel paneCentral = new JPanel();
		contentPane.add(paneCentral, BorderLayout.CENTER);
		GridBagLayout gbl_paneCentral = new GridBagLayout();
		gbl_paneCentral.columnWidths = new int[]{50, 86, 91, 36, 86, 91, 0};
		gbl_paneCentral.rowHeights = new int[]{40, 0, 0, 0};
		gbl_paneCentral.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_paneCentral.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		paneCentral.setLayout(gbl_paneCentral);
		
		textEntrada = new JTextField("");
		textEntrada.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_textEntrada = new GridBagConstraints();
		gbc_textEntrada.fill = GridBagConstraints.HORIZONTAL;
		textEntrada.setPreferredSize(new Dimension(200, 40));
		gbc_textEntrada.anchor = GridBagConstraints.NORTH;
		gbc_textEntrada.insets = new Insets(0, 0, 5, 5);
		gbc_textEntrada.gridx = 1;
		gbc_textEntrada.gridy = 0;
		paneCentral.add(textEntrada, gbc_textEntrada);
		textEntrada.setColumns(10);
		
		lblNewLabel_2 = new JLabel("XXX");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 2;
		gbc_lblNewLabel_2.gridy = 0;
		paneCentral.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("=");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 3;
		gbc_lblNewLabel_1.gridy = 0;
		paneCentral.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		textSalidaUsd = new JTextField();
		textSalidaUsd.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textSalidaUsd.setPreferredSize(new Dimension(200, 40));
		textSalidaUsd.setEditable(false);
		GridBagConstraints gbc_textSalidaUsd = new GridBagConstraints();
		gbc_textSalidaUsd.fill = GridBagConstraints.HORIZONTAL;
		gbc_textSalidaUsd.anchor = GridBagConstraints.NORTH;
		gbc_textSalidaUsd.insets = new Insets(0, 0, 5, 5);
		gbc_textSalidaUsd.gridx = 4;
		gbc_textSalidaUsd.gridy = 0;
		paneCentral.add(textSalidaUsd, gbc_textSalidaUsd);
		textSalidaUsd.setColumns(10);
		
		lblNewLabel_3 = new JLabel("XXX");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_3.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_3.gridx = 5;
		gbc_lblNewLabel_3.gridy = 0;
		paneCentral.add(lblNewLabel_3, gbc_lblNewLabel_3);
		//Botón para escojer la moneda de entrada
		btnEntrada = new JButton("Elemento \r\nde entrada");
		btnEntrada.setToolTipText("aaa");
		GridBagConstraints gbc_btnEntrada = new GridBagConstraints();
		gbc_btnEntrada.fill = GridBagConstraints.BOTH;
		gbc_btnEntrada.insets = new Insets(0, 0, 0, 5);
		gbc_btnEntrada.gridx = 1;
		gbc_btnEntrada.gridy = 2;
		paneCentral.add(btnEntrada, gbc_btnEntrada);
		btnEntrada.addActionListener(this);
		
		//Botón para escojer la moneda de salida
		btnSalida = new JButton("Elemento de salida");
		GridBagConstraints gbc_btnSalida = new GridBagConstraints();
		gbc_btnSalida.fill = GridBagConstraints.VERTICAL;
		gbc_btnSalida.insets = new Insets(0, 0, 0, 5);
		gbc_btnSalida.gridx = 4;
		gbc_btnSalida.gridy = 2;
		paneCentral.add(btnSalida, gbc_btnSalida);
		btnSalida.addActionListener(this);
	}

	/*
	private String simboloSalida() {
		
	}*/
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
		if  (btnEntrada==e.getSource()) {
			entrada = (String) JOptionPane.showInputDialog(null,
					 	"selleccione una","ejemplo opcione",JOptionPane.QUESTION_MESSAGE,null,
					 	star.getArrElementos(),"selecciona");
			System.out.println(entrada);
			if  (entrada != null) {
				lblNewLabel_2.setText(entrada);
			}
			
		}
		if  (btnSalida==e.getSource()) {
			salida = (String) JOptionPane.showInputDialog(null,
				 	"selleccione una","ejemplo opcione",JOptionPane.QUESTION_MESSAGE,null,
				 	star.getArrElementos(),"selecciona");
			System.out.println(salida);
			if  (salida != null) {
				lblNewLabel_3.setText(salida);
			}
		}
		if (btnCalcular == e.getSource()) {
			String capp = textEntrada.getText();
			if (entrada!= null && salida != null && capp.isEmpty() != true) {
				double dinero = Double.parseDouble(textEntrada.getText());
				
				star.ingresoElementos(this.entrada,this.salida);
				System.out.println(star.calcular(dinero));
				textSalidaUsd.setText(star.calcular(dinero));
			}else {
				JOptionPane.showMessageDialog(null, "Debes seleccionar un elemento y/o ingresar un valor",
						"alert", JOptionPane.ERROR_MESSAGE);
			}			
		}                  
	}
}
