package pessoa;

public class Pessoa {


	// criacao de atributos
	int cpf;
	String nome;
	boolean endereco;
	
	void cadastrar(){
		
	if(endereco)
	{
	
System.out.println("erro ! endereço da pessoa");	

	}
	else{
		System.out.println("cadastrar");
		
	}
	}
	void aprovar (){
		
endereco=true;
	}
	void reprovar(){
	
		endereco=false;
	}

	void status() {
		
	System.out.println("classe pessoa");
	System.out.println("cpf " + cpf);
	System.out.println("nome " + nome);
	System.out.println("endereco:" + endereco);
	
}


}



