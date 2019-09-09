//matricula 0050011999//
// nicholas monteiro//


package Trabalho2;

import java.util.ArrayList;

public class Usuario {
	
	
	private String login;
	private String senha;

private ArrayList<Tweet> tweets;



public Usuario(String login, String senha) 
{
	this.tweets = new ArrayList<>();
	this.setLogin(login);
	this.setSenha(senha);
	if (!this.verificaSenha()) { 
		System.out.println("Senha incorreta");
		System.exit(0);
	}
}

private boolean verificaSenha() 
{
	if (this.getSenha().equals("oop"))
	{
		return true;
	} 
	else 
	{
		return false;
	}
}

public void tweetar(String mensagem) 
{
	Tweet tweet = new Tweet(mensagem);
	this.tweets.add(tweet);
}

public void listagemTweets() 
{
	System.out.printf("\nLogin: %s\n", this.getLogin());

	for (int i = 0; i < this.tweets.size(); i++) 
	{
		Tweet tweet = this.tweets.get(i);
		System.out.printf("Tweet %s:" , i+1 );
		System.out.println(tweet.getTweet());
	}
}

private String getLogin() 
{
	return this.login;
}

private String getSenha() {
	return this.senha;
}

private void setLogin(String login) {
	this.login = login;
}

private void setSenha(String senha) {
	this.senha = senha;
}
}






	


