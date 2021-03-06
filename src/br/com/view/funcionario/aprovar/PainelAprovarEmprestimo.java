package br.com.view.funcionario.aprovar;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.TitledBorder;

import br.com.controller.funcionario.aprovar.ControllerPainelAprovarEmprestimo;
import br.com.model.beans.Funcionario;
import br.com.view.primaria.TabelaPadrao;

import javax.swing.border.LineBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;

public class PainelAprovarEmprestimo extends JPanel{
	
	private static final long serialVersionUID = 1L;
	
	private TabelaPadrao tabelaReservas;
	
	private JButton aprovarButton;
	private JButton atualizarButton;
	
	private Funcionario funcionario;
	
	private ControllerPainelAprovarEmprestimo controller;
	
	public PainelAprovarEmprestimo(Funcionario funcionario) {
		this.funcionario = funcionario;
		setBorder(new TitledBorder(new LineBorder(new Color(64, 64, 64), 2, true), "Aprovar Reserva", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setBackground(Color.WHITE);
		setLayout(new BorderLayout(0, 0));
		
		controller = new ControllerPainelAprovarEmprestimo(this);
		
		this.tabelaReservas = new TabelaPadrao("Emprestimos");
		this.tabelaReservas.setColumns(new Object[] {"Id","Titulo do Livro","Situação","Data do Emprestimo","Data presvista Entrega","Data da Entrega","Multa","Funcionario Emprestimo","Funcionario Devolução"});
		this.tabelaReservas.podeSelecionar(true);
		this.add(this.tabelaReservas, BorderLayout.CENTER);
		
		this.aprovarButton = new JButton("Aprovar");
		this.aprovarButton.addActionListener(controller);
		this.add(this.aprovarButton, BorderLayout.SOUTH);
		
		this.atualizarButton = new JButton("Atualizar");
		this.atualizarButton.addActionListener(controller);
		this.add(atualizarButton, BorderLayout.NORTH);
		
		this.controller.preencherTabela();
	}

	public TabelaPadrao getTabelaReservas() {
		return tabelaReservas;
	}

	public JButton getAprovarButton() {
		return aprovarButton;
	}

	public JButton getAtualizarButton() {
		return atualizarButton;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}
	
	
	
}
