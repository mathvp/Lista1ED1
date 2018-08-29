package exercicio4;

import java.awt.event.*;

public class Exercicio4Controller {
	private Exercicio4View ex4_view;
	private Exercicio4Model ex4_model;
	
	public Exercicio4Controller(Exercicio4View view, Exercicio4Model model) {
		ex4_view = view;
		ex4_model = model;
		
		view.addNumAleatorioListener(new numAleatorioListener());
		view.addContinuarListener(new continuarListener());
		view.addLimparListener(new limparListener());
	}
	
	class numAleatorioListener implements ActionListener{
		int[] vetorValores = new int[Exercicio4Model.TAM_VETOR];
		
		public void actionPerformed(ActionEvent e) {
			vetorValores = ex4_model.gerarValAleatorios();
			ex4_view.setAllInputs(vetorValores);
		}
	}
	
	class continuarListener implements ActionListener{
		int[] vetorOriginal = new int[Exercicio4Model.TAM_VETOR];
		int[] vetorPar = new int[Exercicio4Model.TAM_VETOR];
		int[] vetorQuadPar = new int[Exercicio4Model.TAM_VETOR];
		int[] vetorImp = new int[Exercicio4Model.TAM_VETOR];
		int[] vetorCuboImp = new int[Exercicio4Model.TAM_VETOR];
		
		public void actionPerformed(ActionEvent e) {
			vetorOriginal = ex4_view.getAllInputsVal();
			ex4_model.separacaoValores(vetorOriginal);
			vetorPar = ex4_model.getPares();
			vetorQuadPar = ex4_model.getParesQuad();
			vetorImp = ex4_model.getImpares();
			vetorCuboImp = ex4_model.getImparesCubo();
			
			Resultado result = new Resultado();
			
			String[] colNames = {"Números Pares", "Quadrado Pares²", "Números Impares", "Cubo Impares³"};
			Object[][] data = new Object[Exercicio4Model.TAM_VETOR][4];

			for (int j = 0; j < vetorOriginal.length; j++) {
			    data[j][0] = vetorPar[j];
			    data[j][1] = vetorQuadPar[j];
			    data[j][2] = vetorImp[j];
			    data[j][3] = vetorCuboImp[j];
			}
			
			result.addResultRow(colNames, data);
			result.setVisible(true);
		}
	}
	
	class limparListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			ex4_view.limparCampos();
		}
	}
}
