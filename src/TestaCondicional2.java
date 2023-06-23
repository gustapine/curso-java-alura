
public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 20;
		int qtd_pessoas = 3;
		boolean acompanhado = qtd_pessoas >= 2;
		
		System.out.println("valor acompanhado = " + acompanhado);
		if(idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo");
		}else {
				System.out.println("Infelizmente vc não pode entrar");
		}
	}
}

