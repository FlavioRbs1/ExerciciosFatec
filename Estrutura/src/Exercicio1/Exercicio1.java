package Exercicio1;
/*
 * Escreva as seguintes estruturas de forma que estas possibilitem o armazenamento de
um conjunto de informações. As estruturas que devem ser criadas são: Aluno, Paciente,
Funcionário, Carro, Cachorro, Casa. Cada estrutura deverá possuir no mínimo três
dados e no máximo de cinco (tipos diferentes ou não).
 */
public class Exercicio1 {

	public class Aluno{
		private String Nome;
		private String Sexo;
		private int Matricula;
		private int Ano;
		
		public String getNome() {
			return Nome;
		}
		
		public void setNome(String nome) {
			this.Nome = nome;
		}

		public String getSexo() {
			return Sexo;
		}

		public void setSexo(String sexo) {
			this.Sexo = sexo;
		}

		public int getMatricula() {
			return Matricula;
		}

		public void setMatricula(int matricula) {
			this.Matricula = matricula;
		}

		public int getAno() {
			return Ano;
		}

		public void setAno(int ano) {
			this.Ano = ano;
		}
	}
	public class Paciente{
		private String Nome;
		private String Doenca;
		private int Idade;
		private String Sexo;
		
		public String getNome() {
			return Nome;
		}
		public void setNome(String nome) {
			this.Nome = nome;
		}
		public String getDoenca() {
			return Doenca;
		}
		public void setDoenca(String doenca) {
			this.Doenca = doenca;
		}
		public int getIdade() {
			return Idade;
		}
		public void setIdade(int idade) {
			this.Idade = idade;
		}
		public String getSexo() {
			return Sexo;
		}
		public void setSexo(String sexo) {
			this.Sexo = sexo;
		}
		
	}
	public class Funcionario{
		private String Nome;
		private String Departamento;
		private int Matricula;
		private double Salario;
		public String getNome() {
			return Nome;
		}
		public void setNome(String nome) {
			this.Nome = nome;
		}
		public String getDepartamento() {
			return Departamento;
		}
		public void setDepartamento(String departamento) {
			this.Departamento = departamento;
		}
		public int getMatricula() {
			return Matricula;
		}
		public void setMatricula(int matricula) {
			this.Matricula = matricula;
		}
		public double getSalario() {
			return Salario;
		}
		public void setSalario(double salario) {
			this.Salario = salario;
		}
	}
	public class carro{
		private String Modelo;
		private String Marca;
		private int QtdPortas;
		private double Valor;
		public String getModelo() {
			return Modelo;
		}
		public void setModelo(String modelo) {
			this.Modelo = modelo;
		}
		public String getMarca() {
			return Marca;
		}
		public void setMarca(String marca) {
			this.Marca = marca;
		}
		public int getQtdPortas() {
			return QtdPortas;
		}
		public void setQtdPortas(int qtdPortas) {
			this.QtdPortas = qtdPortas;
		}
		public double getValor() {
			return Valor;
		}
		public void setValor(double valor) {
			this.Valor = valor;
		}
	}
	public class cachorro{
		private String Nome;
		private String Raca;
		private int Idade;
		private int Cor;
		public String getNome() {
			return Nome;
		}
		public void setNome(String nome) {
			this.Nome = nome;
		}
		public String getRaca() {
			return Raca;
		}
		public void setRaca(String raca) {
			this.Raca = raca;
		}
		public int getIdade() {
			return Idade;
		}
		public void setIdade(int idade) {
			this.Idade = idade;
		}
		public int getCor() {
			return Cor;
		}
		public void setCor(int cor) {
			this.Cor = cor;
		}
	}
	public class casa{
		private String Endereco;
		private String Tipo;
		private int QtdComodos;
		private double Valor;
		public String getEndereco() {
			return Endereco;
		}
		public void setEndereco(String endereco) {
			this.Endereco = endereco;
		}
		public String getTipo() {
			return Tipo;
		}
		public void setTipo(String tipo) {
			this.Tipo = tipo;
		}
		public int getQtdComodos() {
			return QtdComodos;
		}
		public void setQtdComodos(int qtdComodos) {
			this.QtdComodos = qtdComodos;
		}
		public double getValor() {
			return Valor;
		}
		public void setValor(double valor) {
			this.Valor = valor;
		}
	}
}
