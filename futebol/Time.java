public class Time {
	
	

	private String nome; 
	
	private Integer qtdVitorias;
	
	private Integer qtdEmpates;
	
	private Integer qtdDerrotas;
	
	private Integer qtdPontos;

	
// inicializando os valores
public Time(String nome) 
{
	
	// chamando o metodo *super* para acessar atributos de super classe//
	 super();
	
	this.nome = nome;
	
	this.qtdDerrotas = 0;
	
	this.qtdEmpates = 0;
	
	this.qtdVitorias = 0;
	
	this.qtdPontos = 0;



}




public String getNome() 

{
	
	
	
	return nome;


}



public void setNome(String nome) 
{

	this.nome = nome;
}


public Integer getQtdVitorias() 
{
	return qtdVitorias;


}


public void setQtdVitorias(Integer qtdVitorias)
{
	this.qtdVitorias = qtdVitorias;


}



public Integer getQtdEmpates() {
	return qtdEmpates;


}


public void setQtdEmpates(Integer qtdEmpates) {
	this.qtdEmpates = qtdEmpates;

}


public Integer getQtdDerrotas() {
	return qtdDerrotas;


}



public void setQtdDerrotas(Integer qtdDerrotas)
{
	
	this.qtdDerrotas = qtdDerrotas;



}



public Integer getQtdPontos() 

{
	return qtdPontos;


}


public void setQtdPontos(Integer qtdPontos)
{
	this.qtdPontos = qtdPontos;

}



// fazendo auto referencia das classes e pegando valores dentro dela //

   public void  Vitoria()
{
	
	  this.setQtdVitorias(this.getQtdVitorias()+1); 
	  
	  this.setQtdPontos(this.getQtdPontos()+3);
	   
	   
}


public void Empate() {
	
	this.setQtdEmpates(this.getQtdEmpates() + 1);
	
	
	
	this.setQtdPontos(this.getQtdPontos() + 1);

	
}


public void derrota ()

{
	this.setQtdDerrotas(this.getQtdDerrotas() + 1);

}





//alistar os valores //
public void listar()
{
	System.out.println(this.toString());
}


/// printado o resultado final//

public String toString()

{
	
	System.out.println(" resultado do Time nome=" + nome + ", qtdVitorias=" + qtdVitorias + ", qtdEmpates=" + qtdEmpates + ", qtdDerrotas="
			+ qtdDerrotas + ", qtdPontos=" + qtdPontos + "");
	
	return nome;
	
	
}
}

	
	




