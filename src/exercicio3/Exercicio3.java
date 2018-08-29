package exercicio3;

import java.awt.EventQueue;

public class Exercicio3 {
	public static void main(String args[]) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try{
					Exercicio3Model ex3Model = new Exercicio3Model();
					Exercicio3View ex3View = new Exercicio3View(ex3Model);
					Exercicio3Controller ex3Controller = new Exercicio3Controller(ex3View, ex3Model);
					
					ex3View.setVisible(true);
					
				}catch(Exception e) {
					e.printStackTrace();
				}
				
			}
			
		});
	}
}
