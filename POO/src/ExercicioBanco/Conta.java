package ExercicioBanco;

public class Conta {

	private double saldo;
	private String numero;
	private String senha;
	transacao historico = new transacao();
	
	public boolean efetuarSaque(double valor) {

		return true;
		
	}
	public boolean efetuarDeposito(double valor) {
		
		return true;
	}
	public boolean efetuarPagamento(String boleto, double valor) {
		
		return true;
	}
	public void extrato() {
		historico.getData();
		
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public transacao getHistorico() {
		return historico;
	}
	public void setHistorico(transacao historico) {
		this.historico = historico;
	}
}
