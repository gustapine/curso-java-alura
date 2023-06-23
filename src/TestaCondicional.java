
public class TestaCondicional {
	public static void main(String[] args) {
		
		System.out.println("testando condicionais");
		int idade = 16;
		int qtd_pessoas = 3;
		
		if(idade >= 18) {
			System.out.println("Vc tem mais de 18 anos");
			System.out.println("Seja bem vindo");
		}else {
			if(qtd_pessoas >= 2) {
				System.out.println("voce não pode entrar, "+ "pois está acompanhado");
			}else {
				System.out.println("Infelizmente vc não pode entrar");
			}
		}
	}
}
