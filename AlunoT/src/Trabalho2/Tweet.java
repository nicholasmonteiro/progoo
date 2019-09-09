//matricula 0050011999//
// nicholas monteiro//


package Trabalho2;

public class Tweet {
	
private String descricao;

	
	public Tweet(String mensagem) 
	{
		if (mensagem.length() >= 200) 
		{
			
			mensagem = mensagem.substring(0, 200);
		}
		else 
		{
			
			this.descricao = mensagem;
		}
	}
	

public String getTweet() {
	
	return this.descricao;
}

public void setTweet(String mensagem) {
	
	this.descricao = mensagem;
}

}



