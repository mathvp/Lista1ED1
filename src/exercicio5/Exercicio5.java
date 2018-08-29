package exercicio5;

import java.awt.EventQueue;

public class Exercicio5 {
	public static void main(String args[]) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try{
					Exercicio5Model ex5Model = new Exercicio5Model();
					Exercicio5View ex5View = new Exercicio5View(ex5Model);
					Exercicio5Controller ex3Controller = new Exercicio5Controller(ex5View, ex5Model);
					
					ex5View.setVisible(true);
					
				}catch(Exception e) {
					e.printStackTrace();
				}
				
			}
			
		});
	}
}
