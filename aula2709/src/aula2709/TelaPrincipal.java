package aula2709;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField txtAluno;
	private JTextField txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome do Aluno:");
		lblNewLabel.setBounds(31, 31, 92, 14);
		contentPane.add(lblNewLabel);
		
		txtAluno = new JTextField();
		txtAluno.setBounds(208, 28, 177, 20);
		contentPane.add(txtAluno);
		txtAluno.setColumns(10);
		
		JLabel lblPeriodo = new JLabel("Periodo");
		lblPeriodo.setBounds(31, 71, 92, 14);
		contentPane.add(lblPeriodo);
		
		JComboBox cmbPeriodo = new JComboBox();
		cmbPeriodo.setModel(new DefaultComboBoxModel(new String[] {"Selecione uma opção", "Manhã", "Tarde", "Noite"}));
		cmbPeriodo.setBounds(208, 59, 177, 22);
		contentPane.add(cmbPeriodo);
		
		txtResultado = new JTextField();
		txtResultado.setEnabled(false);
		txtResultado.setColumns(10);
		txtResultado.setBounds(31, 168, 354, 29);
		contentPane.add(txtResultado);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String resultado = txtAluno.getText() + cmbPeriodo.getSelectedItem();
				txtResultado.setText(resultado);
			}
		});
		btnCalcular.setBounds(82, 208, 118, 42);
		contentPane.add(btnCalcular);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtAluno.setText(null);
				txtResultado.setText(null);
				cmbPeriodo.setSelectedIndex(0);
			}
		});
		btnLimpar.setBounds(265, 208, 118, 42);
		contentPane.add(btnLimpar);
	}
}
