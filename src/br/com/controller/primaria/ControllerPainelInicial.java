package br.com.controller.primaria;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Observable;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import br.com.model.beans.Livro;
import br.com.model.controller.LivroController;
import br.com.model.controller.LoginController;
import br.com.view.Antiga.TFuncionario;
import br.com.view.Antiga.TUsuario;
import br.com.view.primaria.PainelInicial;
import br.com.view.primaria.TelaLogin;

public class ControllerPainelInicial extends Observable implements ActionListener{
	
	private PainelInicial painelInicial;
	private LivroController lc;
	
	private LoginController loginController;
	
	private boolean usuario = false;
	private boolean funionario = true;
	
	public ControllerPainelInicial(PainelInicial painelInicial) {
		this.painelInicial = painelInicial;
		this.lc = new LivroController();
		this.loginController = new LoginController();
	}
	
	private void preencherTabela(ArrayList<Livro> livros){
		this.painelInicial.getTabelaAcervo().zerarTabela();
		for(Livro l : livros) {
			this.painelInicial.getTabelaAcervo().setRow(new Object[] {l.getId(),l.getCodigo(),l.getNumero_edicao(),l.getTitulo(),l.getAno_publicacao(),l.getNumero_exemplares(),l.getEditora(),l.getAutor().getNome()});
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == this.painelInicial.getPesquisarButton()) {
			if(this.painelInicial.getPalavraChaveRB().isSelected()){
				preencherTabela(this.lc.getLivroByPalavraChave(this.painelInicial.getPesquisaField().getText()));
			}
			if(this.painelInicial.getTituloRB().isSelected()){
				preencherTabela(this.lc.getLivroByTitulo(this.painelInicial.getPesquisaField().getText()));
			}
			if(this.painelInicial.getAutorRB().isSelected()){
				preencherTabela(this.lc.getLivroByAutor(this.painelInicial.getPesquisaField().getText()));
			}
			if(this.painelInicial.getEditoraRB().isSelected()){
				preencherTabela(this.lc.getLivroByEditora(this.painelInicial.getPesquisaField().getText()));
			}
		}
		if(e.getSource() == this.painelInicial.getLogarButton()) {
			
			TelaLogin t = new TelaLogin();
			t.getLogarButton().addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(loginController.podeLogar(t.getCpfField().getText())) {
						if(loginController.eUsuario()) {
							
							t.dispose();
						}else {
							
							t.dispose();
						}
					}else {JOptionPane.showMessageDialog(t,	 "Matricula ou CPF n�o encontrados");}
				}
			});
		}
		if(e.getSource() == this.painelInicial.getSolicitarEmprestismoButton()) {
			
		}
		if(e.getSource() == this.painelInicial.getSolicitarReservaButton()) {}
	}

}
