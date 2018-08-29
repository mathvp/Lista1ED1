package exercicio2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JSeparator;


public class Resultado extends JDialog implements ActionListener{

	private final JPanel contentPanel = new JPanel();
	private JLabel lblMaiorElemento;
	private JLabel lblMaior;
	private JPanel panel = new JPanel();
	private JPanel panelMaiorMenor = new JPanel();
	private JScrollPane scrollPaneTb = new JScrollPane();
	private JLabel lblMaiorPos = new JLabel("x");
	private JLabel lblMenor = new JLabel("00000");
	private JLabel lblMenorPos = new JLabel("x");

	/**
	 * Create the dialog.
	 */
	public Resultado() {
		setTitle("Resultado");
		setBounds(100, 100, 450, 425);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Ex. 2 - Resultado", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(18)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 386, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(20, Short.MAX_VALUE))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPanel.createSequentialGroup()
					.addGap(21)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
					.addContainerGap())
		);
		{
			lblMaiorElemento = new JLabel("Maior elemento:");
		}
		{
			lblMaior = new JLabel("00000");
		}
		
		JLabel lblPosio = new JLabel("Posi\u00E7\u00E3o:");
		JLabel lblMenorElemento = new JLabel("Menor elemento:");
		JLabel label = new JLabel("Posi\u00E7\u00E3o:");		
		
		GroupLayout gl_panelMaiorMenor = new GroupLayout(panelMaiorMenor);
		gl_panelMaiorMenor.setHorizontalGroup(
			gl_panelMaiorMenor.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelMaiorMenor.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelMaiorMenor.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(gl_panelMaiorMenor.createSequentialGroup()
							.addComponent(lblMenorElemento)
							.addGap(18)
							.addComponent(lblMenor)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(label)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblMenorPos))
						.addGroup(gl_panelMaiorMenor.createSequentialGroup()
							.addComponent(lblMaiorElemento)
							.addGap(22)
							.addComponent(lblMaior)
							.addGap(114)
							.addComponent(lblPosio)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblMaiorPos)))
					.addContainerGap(55, Short.MAX_VALUE))
		);
		gl_panelMaiorMenor.setVerticalGroup(
			gl_panelMaiorMenor.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelMaiorMenor.createSequentialGroup()
					.addGroup(gl_panelMaiorMenor.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelMaiorMenor.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblMaiorElemento)
							.addComponent(lblMaior))
						.addGroup(gl_panelMaiorMenor.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblPosio)
							.addComponent(lblMaiorPos)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panelMaiorMenor.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelMaiorMenor.createParallelGroup(Alignment.BASELINE)
							.addComponent(label)
							.addComponent(lblMenorPos))
						.addGroup(gl_panelMaiorMenor.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblMenorElemento)
							.addComponent(lblMenor)))
					.addGap(12))
		);
		panelMaiorMenor.setLayout(gl_panelMaiorMenor);
				
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPaneTb, GroupLayout.PREFERRED_SIZE, 354, GroupLayout.PREFERRED_SIZE)
						.addComponent(panelMaiorMenor, GroupLayout.PREFERRED_SIZE, 354, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPaneTb, GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(panelMaiorMenor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		panel.setLayout(gl_panel);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(this);
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}
	
	public void addResultRow(String[] colNames, Object[][] data) {
		final JTable table = new JTable(data, colNames);
        scrollPaneTb.setViewportView(table);
	}	
	
	public void actionPerformed(ActionEvent e) {
	      dispose();
	}
	
	void setMaiorResult(String valor) {
		lblMaior.setText(valor);
	}
	void setMaiorPos(String valor) {
		lblMaiorPos.setText(valor);
	}
	void setMenorResult(String valor) {
		lblMenor.setText(valor);
	}
	void setMenorPos(String valor) {
		lblMenorPos.setText(valor);
	}
	
}
