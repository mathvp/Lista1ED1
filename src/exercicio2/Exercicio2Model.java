package exercicio2;

import java.util.Random;

public class Exercicio2Model {
	public static final int TAM_VETOR = 10;	
	private int[] vetor = new int[TAM_VETOR];
	private int[] maiorNum = new int[2];
	private int[] menorNum = new int[2];
	Random rand;
	
	public Exercicio2Model() {
		
	}
	
	public int[] gerarValAleatorios() {
		rand = new Random();		
		for(int i=0; i<TAM_VETOR; i++) {
		    this.vetor[i] = rand.nextInt(999) + 1;
		}
		
		return this.vetor;
	}
	
	public int[] maiorValor(int[] valores) {
		for(int i=0; i<TAM_VETOR; i++) {
		    if(valores[i] >= maiorNum[0]) {
		    	maiorNum[0] = valores[i];
		    	maiorNum[1] = i;
		    }   
		}		
		
		return maiorNum;
	}
	
	public int[] menorValor(int[] valores) {
		for(int i=0; i<TAM_VETOR; i++) {
		    if(i == 0) {
		    	menorNum[0] = valores[i];
		    	menorNum[1] = i;
		    }else{
		    	if(valores[i] <= menorNum[0]) {
		    		menorNum[0] = valores[i];
			    	menorNum[1] = i;
		    	}
		    }
		}
		
		return menorNum;
	}
}
