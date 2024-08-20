package aparelho;

import funcoes.AparelhoTelefonico;
import funcoes.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico {
	public static void main(String[] args) {
		AparelhoTelefonico novo = new Iphone();
		novo.ligar("2345678");
	}
}
