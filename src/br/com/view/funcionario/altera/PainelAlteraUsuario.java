package br.com.view.funcionario.altera;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import br.com.controller.funcionario.altera.ControllerPainelAlteraUsuario;

import java.awt.GridLayout;

public class PainelAlteraUsuario extends JPanel{

	private static final long serialVersionUID = 1L;

	private JComboBox<String> departamentosFields;

	private JTextField codigoField;
	private JTextField matriculaField;
	private JTextField nomeField;
	private JTextField cpfField;
	private JTextField emailField;
	private JTextField telefoneField;
	private JTextField situacaoField;

	//	private JButton cancelarButton;
	private JButton limparButton;
	private JButton cadastrarButton;

	private JLabel codigoJLabel;
	private JLabel lblDepartamento;

	private JRadioButton aluno;

	private ControllerPainelAlteraUsuario controller;

	private JTextField buscarField;
	private JLabel buscarLabel;
	private JButton buscarButton;
	private JButton excluirButton;

	public PainelAlteraUsuario() {

		this.setBackground(Color.WHITE);
		this.setBorder(new TitledBorder(new LineBorder(new Color(64, 64, 64), 2, true), "Cadastro Usuario", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));	
		this.setLayout(new GridLayout(24,1 , 0, 0));
		this.controller = new ControllerPainelAlteraUsuario(this);

		this.aluno = new JRadioButton("Aluno");
		this.aluno.setSelected(true);
		this.aluno.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.aluno.setBackground(Color.WHITE);
		this.aluno.addActionListener(controller);
		this.add(this.aluno);

		this.buscarLabel = new JLabel("CPF:");
		this.add(this.buscarLabel);

		this.buscarField = new JTextField();
		buscarField.setColumns(15);
		this.add(this.buscarField);

		this.buscarButton = new JButton("Buscar");
		this.buscarButton.addActionListener(controller);
		this.add(this.buscarButton);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(lblNome);

		this.nomeField = new JTextField();
		this.nomeField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(this.nomeField);
		this.nomeField.setColumns(10);

		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(lblCpf);

		this.cpfField = new JTextField();
		this.cpfField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(this.cpfField);
		this.cpfField.setColumns(10);

		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(lblEmail);

		this.emailField = new JTextField();
		this.emailField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(this.emailField);
		this.emailField.setColumns(10);

		JLabel lblMatricula = new JLabel("Matricula:");
		lblMatricula.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(lblMatricula);

		this.matriculaField = new JTextField();
		this.matriculaField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(this.matriculaField);
		this.matriculaField.setColumns(10);

		this.codigoJLabel = new JLabel("Codigo:");
		this.codigoJLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(this.codigoJLabel);

		this.codigoField = new JTextField();
		this.codigoField.setFont(new Font("Tahoma", Font.PLAIN, 13));	
		this.add(this.codigoField);
		this.codigoField.setColumns(10);

		this.lblDepartamento = new JLabel("Departamento:");
		this.lblDepartamento.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(this.lblDepartamento);
		this.lblDepartamento.setVisible(false);

		this.departamentosFields = new JComboBox<>();
		this.departamentosFields.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(this.departamentosFields);
		this.departamentosFields.setVisible(false);

		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(lblTelefone);

		this.telefoneField = new JTextField();
		this.telefoneField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(this.telefoneField);
		this.telefoneField.setColumns(10);

		JLabel lblSituao = new JLabel("Situacao:");
		lblSituao.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(lblSituao);

		this.situacaoField = new JTextField();
		this.situacaoField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.add(this.situacaoField);
		this.situacaoField.setColumns(10);

		excluirButton = new JButton("Excluir");
		excluirButton.addActionListener(controller);
		add(excluirButton);

		this.limparButton = new JButton("Limpar");
		this.limparButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.limparButton.addActionListener(controller);
		this.add(this.limparButton);

		this.cadastrarButton = new JButton("Cadastrar");
		this.cadastrarButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		this.cadastrarButton.addActionListener(controller);
		this.add(this.cadastrarButton);

	}

	public void alunar() {
		this.lblDepartamento.setVisible(false);
		this.departamentosFields.setVisible(false);

		this.codigoJLabel.setVisible(true);
		this.codigoField.setVisible(true);
	}
	public void professorar() {
		if(departamentosFields.getItemCount() == 0) {
			this.controller.preencherDepartamentos();
		}
		this.codigoJLabel.setVisible(false);
		this.codigoField.setVisible(false);

		this.lblDepartamento.setVisible(true);
		this.departamentosFields.setVisible(true);

	}

	public JComboBox<String> getDepartamentosFields() {
		return departamentosFields;
	}

	public JTextField getCodigoField() {
		return codigoField;
	}

	public JTextField getMatriculaField() {
		return matriculaField;
	}

	public JTextField getNomeField() {
		return nomeField;
	}

	public JTextField getCpfField() {
		return cpfField;
	}

	public JTextField getEmailField() {
		return emailField;
	}

	public JTextField getTelefoneField() {
		return telefoneField;
	}

	public JTextField getTxtSituacaoField() {
		return situacaoField;
	}

	public JButton getLimparButton() {
		return limparButton;
	}

	public JButton getCadastrarButton() {
		return cadastrarButton;
	}

	public JRadioButton getAluno() {
		return aluno;
	}

	public JTextField getBuscarField() {
		return buscarField;
	}

	public JButton getBuscarButton() {
		return buscarButton;
	}

	public JButton getExcluirButton() {
		return excluirButton;
	}



}
