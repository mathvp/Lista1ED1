package exercicio5;

import java.awt.event.*;

public class Exercicio5Controller {
	private Exercicio5View ex5_view;
	private Exercicio5Model ex5_model;
	
	public Exercicio5Controller(Exercicio5View view, Exercicio5Model model) {
		ex5_view = view;
		ex5_model = model;
		view.addContinuarListener(new continuarListener());
	}
	
	class numAleatorioListener implements ActionListener{
		int[] vetorValores = new int[Exercicio5Model.TAM_VETOR];
		
		public void actionPerformed(ActionEvent e) {
			vetorValores = ex5_model.gerarValAleatorios();
			ex5_view.setAllInputs(vetorValores);
		}
	}
	
	class continuarListener implements ActionListener{
		int[] vetorOriginal = new int[Exercicio5Model.TAM_VETOR];	
		int[] vetorRepetidos = new int[Exercicio5Model.TAM_VETOR];	
		
		public void actionPerformed(ActionEvent e) {
			vetorOriginal = ex5_view.getAllInputsVal();
			vetorRepetidos = ex5_model.encontrarValRepetidos(vetorOriginal);
			
			if(vetorRepetidos[0] == 0) {				
				Resultado result = new Resultado();
				
				String[] colNames = {"Valores informados"};
				Object[][] data = new Object[Exercicio5Model.TAM_VETOR][2];
	
				for (int j = 0; j < vetorOriginal.length; j++) {
					data[j][0] = vetorOriginal[j];				    
				}			
					
				result.addResultRow(colNames, data);
				result.setVisible(true);
			}else {
				ex5_view.exibirMsg("Valores repetidos foram encontrados!");
			}
		}
	}
	
	class limparListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			ex5_view.limparCampos();
		}
	}
}
