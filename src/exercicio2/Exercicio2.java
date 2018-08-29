package exercicio2;

import java.awt.EventQueue;

public class Exercicio2 {
	public static void main(String args[]) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try{
					Exercicio2Model ex2Model = new Exercicio2Model();
					Exercicio2View ex2View = new Exercicio2View(ex2Model);
					Exercicio2Controller ex2Controller = new Exercicio2Controller(ex2View, ex2Model);
					
					ex2View.setVisible(true);
					
				}catch(Exception e) {
					e.printStackTrace();
				}
				
			}
			
		});
	}
}
