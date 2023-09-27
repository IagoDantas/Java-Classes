package aula2709;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex3Lista11 extends JFrame {

	private JPanel contentPane;
	private JTextField txtQtdSorveteFrutas;
	private JTextField txtQtdChocolate;
	private JTextField txtQtdBola;
	private JTextField txtQtdPote;
	private JTextField txtPrecoChocolate;
	private JTextField txtSorveteFrutas;
	private JTextField txtPrecoBola;
	private JTextField txtPrecoPote;
	private JTextField txtTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex3Lista11 frame = new Ex3Lista11();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ex3Lista11() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTipoSorvete = new JLabel("Tipo de Sorvete");
		lblTipoSorvete.setBounds(10, 11, 99, 14);
		contentPane.add(lblTipoSorvete);
		
		JLabel lblNewLabel_1 = new JLabel("Sorvete de frutas");
		lblNewLabel_1.setBounds(10, 39, 99, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Chocolate/ Frutas");
		lblNewLabel_1_1.setBounds(11, 70, 98, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Bola");
		lblNewLabel_1_2.setBounds(10, 102, 46, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Pote de 2 Litros");
		lblNewLabel_1_3.setBounds(10, 139, 99, 14);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Qtde");
		lblNewLabel_1_4.setBounds(134, 11, 46, 14);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Preço Unitário");
		lblNewLabel_1_5.setBounds(262, 11, 86, 14);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(134, 170, 46, 14);
		contentPane.add(lblTotal);
		
		txtQtdSorveteFrutas = new JTextField();
		txtQtdSorveteFrutas.setBounds(134, 36, 86, 20);
		contentPane.add(txtQtdSorveteFrutas);
		txtQtdSorveteFrutas.setColumns(10);
		
		txtQtdChocolate = new JTextField();
		txtQtdChocolate.setColumns(10);
		txtQtdChocolate.setBounds(134, 67, 86, 20);
		contentPane.add(txtQtdChocolate);
		
		txtQtdBola = new JTextField();
		txtQtdBola.setColumns(10);
		txtQtdBola.setBounds(134, 103, 86, 20);
		contentPane.add(txtQtdBola);
		
		txtQtdPote = new JTextField();
		txtQtdPote.setColumns(10);
		txtQtdPote.setBounds(134, 136, 86, 20);
		contentPane.add(txtQtdPote);
		
		txtPrecoChocolate = new JTextField();
		txtPrecoChocolate.setColumns(10);
		txtPrecoChocolate.setBounds(262, 67, 86, 20);
		contentPane.add(txtPrecoChocolate);
		
		txtSorveteFrutas = new JTextField();
		txtSorveteFrutas.setColumns(10);
		txtSorveteFrutas.setBounds(262, 36, 86, 20);
		contentPane.add(txtSorveteFrutas);
		
		txtPrecoBola = new JTextField();
		txtPrecoBola.setColumns(10);
		txtPrecoBola.setBounds(262, 99, 86, 20);
		contentPane.add(txtPrecoBola);
		
		txtPrecoPote = new JTextField();
		txtPrecoPote.setColumns(10);
		txtPrecoPote.setBounds(262, 133, 86, 20);
		contentPane.add(txtPrecoPote);
		
		txtTotal = new JTextField();
		txtTotal.setColumns(10);
		txtTotal.setBounds(262, 164, 86, 20);
		contentPane.add(txtTotal);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double total = 0;
				double totalSorveteFrutas = 0;
				double totalSorveteChocolate = 0;
				double totalBola = 0;
				double totalPote2litros;
				totalSorveteFrutas = Double.parseDouble(txtQtdSorveteFrutas.getText()) + Double.parseDouble(txtSorveteFrutas.getText());
				totalSorveteChocolate = Double.parseDouble(txtQtdChocolate.getText()) + Double.parseDouble(txtPrecoChocolate.getText());
				totalBola = Double.parseDouble(txtQtdBola.getText()) + Double.parseDouble(txtPrecoBola.getText());
				totalPote2litros = Double.parseDouble(txtQtdPote.getText()) + Double.parseDouble(txtPrecoBola.getText());
				total = totalSorveteFrutas += totalSorveteChocolate += totalBola += totalPote2litros;
				txtTotal.setText(String.valueOf(total));
			}
		});
		btnCalcular.setBounds(131, 212, 99, 37);
		contentPane.add(btnCalcular);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPrecoBola.setText(null);
				txtPrecoChocolate.setText(null);
				txtPrecoPote.setText(null);
				txtSorveteFrutas.setText(null);
				txtQtdBola.setText(null);
				txtQtdChocolate.setText(null);
				txtQtdPote.setText(null);
				txtQtdSorveteFrutas.setText(null);
				txtTotal.setText(null);
			}
		});
		btnLimpar.setBounds(259, 211, 89, 39);
		contentPane.add(btnLimpar);
	}

}
