
public class Dinossauro {

	private int energia = 100;
	private int velocidade = 100;
	private int temperatura = 40;
	private int humor = 100;
	
	public int getEnergia() {
		return energia;
	}
	public void setEnergia(int energia) {
		this.energia = energia;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public int getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
	public int getHumor() {
		return humor;
	}
	public void setHumor(int humor) {
		this.humor = humor;
	}
	
	public void pular() {
		
		setEnergia(energia - 1);
		setHumor(humor + 1);
		System.out.println("Skeep está pulando");
		System.out.println("Energia:"+energia+"\nVelocidade:"+velocidade+"\nTemperatura: "+temperatura+"\nHumor: "+humor+"\n\n");
	

	
	}
	public void correr() {
		setVelocidade(velocidade + 1);
		setEnergia(energia - 1);
		setHumor(humor + 1);
		System.out.println("Skeep está correndo");
		System.out.println("Energia:"+energia+"\nVelocidade:"+velocidade+"\nTemperatura: "+temperatura+"\nHumor: "+humor+"\n\n");
		
	}
	public void comer() {
		setEnergia(energia + 1);
		setHumor(humor + 1);	
		System.out.println("Skeep está Comendo");
		System.out.println("Energia:"+energia+"\nVelocidade:"+velocidade+"\nTemperatura: "+temperatura+"\nHumor: "+humor+"\n\n");
		
	}
	public void atirar() {
		setEnergia(energia - 1);
		setHumor(humor + 1);
		System.out.println("Skeep está atirando");
		System.out.println("Energia:"+energia+"\nVelocidade:"+velocidade+"\nTemperatura: "+temperatura+"\nHumor: "+humor+"\n\n");
		
	}
	public void tomarSol() {
		setTemperatura(temperatura + 1);
		System.out.println("Skeep está pulando");
		System.out.println("Energia:"+energia+"\nVelocidade:"+velocidade+"\nTemperatura: "+temperatura+"\nHumor: "+humor+"\n\n");
		
	}
	public void ficarNaSombra(){
		setEnergia(energia + 1);
		setHumor(humor - 1);
		System.out.println("Skeep está na sombra");
		System.out.println("Energia:"+energia+"\nVelocidade:"+velocidade+"\nTemperatura: "+temperatura+"\nHumor: "+humor+"\n\n");
		
	}
	
}
