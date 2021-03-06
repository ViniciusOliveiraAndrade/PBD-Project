package br.com.controller.funcionario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

import br.com.controller.primaria.ControllerTelaPrincipal;
import br.com.view.funcionario.PainelFuncionario;

public class ControllerPainelFuncionario extends Observable implements ActionListener{

	private PainelFuncionario painelFuncionario;

	private boolean logado = true;

	public ControllerPainelFuncionario(PainelFuncionario painelFuncionario, ControllerTelaPrincipal c) {
		this.painelFuncionario = painelFuncionario;
		this.addObserver(c);
	}


	private void deslogar() {
		this.logado = false;
		this.setChanged();
		this.notifyObservers(this.logado);
	}

	public void actionPerformed(ActionEvent e) {

		//Painel de Menu

		//		if(e.getSource() == this.painelFuncionario.getbutton) {}
		if(e.getSource() == this.painelFuncionario.getCadastrarButton()) {this.painelFuncionario.mostrarCadastrarOpcoes();}

		if(e.getSource() == this.painelFuncionario.getAutalizarButton()) {this.painelFuncionario.mostrarAtualizarOpcoes();}

		if(e.getSource() == this.painelFuncionario.getListarButton()) {this.painelFuncionario.mostrarListarOpcoes();}

		if(e.getSource() == this.painelFuncionario.getAprovarButton()) {this.painelFuncionario.mostrarAprovarOpcoes();}

		if(e.getSource() == this.painelFuncionario.getRealizarButton()) {this.painelFuncionario.mostrarRelizarOpcoes();}

		if(e.getSource() == this.painelFuncionario.getCaixaButton()) {this.painelFuncionario.criarPainelCaixa();}

		if(e.getSource() == this.painelFuncionario.getDeslogarButton()) {this.deslogar();}

		//Paineis de Opcoes

		//Cadastro
		//		if(e.getSource() == this.painelFuncionario.getcOButton()) {System.out.println("cO");}
		if(e.getSource() == this.painelFuncionario.getcOUsuarioButton()) {
			this.painelFuncionario.criarPainelCadastrarUsuario();
		}

		if(e.getSource() == this.painelFuncionario.getcOFuncionarioButton()) {
			this.painelFuncionario.criarPainelCadastrarFuncionario();;
		}

		if(e.getSource() == this.painelFuncionario.getcOAutorButton()) {
			this.painelFuncionario.criarPainelCadastrarAutor();
		}

		if(e.getSource() == this.painelFuncionario.getcOLivroButton()) {
			this.painelFuncionario.criarPainelCadastrarLivro();
		}

		if(e.getSource() == this.painelFuncionario.getcOCursoButton()) {
			this.painelFuncionario.criarPainelCadastrarCurso();
		}

		if(e.getSource() == this.painelFuncionario.getcODepartamentoButton()) {
			this.painelFuncionario.criarPainelCadastrarDepartamento();
		}

		//Alterar

		if(e.getSource() == this.painelFuncionario.getaOUsuarioButton()) {
			this.painelFuncionario.criarPainelAlteraUsuario();
		}

		if(e.getSource() == this.painelFuncionario.getaOFuncionarioButton()) {
			this.painelFuncionario.criarPainelAlteraFuncionario();;
		}

		if(e.getSource() == this.painelFuncionario.getaOAutorButton()) {
			this.painelFuncionario.criarPainelAlteraAutor();
		}

		if(e.getSource() == this.painelFuncionario.getaOLivroButton()) {
			this.painelFuncionario.criarPainelAlteraLivro();
		}

		if(e.getSource() == this.painelFuncionario.getaOCursoButton()) {
			this.painelFuncionario.criarPainelAlteraCurso();
		}

		if(e.getSource() == this.painelFuncionario.getaODepartamentoButton()) {
			this.painelFuncionario.criarPainelAlteraDepartamento();
		}

		//Listar

		if(e.getSource() == this.painelFuncionario.getlOUsuarioButton()) {
			this.painelFuncionario.criarPainelListarUsuario();
		}

		if(e.getSource() == this.painelFuncionario.getlOFuncionarioButton()) {
		}

		if(e.getSource() == this.painelFuncionario.getlOAutorButton()) {
		}

		if(e.getSource() == this.painelFuncionario.getlOLivroButton()) {
		}

		if(e.getSource() == this.painelFuncionario.getlOCursoButton()) {
		}

		if(e.getSource() == this.painelFuncionario.getlODepartamentoButton()) {
		}
		if(e.getSource() == this.painelFuncionario.getlOEmprestimoButton()) {
		}

		if(e.getSource() == this.painelFuncionario.getlOReservaButton()) {
		}
		
		//Aprovar
		
		if(e.getSource() == this.painelFuncionario.getApOEmprestimoButton()) {
			this.painelFuncionario.criarPainelAprovarEmprestimo();
		}

		if(e.getSource() == this.painelFuncionario.getApOReservaButton()) {
			this.painelFuncionario.criarPainelAprovarReserva();
		}

		//realizar
		
		if(e.getSource() == this.painelFuncionario.getrOEmprestimoButton()) {
			this.painelFuncionario.criarPainelRealizarEmprestimo();
		}

		if(e.getSource() == this.painelFuncionario.getrOReservaButton()) {
			this.painelFuncionario.criarPainelRealizarReserva();
		}

		//		if(e.getSource() == this.painelFuncionario.getaOButton) {System.out.println("cO");this.painelFuncionario}


	}
}
