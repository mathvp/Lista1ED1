package exercicio3;

import java.util.Random;

public class Exercicio3Model {
	public static final int TAM_VETOR = 16;	
	private int[] vetor = new int[TAM_VETOR];
	private int[] maiorNum = new int[2];
	Random rand;
	
	public Exercicio3Model() {
		
	}
	
	public int[] gerarValAleatorios() {
		rand = new Random();		
		for(int i=0; i<TAM_VETOR; i++) {
		    this.vetor[i] = rand.nextInt(999) + 1;
		}
		
		return this.vetor;
	}
	
	public boolean numRepetido(int[] arr, int num, int qtdMinimaOcorrencia) {
		int qtdRepeticoes = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==num)
				qtdRepeticoes++;
		}
		if(qtdRepeticoes>qtdMinimaOcorrencia)
			return true;
		
		return false;
	}
	
	public int[] encontrarValRepetidos(int[] valores) {
		int[] valoresClone = valores;
		int[] valoresRepetidos = new int[valores.length];
		int totalRepetidos = 0;
		
		for(int i=0; i<valores.length; i++) {
			int busca = valores[i];
			
			if(numRepetido(valoresClone, busca, 1)){
				if(!numRepetido(valoresRepetidos, busca, 0)) {
					valoresRepetidos[totalRepetidos] = busca;
					totalRepetidos++;
				}
			}

		}
		
		return valoresRepetidos;
	}
	
}
