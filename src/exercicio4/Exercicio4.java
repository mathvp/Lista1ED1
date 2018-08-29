package exercicio4;

import java.awt.EventQueue;

public class Exercicio4 {
	public static void main(String args[]) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try{
					Exercicio4Model ex4Model = new Exercicio4Model();
					Exercicio4View ex4View = new Exercicio4View(ex4Model);
					Exercicio4Controller ex4Controller = new Exercicio4Controller(ex4View, ex4Model);
					
					ex4View.setVisible(true);
					
				}catch(Exception e) {
					e.printStackTrace();
				}
				
			}
			
		});
	}
}
