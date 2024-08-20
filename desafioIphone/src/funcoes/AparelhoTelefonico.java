package funcoes;

public interface AparelhoTelefonico {

	public default  void ligar(String numero) {
		System.out.println("Ligando para" + numero);
	
	}
	


}
