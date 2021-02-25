package Loja_virtual;

import java.util.ArrayList;

public class Pedido {
	private long id;
	Contato contato = new Contato();
	ArrayList<String>Produto = new ArrayList();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
}
