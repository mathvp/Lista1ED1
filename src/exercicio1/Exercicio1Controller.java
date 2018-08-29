package exercicio1;

import java.awt.event.*;

public class Exercicio1Controller {
	private Exercicio1View ex1_view;
	private Exercicio1Model ex1_model;
	
	public Exercicio1Controller(Exercicio1View view, Exercicio1Model model) {
		ex1_view = view;
		ex1_model = model;
		
		view.addNumAleatorioListener(new numAleatorioListener());
		view.addContinuarListener(new continuarListener());
		view.addLimparListener(new limparListener());
	}
	
	class numAleatorioListener implements ActionListener{
		int[] vetorValores = new int[Exercicio1Model.TAM_VETOR];
		
		public void actionPerformed(ActionEvent e) {
			vetorValores = ex1_model.gerarValAleatorios();
			ex1_view.setAllInputs(vetorValores);
		}
	}
	
	class continuarListener implements ActionListener{
		int[] vetorOriginal = new int[Exercicio1Model.TAM_VETOR];
		int[] vetorQuadrado = new int[Exercicio1Model.TAM_VETOR];
		
		public void actionPerformed(ActionEvent e) {
			vetorOriginal = ex1_view.getAllInputsVal();
			vetorQuadrado = ex1_model.quadradoVetor(vetorOriginal);
			Resultado result = new Resultado();
			
			String[] colNames = {"Valor original", "Valor²"};
			Object[][] data = new Object[Exercicio1Model.TAM_VETOR][2];

			for (int j = 0; j < vetorQuadrado.length; j++) {
			    data[j][0] = vetorOriginal[j];
			    data[j][1] = vetorQuadrado[j];
			}
			
			result.addResultRow(colNames, data);
			result.setVisible(true);
		}
	}
	
	class limparListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			ex1_view.limparCampos();
		}
	}
}
