package exercicio4;

import java.util.Random;

public class Exercicio4Model {
	public static final int TAM_VETOR = 30;	
	private int[] vetor = new int[TAM_VETOR];	
	private int[] vetorPar = new int[TAM_VETOR];
	private int[] vetorImp = new int[TAM_VETOR];
	private int[] vetorQuadPar = new int[TAM_VETOR];
	private int[] vetorCuboImp = new int[TAM_VETOR];
	Random rand;
	
	public Exercicio4Model() {
		
	}
	
	public int[] gerarValAleatorios() {
		rand = new Random();		
		for(int i=0; i<TAM_VETOR; i++) {
		    this.vetor[i] = rand.nextInt(999);
		}
		
		return this.vetor;
	}
	
	public int[] quadradoVetor(int[] valores){
		int[] vetorQuad = new int[valores.length];
		
		for(int i=0; i<valores.length; i++) {
			vetorQuad[i] = valores[i] * valores[i];
		}
		
		return vetorQuad;
	}
	
	public int[] cuboVetor(int[] valores){
		int[] vetorCubo = new int[valores.length];
		
		for(int i=0; i<valores.length; i++) {
			vetorCubo[i] = valores[i] * valores[i] * valores[i];
		}
		
		return vetorCubo;
	}
	
	public boolean ehPar(int num) {
		return (num%2 == 0)? true : false;
	}

	public void separacaoValores(int[] arrDados) {
		int numPar = 0;
		int numImp = 0;
		
		for(int i=0; i<arrDados.length; i++){
			if(ehPar(arrDados[i])) {
				vetorPar[numPar] = arrDados[i];
				numPar++;
			}else {
				vetorImp[numImp] = arrDados[i];
				numImp++;
			}
		}
		vetorQuadPar = quadradoVetor(vetorPar);
		vetorCuboImp = cuboVetor(vetorImp);
	}
	
	public int[] getPares() {
		return vetorPar;
	}
	public int[] getParesQuad() {
		return vetorQuadPar;
	}
	public int[] getImpares() {
		return vetorImp;
	}
	public int[] getImparesCubo() {
		return vetorCuboImp;
	}
}

