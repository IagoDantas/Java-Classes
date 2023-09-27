package aula2709;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex2Lista11 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtEndereco;
	private JButton btnCalcular;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex2Lista11 frame = new Ex2Lista11();
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
	public Ex2Lista11() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 386);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(34, 32, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblEndereco = new JLabel("Endereço:");
		lblEndereco.setBounds(34, 62, 121, 14);
		contentPane.add(lblEndereco);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(34, 94, 46, 14);
		contentPane.add(lblSexo);
		
		JLabel lblEstadoCivil = new JLabel("Estado Civil:");
		lblEstadoCivil.setBounds(34, 128, 98, 14);
		contentPane.add(lblEstadoCivil);
		
		txtNome = new JTextField();
		txtNome.setBounds(258, 29, 143, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtEndereco = new JTextField();
		txtEndereco.setColumns(10);
		txtEndereco.setBounds(258, 59, 143, 20);
		contentPane.add(txtEndereco);
		
		JComboBox cmbSexo = new JComboBox();
		cmbSexo.setModel(new DefaultComboBoxModel(new String[] {"Masculino", "Feminino", "Prefiro Não Informar"}));
		cmbSexo.setBounds(258, 90, 143, 22);
		contentPane.add(cmbSexo);
		
		JComboBox cmbEstadoCivil = new JComboBox();
		cmbEstadoCivil.setModel(new DefaultComboBoxModel(new String[] {"Casado", "Solteiro", "Viuvo", "Ficante"}));
		cmbEstadoCivil.setBounds(258, 124, 143, 22);
		contentPane.add(cmbEstadoCivil);
		JTextArea txtArea = new JTextArea();
		txtArea.setBounds(34, 239, 365, 97);
		contentPane.add(txtArea);
		btnCalcular = new JButton("Mostrar");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String resultado = "Nome: " + txtNome.getText() + "\r\nEndereço: " + txtEndereco.getText() + "\n" 
			+ "Sexo: " + cmbSexo.getSelectedItem() + "\n" + "E.C: " + cmbEstadoCivil.getSelectedItem();
				
				txtArea.setText(resultado);
				
			}
		});
		btnCalcular.setBounds(34, 176, 180, 23);
		contentPane.add(btnCalcular);
		
		
		
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNome.setText(null);
				txtEndereco.setText(null);
				cmbSexo.setSelectedIndex(0);
				cmbEstadoCivil.setSelectedIndex(0);
				txtArea.setText(null);
			}
		});
		btnLimpar.setBounds(221, 176, 180, 23);
		contentPane.add(btnLimpar);
		
		
	}
}
