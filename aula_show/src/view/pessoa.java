package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Window.Type;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class pessoa extends JFrame {

	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfDtNascimento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pessoa frame = new pessoa();
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
	public pessoa() {
		setTitle("Pessoa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 696, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfNome = new JTextField();
		tfNome.setBounds(139, 11, 86, 20);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		tfDtNascimento = new JTextField();
		tfDtNascimento.setColumns(10);
		tfDtNascimento.setBounds(139, 61, 86, 20);
		contentPane.add(tfDtNascimento);
		
		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setBounds(95, 14, 34, 14);
		contentPane.add(lblNome);
		
		JLabel lblDtNascimento = new JLabel("Data de Nascimento: ");
		lblDtNascimento.setBounds(29, 64, 103, 14);
		contentPane.add(lblDtNascimento);
		
		JLabel lblGenero = new JLabel("Genero:");
		lblGenero.setBounds(83, 104, 46, 14);
		contentPane.add(lblGenero);
		
		JRadioButton rdbtnHomem = new JRadioButton("H");
		rdbtnHomem.setBounds(139, 100, 34, 23);
		contentPane.add(rdbtnHomem);
		
		JRadioButton rdbtnMulher = new JRadioButton("M");
		rdbtnMulher.setBounds(191, 100, 34, 23);
		contentPane.add(rdbtnMulher);
		
		JButton btnAdd = new JButton("Adicionar");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				
			}
		});
		btnAdd.setBounds(40, 148, 89, 23);
		contentPane.add(btnAdd);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(136, 148, 89, 23);
		contentPane.add(btnExcluir);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(40, 182, 89, 23);
		contentPane.add(btnAlterar);
		
		JButton btnTelefone = new JButton("Telefones");
		btnTelefone.setBounds(136, 182, 89, 23);
		contentPane.add(btnTelefone);
	}
}
