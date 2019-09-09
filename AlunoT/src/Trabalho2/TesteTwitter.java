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


