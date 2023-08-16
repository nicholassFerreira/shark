package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;

public class telefone extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telefone frame = new telefone();
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
	public telefone() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 782, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setBounds(76, 14, 34, 14);
		contentPane.add(lblTipo);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(120, 61, 86, 20);
		contentPane.add(textField_1);
		
		JLabel lblTelefone = new JLabel("Telefone: ");
		lblTelefone.setBounds(61, 64, 49, 14);
		contentPane.add(lblTelefone);
		
		JButton btnAdd = new JButton("Adicionar");
		btnAdd.setBounds(21, 148, 89, 23);
		contentPane.add(btnAdd);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(21, 182, 89, 23);
		contentPane.add(btnAlterar);
		
		JButton btnTelefone = new JButton("Telefones");
		btnTelefone.setBounds(117, 182, 89, 23);
		contentPane.add(btnTelefone);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(117, 148, 89, 23);
		contentPane.add(btnExcluir);
		
		JComboBox comboBoxTipo = new JComboBox();
		comboBoxTipo.setToolTipText("");
		comboBoxTipo.setBounds(120, 10, 86, 22);
		contentPane.add(comboBoxTipo);
		
		textField = new JTextField();
		textField.setBounds(373, 14, 345, 191);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		
	}
}
