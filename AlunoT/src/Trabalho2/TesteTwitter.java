
Crie 3 Classes: Usuario, Tweet, TestTweet.
Faça um programa(TestTweet) para pedir login e senha do usuario (Atributos da Classe Usuário) e compare com a senha "poo".
Após o login, peça com que ele entre com o Tweet (texto de 140 caracteres) e pergunte se deseja twitar novamente.Se usuário escolher sim, você deve continuar pedindo o texto do Tweet. Ao final do programa, você deve listar : login e todos os tweetes que foram inseridos no programa (use ArrayList). PAra isso, crie um método listar dentro da classe Usuario.
Resumindo o modelo de Classes: Um Usuário pode ter um ou mais Tweets

Observações:
1- Deixar todos os atributos privados. Usar Getter/Setter para alterar os mesmos.
2-No construtor, crie um atributo senha e inicial e com "OOP". Esta deverá ser a senha de comparação no momento do login
3-Estou anexando a explicação do diagrama de Classes comentado ontem em sala de aula.
4-Comentem o código de vocês, coloque o nome e matricula no cabeçalho das Classes.



//matricula 0050011999//
// nicholas monteiro//

package Trabalho2;


import java.util.Scanner;

public class TesteTwitter {

	public static void main(String[] args) {			
			Scanner ler = new Scanner(System.in);
			System.out.println("Login:");
			String usuario= ler.next();
			System.out.println("Senha:");
			String troca = ler.next();
			
			Usuario user = new Usuario(usuario, troca);
			
			int confere = 1;

			while (confere == 1) {
				System.out.println("Entre com seu tweet:");
				String tweet = ler.next();
				user.tweetar(tweet);

				System.out.println("deseja continuar tweetando?");
				
				if (!ler.next().equalsIgnoreCase("sim")) {
					confere = 0;
				}

			}
			

			user.listagemTweets();
			
			ler.close();	
					
	}
	


		
		
	}


