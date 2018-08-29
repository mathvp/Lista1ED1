package exercicio1;

import java.util.Random;

public class Exercicio1Model {
	public static final int TAM_VETOR = 20;	
	private int[] vetor = new int[TAM_VETOR];
	private int[] vetorQuad = new int[TAM_VETOR];
	Random rand;
	
	public Exercicio1Model() {
		
	}
	
	public int[] gerarValAleatorios() {
		rand = new Random();		
		for(int i=0; i<TAM_VETOR; i++) {
		    this.vetor[i] = rand.nextInt(999);
		}
		
		return this.vetor;
	}
	
	public int[] quadradoVetor(int[] valores){
		for(int i=0; i<TAM_VETOR; i++) {
			vetorQuad[i] = valores[i] * valores[i];
		}
		return vetorQuad;
	}
}
