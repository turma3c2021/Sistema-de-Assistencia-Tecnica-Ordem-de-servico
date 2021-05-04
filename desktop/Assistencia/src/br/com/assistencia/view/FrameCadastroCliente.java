package br.com.assistencia.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class FrameCadastroCliente extends JFrame {

	private JPanel contentPane;
	private JTextField textCodigo;
	private JTextField textNome;
	private JTextField textCPF;
	private JTextField textEndereco;
	private JTextField textRG;
	private JTextField textTelefone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameCadastroCliente frame = new FrameCadastroCliente();
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
	public FrameCadastroCliente() {
		setTitle("Cadastro de Usu\u00E1rio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 377);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCdigo = new JLabel("C\u00F3digo:");
		lblCdigo.setBounds(12, 13, 56, 16);
		contentPane.add(lblCdigo);
		
		textCodigo = new JTextField();
		textCodigo.setBounds(12, 42, 116, 22);
		contentPane.add(textCodigo);
		textCodigo.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(12, 77, 56, 16);
		contentPane.add(lblNome);
		
		textNome = new JTextField();
		textNome.setBounds(12, 106, 545, 22);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(12, 141, 56, 16);
		contentPane.add(lblCpf);
		
		textCPF = new JTextField();
		textCPF.setColumns(10);
		textCPF.setBounds(12, 170, 248, 22);
		contentPane.add(textCPF);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setBounds(12, 205, 102, 16);
		contentPane.add(lblEndereo);
		
		textEndereco = new JTextField();
		textEndereco.setBounds(12, 234, 306, 22);
		contentPane.add(textEndereco);
		textEndereco.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("RG");
		lblNewLabel.setBounds(272, 141, 56, 16);
		contentPane.add(lblNewLabel);
		
		textRG = new JTextField();
		textRG.setColumns(10);
		textRG.setBounds(272, 170, 285, 22);
		contentPane.add(textRG);
		
		JLabel lblNewLabel_1 = new JLabel("Telefone");
		lblNewLabel_1.setBounds(330, 205, 108, 16);
		contentPane.add(lblNewLabel_1);
		
		textTelefone = new JTextField();
		textTelefone.setBounds(330, 234, 227, 22);
		contentPane.add(textTelefone);
		textTelefone.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(12, 269, 116, 48);
		contentPane.add(btnSalvar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(140, 269, 116, 48);
		contentPane.add(btnEditar);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(268, 269, 116, 48);
		contentPane.add(btnConsultar);
	}
}
