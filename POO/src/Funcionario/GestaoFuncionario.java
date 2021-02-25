package Funcionario;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class GestaoFuncionario {

	public static void main (String[] args) {
	int indice;
	int funcionarios [] = new int[50];
	Funcionario func = new Funcionario();
	
	for(long i = 0;i <=50;i++) {
		menu(i);
	}
	
	}
	
	public static void menu(long i) {
		
		String escolha=JOptionPane.showInputDialog("Escolha uma opção: (C)riar (E)xibir (R)emover (A)tualizar (S)air");
		
		switch(escolha) 
		{
		case "C": case "c":
			criar(i);
			break;
		case "E": case "e":
			exibir();
			break;
		case "R": case "r":
			excluir();
			break;
		case "A": case "a":
			atualizar();
			break;
		case "S": case "s":
			break;
		default:
			System.out.println("Insira uma opção valida");
						
		
		
		}
	}
	
	
	
	public static void criar(long i) {
		
		Funcionario func = new Funcionario();
		long variavel = i;
		String matricula = JOptionPane.showInputDialog("Informe o numero da matricula",func.getMatricula());
		String nome = JOptionPane.showInputDialog("Informe o nome do funcionário",func.getMatricula());
		Date admissao = new Date();
		SimpleDateFormat sdft = new SimpleDateFormat("dd/MM/yyyy");
		Date demissao;
		String salario = JOptionPane.showInputDialog("Informe o salario",func.getSalario());
		String horario;
		
		
		func.setId(variavel);
		func.setMatricula(matricula);
		func.setNome(nome);
		func.setAdmissao(sdft);
		func.setSalario(salario);
//		func.setHorario(horario);
//		func.setDemissao(demissao);
	
		
		System.out.println("ID :"+func.getId(variavel)+"\nMatricula:  "+func.getMatricula()+"\nNome: "+func.getNome()+"\nAdmissão: "+func.getAdmissao()+"\nSalario: "+func.getSalario());
		
		
	}
	
	public static void atualizar() {
		System.out.println("Atualizando");		
	}
	public  static void excluir () {
		System.out.println("excluindo");
	}
	public  static void exibir () {
		
		JOptionPane.showMessageDialog(null,"exibindo");
		
	}
	
}
