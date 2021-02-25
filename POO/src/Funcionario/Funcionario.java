package Funcionario;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Funcionario {

	
		private long id ;
		private String nome;
		private String matricula;
		private SimpleDateFormat admissao;
		private Date demissao;
		private String salario;
		private String horario;
		
		public long getId(long i) {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getMatricula() {
			return matricula;
		}
		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}
		public Date getAdmissao() {
			return admissao;
		}
		public void setAdmissao(SimpleDateFormat sdft) {
			this.admissao = sdft;
		}
		public Date getDemissao() {
			return demissao;
		}
		public void setDemissao(Date demissao) {
			this.demissao = demissao;
		}
		public String getSalario() {
			return salario;
		}
		public void setSalario(String salario) {
			this.salario = salario;
		}
		public String getHorario() {
			return horario;
		}
		public void setHorario(String horario) {
			this.horario = horario;
		}
		
		
	
}
