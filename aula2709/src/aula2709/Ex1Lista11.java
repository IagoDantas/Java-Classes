package aula2709;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex1Lista11 extends JFrame {

	private JPanel contentPane;
	private JTextField txtValorVenda;
	private JTextField txtPrecoFinal;
	private JButton btnCalcular;
	private JTextArea txtArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex1Lista11 frame = new Ex1Lista11();
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
	public Ex1Lista11() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 360, 268);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Entre com o valor da venda:");
		lblNewLabel.setBounds(31, 33, 163, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Escolha a forma de pagamento:");
		lblNewLabel_1.setBounds(30, 69, 196, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Preço final a pagar:");
		lblNewLabel_2.setBounds(31, 104, 163, 14);
		contentPane.add(lblNewLabel_2);
		
		txtValorVenda = new JTextField();
		txtValorVenda.setBounds(236, 30, 86, 20);
		contentPane.add(txtValorVenda);
		txtValorVenda.setColumns(10);
		
		txtPrecoFinal = new JTextField();
		txtPrecoFinal.setBounds(236, 101, 86, 20);
		contentPane.add(txtPrecoFinal);
		txtPrecoFinal.setColumns(10);
		
		JComboBox cmbFormaPgto = new JComboBox();
		cmbFormaPgto.setModel(new DefaultComboBoxModel(new String[] {"Cartão", "Dinheiro", "Cheque"}));
		cmbFormaPgto.setBounds(235, 67, 86, 22);
		contentPane.add(cmbFormaPgto);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double resultado = 0;
				if(cmbFormaPgto.getSelectedIndex()== 0) {
					resultado = Double.parseDouble(txtValorVenda.getText()) * 1.10; 
				}
				else if(cmbFormaPgto.getSelectedIndex()== 1) {
					resultado = Double.parseDouble(txtValorVenda.getText()) * 0.95; 
				}
				else if(cmbFormaPgto.getSelectedIndex()== 2) {
					resultado = Double.parseDouble(txtValorVenda.getText()) * 1.05;
					
				}
				resultado = Math.round(resultado);
				txtPrecoFinal.setText(String.valueOf(resultado));
			}
		});
		btnCalcular.setBounds(31, 176, 143, 23);
		contentPane.add(btnCalcular);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPrecoFinal.setText(null);
				txtValorVenda.setText(null);
				cmbFormaPgto.setSelectedIndex(0);
			}
		});
		btnLimpar.setBounds(186, 176, 136, 23);
		contentPane.add(btnLimpar);
	}

}
