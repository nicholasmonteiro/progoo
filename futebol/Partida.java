
	import java.time.LocalDateTime;

	// importando numeros aleatorios//
	import java.util.Random;

	public class Partida implements Ipartida {
		
		private Time timeVisitante ;
		private Time timeLocal;
		private Integer scoreVisitante;
		private  Integer scoreLocal;
		private  LocalDateTime dataPartida;
		
		// inicializando valores //
		public Partida(Time timeVisitante, Time timeLocal) 
		{
			 
			// chamando o metodo super para acessar atributos de super classe//
			super();
			
			this.timeVisitante = timeVisitante;
			
			this.timeLocal = timeLocal;
			
			this.scoreVisitante = 0;
			
			this.scoreLocal = 0;
			
			this.dataPartida= LocalDateTime.now();
		}


		
		



		public Time getTimeVisitante() {
			return timeVisitante;
		}
		
		
		public void setTimeVisitante(Time timeVisitante) {
			this.timeVisitante = timeVisitante;
		}
		
		
		public Time getTimeLocal()
		
		{
			
			return timeLocal;
		}
		
		
		
		public void setTimeLocal(Time timeLocal) 
		{
		
			this.timeLocal = timeLocal;
		}
		
		public Integer getScoreVisitante() 
		{
			
			
			return scoreVisitante;
		}
		
		public void setScoreVisitante(Integer scoreVisitante)  
		{
			
		
			
			this.scoreVisitante = scoreVisitante;
		
		
		}
		
		
		public Integer getScoreLocal() 
		{
			
			
			return scoreLocal;
		
		}
		
		public void setScoreLocal(Integer scoreLocal)
		{
			
			
			this.scoreLocal = scoreLocal;
		
		
		}
		
		public LocalDateTime getDataPartida() 
		
		{
			
			
			return dataPartida;
		
		}
		
		public void setDataPartida(LocalDateTime dataPartida)
		{
			this.dataPartida = dataPartida;
		
		
		
		}
		
		
		
		
		// fazendo referencia um numero//
		
		public void iniciarPartida() {
			// agora  referindo ao objeto//
		// gerando numero aleatorios//
			this.scoreVisitante = new Random ().nextInt(7);
			
			this.scoreLocal= new Random().nextInt(7);
			
			
			
		}
		@Override
		
		// printando  o valor na  tela //
		
		public void mostrarResultado() {
		
			//  pegando o valor nome dentro da classe time //*
			
			System.out.println(timeLocal.getNome() +" "+ scoreLocal + " X " + scoreVisitante +" "+ timeVisitante.getNome());
			
		}
			

		@Override
		
		// agora comparando os valores do time //
		public void finalizarPartida() {
		
		
			
			
			if(scoreLocal.equals(scoreVisitante))
			{
				timeLocal.Empate();
				timeVisitante.derrota();
				
					
			}
			
			
			if (scoreLocal.equals(scoreVisitante))
			{
				
				
					timeLocal.derrota();
			        timeVisitante.Empate();	
				
			
				}
				
			
			
			
			 if (scoreLocal < scoreVisitante) {

				timeLocal.derrota();
				timeVisitante.Vitoria();
				
			}
		

		      else if (scoreLocal > scoreVisitante)
		{

			timeLocal.Vitoria();
			timeVisitante.derrota();
			
		}
		}




	}



