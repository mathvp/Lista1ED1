package exercicio1;

import java.awt.EventQueue;

public class Exercicio1 {
	public static void main(String args[]) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try{
					Exercicio1Model ex1Model = new Exercicio1Model();
					Exercicio1View ex1View = new Exercicio1View(ex1Model);
					Exercicio1Controller ex1Controller = new Exercicio1Controller(ex1View, ex1Model);
					
					ex1View.setVisible(true);
					
				}catch(Exception e) {
					e.printStackTrace();
				}
				
			}
			
		});
	}
}
