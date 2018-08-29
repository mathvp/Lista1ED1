package exercicio2;

import java.awt.event.*;

public class Exercicio2Controller {
	private Exercicio2View ex2_view;
	private Exercicio2Model ex2_model;
	
	public Exercicio2Controller(Exercicio2View view, Exercicio2Model model) {
		ex2_view = view;
		ex2_model = model;
		
		view.addNumAleatorioListener(new numAleatorioListener());
		view.addContinuarListener(new continuarListener());
		view.addLimparListener(new limparListener());
	}
	
	class numAleatorioListener implements ActionListener{
		int[] vetorValores = new int[Exercicio2Model.TAM_VETOR];
		
		public void actionPerformed(ActionEvent e) {
			vetorValores = ex2_model.gerarValAleatorios();
			ex2_view.setAllInputs(vetorValores);
		}
	}
	
	class continuarListener implements ActionListener{
		int[] vetorOriginal = new int[Exercicio2Model.TAM_VETOR];
		int[] maiorElemento = new int[2];
		int[] menorElemento = new int[2];		
		
		public void actionPerformed(ActionEvent e) {
			vetorOriginal = ex2_view.getAllInputsVal();			
			maiorElemento = ex2_model.maiorValor(vetorOriginal);
			menorElemento = ex2_model.menorValor(vetorOriginal);
			
			Resultado result = new Resultado();
			
			String[] colNames = {"Posicao", "Valor"};
			Object[][] data = new Object[Exercicio2Model.TAM_VETOR][2];

			for (int j = 0; j < vetorOriginal.length; j++) {
			    data[j][0] = j;
			    data[j][1] = vetorOriginal[j];
			}
			
				
			result.addResultRow(colNames, data);
			result.setMaiorResult(Integer.toString(maiorElemento[0]));		
			result.setMaiorPos(Integer.toString(maiorElemento[1]));		
			result.setMenorResult(Integer.toString(menorElemento[0]));		
			result.setMenorPos(Integer.toString(menorElemento[1]));	
			result.setVisible(true);
		}
	}
	
	class limparListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			ex2_view.limparCampos();
		}
	}
}
