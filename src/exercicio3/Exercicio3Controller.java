package exercicio3;

import java.awt.event.*;

public class Exercicio3Controller {
	private Exercicio3View ex3_view;
	private Exercicio3Model ex3_model;
	
	public Exercicio3Controller(Exercicio3View view, Exercicio3Model model) {
		ex3_view = view;
		ex3_model = model;
		
		view.addNumAleatorioListener(new numAleatorioListener());
		view.addContinuarListener(new continuarListener());
		view.addLimparListener(new limparListener());
	}
	
	class numAleatorioListener implements ActionListener{
		int[] vetorValores = new int[Exercicio3Model.TAM_VETOR];
		
		public void actionPerformed(ActionEvent e) {
			vetorValores = ex3_model.gerarValAleatorios();
			ex3_view.setAllInputs(vetorValores);
		}
	}
	
	class continuarListener implements ActionListener{
		int[] vetorOriginal = new int[Exercicio3Model.TAM_VETOR];	
		int[] vetorRepetidos = new int[Exercicio3Model.TAM_VETOR];	
		
		public void actionPerformed(ActionEvent e) {
			vetorOriginal = ex3_view.getAllInputsVal();
			vetorRepetidos = ex3_model.encontrarValRepetidos(vetorOriginal);
			
			if(vetorRepetidos[0] == 0) {
				ex3_view.exibirMsg("Nenhum valor repetido encontrado");
				
			}else {
				Resultado result = new Resultado();
				
				String[] colNames = {"Valores Repetidos"};
				Object[][] data = new Object[Exercicio3Model.TAM_VETOR][2];
	
				for (int j = 0; j < vetorRepetidos.length; j++) {
					if(vetorRepetidos[j] != 0) {
						data[j][0] = vetorRepetidos[j];
					}
				    
				}			
					
				result.addResultRow(colNames, data);
				result.setVisible(true);
			}
		}
	}
	
	class limparListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			ex3_view.limparCampos();
		}
	}
}
