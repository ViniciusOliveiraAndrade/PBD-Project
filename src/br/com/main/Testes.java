package br.com.main;

import java.util.Date;

import javax.swing.JFrame;

import org.hibernate.dialect.DataDirectOracle9Dialect;

import br.com.model.beans.Autor;
import br.com.model.beans.Caixa;
import br.com.model.beans.Departamento;
import br.com.model.beans.Funcionario;
import br.com.model.beans.Livro;
import br.com.model.beans.Usuario;
import br.com.model.controller.EmprestimoController;
import br.com.model.dao.AutorDAO;
import br.com.model.dao.DepartamentoDAO;
import br.com.model.dao.EmprestimoDAO;
import br.com.model.dao.FuncionarioDAO;
import br.com.model.dao.LivroDAO;
import br.com.model.dao.UsuarioDAO;
import br.com.view.funcionario.cadastro.PainelCadastroUsuario;
import br.com.view.primaria.TelaPrincipal;

public class Testes {
	
	public static void main(String[] args) {
		new TelaPrincipal();
//		Autor a = new Autor("Vinicius");
//		AutorDAO.persist(a);
//		Livro l = new Livro(1, 1, 10, "oi eu sou omgoku", AutorDAO.getById(12), "dsds", "10/10/1000");
//		LivroDAO.persist(l);
//		Funcionario f = new Funcionario(1, "1234", "viniFum");
//		FuncionarioDAO.persist(f);
//		Usuario u = new Usuario(1, "12",3, "daw", "ferrou", "vinic", "sdsd");
//		UsuarioDAO.persist(u);
//		EmprestimoController ec = new EmprestimoController();
//		ec.criarEmprestimo(LivroDAO.getById(4), UsuarioDAO.getById(3), FuncionarioDAO.getById(1));
//		ec.devolverEmprestimo(EmprestimoDAO.getById(8),FuncionarioDAO.getById(1) );
		
//		Caixa c = new Caixa();
//		for (int i = 0; i<c.getCaixa().size(); i++) {
//			System.out.println(c.getCaixa().get(i).getMulta());
//		}
		
//		JFrame f = new JFrame("");
//		f.setSize(500, 500);
//		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		f.setContentPane(new PainelCadastroUsuario());
//		f.setVisible(true);
//		Departamento d = new Departamento();
//		d.setNome("c");
//		DepartamentoDAO.persist(d);
		
		
//		System.exit(0);
	}
}
