package gui;
import util.ConversionTemp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//import java.awt.event.FocusAdapter;
//import java.awt.event.FocusEvent;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Element;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.DropMode;

public class PanelConvTemp extends JFrame implements ActionListener, DocumentListener  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFa;
	private JTextField textCelsius;
	private JTextField textKelvin;
	private JButton btnCalcular;
	
	private ConversionTemp calcularTemp = new ConversionTemp ();
	private JButton btnResetear;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public PanelConvTemp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		btnCalcular = new JButton("CALCULAR");
		contentPane.add(btnCalcular, BorderLayout.SOUTH);
		btnCalcular.addActionListener(this);

		JLabel lblNewLabel = new JLabel("CALCULADORA DE TEMP\r\n");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(lblNewLabel, BorderLayout.NORTH);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0, 0, 0, 7 };
		gbl_panel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel.columnWeights = new double[] { 1.0, 1.0, 1.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		textCelsius = new JTextField();
		textCelsius.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textCelsius.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_textCelsius = new GridBagConstraints();
		gbc_textCelsius.gridheight = 2;
		gbc_textCelsius.insets = new Insets(0, 0, 5, 5);
		gbc_textCelsius.fill = GridBagConstraints.VERTICAL;
		gbc_textCelsius.gridx = 1;
		gbc_textCelsius.gridy = 1;
		panel.add(textCelsius, gbc_textCelsius);
		textCelsius.setColumns(10);
		textCelsius.getDocument().addDocumentListener(this);

		textFa = new JTextField();
		textFa.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFa.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_textFa = new GridBagConstraints();
		gbc_textFa.gridheight = 2;
		gbc_textFa.insets = new Insets(0, 0, 5, 0);
		gbc_textFa.fill = GridBagConstraints.VERTICAL;
		gbc_textFa.gridx = 2;
		gbc_textFa.gridy = 1;
		panel.add(textFa, gbc_textFa);
		textFa.setColumns(10);
		textFa.getDocument().addDocumentListener(this);

		textKelvin = new JTextField();
		textKelvin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textKelvin.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_textKelvin = new GridBagConstraints();
		gbc_textKelvin.fill = GridBagConstraints.VERTICAL;
		gbc_textKelvin.gridheight = 2;
		gbc_textKelvin.insets = new Insets(0, 0, 5, 5);
		gbc_textKelvin.gridx = 0;
		gbc_textKelvin.gridy = 1;
		panel.add(textKelvin, gbc_textKelvin);
		textKelvin.setColumns(10);
		textKelvin.addActionListener(this);
		textKelvin.getDocument().addDocumentListener(this);


		JLabel lblKelvin = new JLabel("°K");
		lblKelvin.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblKelvin = new GridBagConstraints();
		gbc_lblKelvin.insets = new Insets(0, 0, 5, 5);
		gbc_lblKelvin.gridx = 0;
		gbc_lblKelvin.gridy = 3;
		panel.add(lblKelvin, gbc_lblKelvin);

		JLabel lblCelsius = new JLabel("°C");
		lblCelsius.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblCelsius = new GridBagConstraints();
		gbc_lblCelsius.insets = new Insets(0, 0, 5, 5);
		gbc_lblCelsius.gridx = 1;
		gbc_lblCelsius.gridy = 3;
		panel.add(lblCelsius, gbc_lblCelsius);

		JLabel lblFa = new JLabel("°F");
		lblFa.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblFa = new GridBagConstraints();
		gbc_lblFa.insets = new Insets(0, 0, 5, 0);
		gbc_lblFa.gridx = 2;
		gbc_lblFa.gridy = 3;
		panel.add(lblFa, gbc_lblFa);
		
		btnResetear = new JButton("RESETEAR");
		GridBagConstraints gbc_btnResetear = new GridBagConstraints();
		gbc_btnResetear.gridx = 2;
		gbc_btnResetear.gridy = 5;
		panel.add(btnResetear, gbc_btnResetear);
		btnResetear.addActionListener(this);
	}
	@Override
	public void removeUpdate(DocumentEvent e) {
		//System.out.println("Texto insertado: " + textKelvin.getText());
		if (  (textKelvin.getText()).isEmpty() == true && textCelsius.isEditable() == false && textFa.isEditable() == false) {
			textKelvin.setEditable(true);
			textCelsius.setEditable(true);
			textFa.setEditable(true);
		}
		
		if (  (textCelsius.getText()).isEmpty() == true && textKelvin.isEditable() == false && textFa.isEditable() == false) {
			textCelsius.setEditable(true);
			textKelvin.setEditable(true);
			textFa.setEditable(true);
		}
		
		if (  (textFa.getText()).isEmpty() == true && textKelvin.isEditable() == false && textCelsius.isEditable() == false) {
			textFa.setEditable(true);
			textKelvin.setEditable(true);
			textCelsius.setEditable(true);
		}
	}
	
	@Override
	public void insertUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		if (  (textKelvin.getText()).isEmpty() != true ) {
			
			textCelsius.setEditable(false);
			textFa.setEditable(false);
		}
		if (  (textCelsius.getText()).isEmpty() != true) {
			
			textKelvin.setEditable(false);
			textFa.setEditable(false);
		}
		if (  (textFa.getText()).isEmpty() != true) {
			
			textKelvin.setEditable(false);
			textCelsius.setEditable(false);
		}
		
	}
	
	@Override
	public void changedUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (btnCalcular == e.getSource()) {
			
			if ((textKelvin.getText()).isEmpty() != true && (textCelsius.getText()).isEmpty() && (textFa.getText()).isEmpty()) {
				double temp = Double.parseDouble(textKelvin.getText());
				calcularTemp.kelvinConv(temp);
				textCelsius.setText(Double.toString(calcularTemp.getCelcius()));
				textFa.setText(Double.toString(calcularTemp.getFah()));
				System.out.println("kelvin");
			}
			
			if ((textCelsius.getText()).isEmpty() != true && (textKelvin.getText()).isEmpty() && (textFa.getText()).isEmpty()) {
				double temp = Double.parseDouble(textCelsius.getText());
				calcularTemp.celciusConv(temp);
				textFa.setText(Double.toString(calcularTemp.getFah()));
				textKelvin.setText(Double.toString(calcularTemp.getKelvin()));
				System.out.println("celcius");
			}
			if ((textFa.getText()).isEmpty() != true && (textCelsius.getText()).isEmpty() && (textKelvin.getText()).isEmpty() ) {
				double temp = Double.parseDouble(textFa.getText());
				calcularTemp.fahrenheitConv(temp);
				textKelvin.setText(Double.toString(calcularTemp.getKelvin()));
				textCelsius.setText(Double.toString(calcularTemp.getCelcius()));
				System.out.println("fahrenheit");
			}
			
			System.out.println("funciona");
		}
		
		if (btnResetear==e.getSource()) {
			textKelvin.setText("");
			textCelsius.setText("");
			textFa.setText("");
		}

	}
}
