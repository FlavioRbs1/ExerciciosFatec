package ExercicioBanco;

import java.util.Date;

public class transacao {

	private double valor;
	private Date data;


	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}
}
