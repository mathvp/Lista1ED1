package exercicio4;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;

public class Exercicio4View extends JFrame {

	private JPanel contentPane;

	private JTextField txtNum1;
	private JTextField txtNum2;
	private JTextField txtNum3;
	private JTextField txtNum4;
	private JTextField txtNum5;
	private JTextField txtNum6;
	private JTextField txtNum7;
	private JTextField txtNum8;
	private JTextField txtNum9;
	private JTextField txtNum10;
	private JTextField txtNum11;
	private JTextField txtNum12;
	private JTextField txtNum13;
	private JTextField txtNum14;
	private JTextField txtNum15;
	private JTextField txtNum16;
	private JTextField txtNum17;
	private JTextField txtNum18;
	private JTextField txtNum19;
	private JTextField txtNum20;
	private JButton btnGerarNumsAleatorios = new JButton("Gerar n\u00FAmeros aleat\u00F3rios");
	
	private JTextField[] campos = new JTextField[Exercicio4Model.TAM_VETOR];
	
	private JButton btnContinuar = new JButton("Continuar");
	private JButton btnLimpar = new JButton("Limpar");
	private JTextField txtNum21;
	private JTextField txtNum22;
	private JTextField txtNum23;
	private JTextField txtNum24;
	private JTextField txtNum25;
	private JTextField txtNum26;
	private JTextField txtNum27;
	private JTextField txtNum28;
	private JTextField txtNum29;
	private JTextField txtNum30;
	
	/**
	 * Create the frame.
	 */
	public Exercicio4View(Exercicio4Model model) {
		
		setTitle("Lista 1 - Estrutura de Dados - IFSP Bra");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 652);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
				
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Aluno", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Informações", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JLabel lblNewLabel = new JLabel("IFSP Bragan\u00E7a Paulista - Agosto de 2018");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Exercicio 4", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 621, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 296, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))
						.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
					.addGap(18)
					.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel)
					.addGap(32))
		);
		
		JLabel lblEscrevaUm = new JLabel("<html><b>5.</b> Escreva um programa que leia 30 n\u00FAmeros digitados pelo usu\u00E1rio e monte novos vetores que contenham:<ol><li>Primeiro vetor: n\u00FAmeros pares digitados;</li><li>Segundo vetor: n\u00FAmeros \u00EDmpares digitados;</li><li>Terceiro vetor: o quadrado de cada n\u00FAmero par digitado</li><li>Quarto vetor: o cubo de cada n\u00FAmero \u00EDmpar digitado.</li><ol><p>Ao final, imprima os valores de cada um dos vetores.</p></html>");
		lblEscrevaUm.setVerticalAlignment(SwingConstants.TOP);
		lblEscrevaUm.setHorizontalAlignment(SwingConstants.LEFT);
		
		btnContinuar.setEnabled(false);
		
		JLabel label_21 = new JLabel("");
		JLabel label_22 = new JLabel("");
		JLabel label_23 = new JLabel("");					
		
		JPanel panel_3 = new JPanel();
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{0, 0, 0};
		gbl_panel_3.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_3.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		JLabel lblNm = new JLabel("1\u00BA n\u00FAm:");
		GridBagConstraints gbc_lblNm = new GridBagConstraints();
		gbc_lblNm.anchor = GridBagConstraints.EAST;
		gbc_lblNm.insets = new Insets(0, 0, 5, 5);
		gbc_lblNm.gridx = 0;
		gbc_lblNm.gridy = 0;
		panel_3.add(lblNm, gbc_lblNm);
		
		txtNum1 = new JTextField();
		txtNum1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				validaDados();
			}
		});
		txtNum1.setColumns(4);
		GridBagConstraints gbc_txtNum1 = new GridBagConstraints();
		gbc_txtNum1.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNum1.insets = new Insets(0, 0, 5, 0);
		gbc_txtNum1.gridx = 1;
		gbc_txtNum1.gridy = 0;
		panel_3.add(txtNum1, gbc_txtNum1);
		
		JLabel lblNm_1 = new JLabel("2\u00BA n\u00FAm:");
		GridBagConstraints gbc_lblNm_1 = new GridBagConstraints();
		gbc_lblNm_1.anchor = GridBagConstraints.EAST;
		gbc_lblNm_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNm_1.gridx = 0;
		gbc_lblNm_1.gridy = 1;
		panel_3.add(lblNm_1, gbc_lblNm_1);
		
		txtNum2 = new JTextField();
		txtNum2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				validaDados();
			}
		});
		txtNum2.setColumns(10);
		GridBagConstraints gbc_txtNum2 = new GridBagConstraints();
		gbc_txtNum2.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNum2.insets = new Insets(0, 0, 5, 0);
		gbc_txtNum2.gridx = 1;
		gbc_txtNum2.gridy = 1;
		panel_3.add(txtNum2, gbc_txtNum2);
		
		JLabel lblNm_2 = new JLabel("3\u00BA n\u00FAm:");
		GridBagConstraints gbc_lblNm_2 = new GridBagConstraints();
		gbc_lblNm_2.anchor = GridBagConstraints.EAST;
		gbc_lblNm_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNm_2.gridx = 0;
		gbc_lblNm_2.gridy = 2;
		panel_3.add(lblNm_2, gbc_lblNm_2);
		
		txtNum3 = new JTextField();
		txtNum3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				validaDados();
			}
		});
		txtNum3.setColumns(10);
		GridBagConstraints gbc_txtNum3 = new GridBagConstraints();
		gbc_txtNum3.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNum3.insets = new Insets(0, 0, 5, 0);
		gbc_txtNum3.gridx = 1;
		gbc_txtNum3.gridy = 2;
		panel_3.add(txtNum3, gbc_txtNum3);
		
		JLabel lblNm_3 = new JLabel("4\u00BA n\u00FAm:");
		GridBagConstraints gbc_lblNm_3 = new GridBagConstraints();
		gbc_lblNm_3.anchor = GridBagConstraints.EAST;
		gbc_lblNm_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNm_3.gridx = 0;
		gbc_lblNm_3.gridy = 3;
		panel_3.add(lblNm_3, gbc_lblNm_3);
		
		txtNum4 = new JTextField();
		txtNum4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				validaDados();
			}
		});
		txtNum4.setColumns(10);
		GridBagConstraints gbc_txtNum4 = new GridBagConstraints();
		gbc_txtNum4.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNum4.insets = new Insets(0, 0, 5, 0);
		gbc_txtNum4.gridx = 1;
		gbc_txtNum4.gridy = 3;
		panel_3.add(txtNum4, gbc_txtNum4);
		
		JLabel lblNm_4 = new JLabel("5\u00BA n\u00FAm:");
		GridBagConstraints gbc_lblNm_4 = new GridBagConstraints();
		gbc_lblNm_4.anchor = GridBagConstraints.EAST;
		gbc_lblNm_4.insets = new Insets(0, 0, 0, 5);
		gbc_lblNm_4.gridx = 0;
		gbc_lblNm_4.gridy = 4;
		panel_3.add(lblNm_4, gbc_lblNm_4);
		
		txtNum5 = new JTextField();
		txtNum5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				validaDados();
			}
		});
		txtNum5.setColumns(10);
		GridBagConstraints gbc_txtNum5 = new GridBagConstraints();
		gbc_txtNum5.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNum5.gridx = 1;
		gbc_txtNum5.gridy = 4;
		panel_3.add(txtNum5, gbc_txtNum5);
		
		JPanel panel_4 = new JPanel();
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[]{0, 0, 0};
		gbl_panel_4.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_4.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_4.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_4.setLayout(gbl_panel_4);
		
		JLabel lblNm_5 = new JLabel("6\u00BA n\u00FAm:");
		GridBagConstraints gbc_lblNm_5 = new GridBagConstraints();
		gbc_lblNm_5.anchor = GridBagConstraints.EAST;
		gbc_lblNm_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNm_5.gridx = 0;
		gbc_lblNm_5.gridy = 0;
		panel_4.add(lblNm_5, gbc_lblNm_5);
		
		txtNum6 = new JTextField();
		txtNum6.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				validaDados();
			}
		});
		txtNum6.setColumns(4);
		GridBagConstraints gbc_txtNum6 = new GridBagConstraints();
		gbc_txtNum6.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNum6.insets = new Insets(0, 0, 5, 0);
		gbc_txtNum6.gridx = 1;
		gbc_txtNum6.gridy = 0;
		panel_4.add(txtNum6, gbc_txtNum6);
		
		JLabel lblNm_6 = new JLabel("7\u00BA n\u00FAm:");
		GridBagConstraints gbc_lblNm_6 = new GridBagConstraints();
		gbc_lblNm_6.anchor = GridBagConstraints.EAST;
		gbc_lblNm_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNm_6.gridx = 0;
		gbc_lblNm_6.gridy = 1;
		panel_4.add(lblNm_6, gbc_lblNm_6);
		
		txtNum7 = new JTextField();
		txtNum7.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				validaDados();
			}
		});
		txtNum7.setColumns(10);
		GridBagConstraints gbc_txtNum7 = new GridBagConstraints();
		gbc_txtNum7.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNum7.insets = new Insets(0, 0, 5, 0);
		gbc_txtNum7.gridx = 1;
		gbc_txtNum7.gridy = 1;
		panel_4.add(txtNum7, gbc_txtNum7);
		
		JLabel lblNm_7 = new JLabel("8\u00BA n\u00FAm:");
		GridBagConstraints gbc_lblNm_7 = new GridBagConstraints();
		gbc_lblNm_7.anchor = GridBagConstraints.EAST;
		gbc_lblNm_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNm_7.gridx = 0;
		gbc_lblNm_7.gridy = 2;
		panel_4.add(lblNm_7, gbc_lblNm_7);
		
		txtNum8 = new JTextField();
		txtNum8.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				validaDados();
			}
		});
		txtNum8.setColumns(10);
		GridBagConstraints gbc_txtNum8 = new GridBagConstraints();
		gbc_txtNum8.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNum8.insets = new Insets(0, 0, 5, 0);
		gbc_txtNum8.gridx = 1;
		gbc_txtNum8.gridy = 2;
		panel_4.add(txtNum8, gbc_txtNum8);
		
		JLabel lblNm_8 = new JLabel("9\u00BA n\u00FAm:");
		GridBagConstraints gbc_lblNm_8 = new GridBagConstraints();
		gbc_lblNm_8.anchor = GridBagConstraints.EAST;
		gbc_lblNm_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNm_8.gridx = 0;
		gbc_lblNm_8.gridy = 3;
		panel_4.add(lblNm_8, gbc_lblNm_8);
		
		txtNum9 = new JTextField();
		txtNum9.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				validaDados();
			}
		});
		txtNum9.setColumns(10);
		GridBagConstraints gbc_txtNum9 = new GridBagConstraints();
		gbc_txtNum9.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNum9.insets = new Insets(0, 0, 5, 0);
		gbc_txtNum9.gridx = 1;
		gbc_txtNum9.gridy = 3;
		panel_4.add(txtNum9, gbc_txtNum9);
		
		JLabel lblNm_9 = new JLabel("10\u00BA n\u00FAm:");
		GridBagConstraints gbc_lblNm_9 = new GridBagConstraints();
		gbc_lblNm_9.anchor = GridBagConstraints.EAST;
		gbc_lblNm_9.insets = new Insets(0, 0, 0, 5);
		gbc_lblNm_9.gridx = 0;
		gbc_lblNm_9.gridy = 4;
		panel_4.add(lblNm_9, gbc_lblNm_9);
		
		txtNum10 = new JTextField();
		txtNum10.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				validaDados();
			}
		});
		txtNum10.setColumns(10);
		GridBagConstraints gbc_txtNum10 = new GridBagConstraints();
		gbc_txtNum10.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNum10.gridx = 1;
		gbc_txtNum10.gridy = 4;
		panel_4.add(txtNum10, gbc_txtNum10);
		
		JPanel panel_5 = new JPanel();
		GridBagLayout gbl_panel_5 = new GridBagLayout();
		gbl_panel_5.columnWidths = new int[]{0, 0, 0};
		gbl_panel_5.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_5.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_5.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_5.setLayout(gbl_panel_5);
		
		JLabel lblNm_10 = new JLabel("11\u00BA n\u00FAm:");
		GridBagConstraints gbc_lblNm_10 = new GridBagConstraints();
		gbc_lblNm_10.anchor = GridBagConstraints.EAST;
		gbc_lblNm_10.insets = new Insets(0, 0, 5, 5);
		gbc_lblNm_10.gridx = 0;
		gbc_lblNm_10.gridy = 0;
		panel_5.add(lblNm_10, gbc_lblNm_10);
		
		txtNum11 = new JTextField();
		txtNum11.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				validaDados();
			}
		});
		txtNum11.setColumns(4);
		GridBagConstraints gbc_txtNum11 = new GridBagConstraints();
		gbc_txtNum11.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNum11.insets = new Insets(0, 0, 5, 0);
		gbc_txtNum11.gridx = 1;
		gbc_txtNum11.gridy = 0;
		panel_5.add(txtNum11, gbc_txtNum11);
		
		JLabel lblNm_11 = new JLabel("12\u00BA n\u00FAm:");
		GridBagConstraints gbc_lblNm_11 = new GridBagConstraints();
		gbc_lblNm_11.anchor = GridBagConstraints.EAST;
		gbc_lblNm_11.insets = new Insets(0, 0, 5, 5);
		gbc_lblNm_11.gridx = 0;
		gbc_lblNm_11.gridy = 1;
		panel_5.add(lblNm_11, gbc_lblNm_11);
		
		txtNum12 = new JTextField();
		txtNum12.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {				
				validaDados();
			}
		});
		txtNum12.setColumns(10);
		GridBagConstraints gbc_txtNum12 = new GridBagConstraints();
		gbc_txtNum12.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNum12.insets = new Insets(0, 0, 5, 0);
		gbc_txtNum12.gridx = 1;
		gbc_txtNum12.gridy = 1;
		panel_5.add(txtNum12, gbc_txtNum12);
		
		JLabel lblNm_12 = new JLabel("13\u00BA n\u00FAm:");
		GridBagConstraints gbc_lblNm_12 = new GridBagConstraints();
		gbc_lblNm_12.anchor = GridBagConstraints.EAST;
		gbc_lblNm_12.insets = new Insets(0, 0, 5, 5);
		gbc_lblNm_12.gridx = 0;
		gbc_lblNm_12.gridy = 2;
		panel_5.add(lblNm_12, gbc_lblNm_12);
		
		txtNum13 = new JTextField();
		txtNum13.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				validaDados();
			}
		});
		txtNum13.setColumns(10);
		GridBagConstraints gbc_txtNum13 = new GridBagConstraints();
		gbc_txtNum13.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNum13.insets = new Insets(0, 0, 5, 0);
		gbc_txtNum13.gridx = 1;
		gbc_txtNum13.gridy = 2;
		panel_5.add(txtNum13, gbc_txtNum13);
		
		JLabel lblNm_13 = new JLabel("14\u00BA n\u00FAm:");
		GridBagConstraints gbc_lblNm_13 = new GridBagConstraints();
		gbc_lblNm_13.anchor = GridBagConstraints.EAST;
		gbc_lblNm_13.insets = new Insets(0, 0, 5, 5);
		gbc_lblNm_13.gridx = 0;
		gbc_lblNm_13.gridy = 3;
		panel_5.add(lblNm_13, gbc_lblNm_13);
		
		txtNum14 = new JTextField();
		txtNum14.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				validaDados();
			}
		});
		txtNum14.setColumns(10);
		GridBagConstraints gbc_txtNum14 = new GridBagConstraints();
		gbc_txtNum14.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNum14.insets = new Insets(0, 0, 5, 0);
		gbc_txtNum14.gridx = 1;
		gbc_txtNum14.gridy = 3;
		panel_5.add(txtNum14, gbc_txtNum14);
		
		JLabel lblNm_14 = new JLabel("15\u00BA n\u00FAm:");
		GridBagConstraints gbc_lblNm_14 = new GridBagConstraints();
		gbc_lblNm_14.anchor = GridBagConstraints.EAST;
		gbc_lblNm_14.insets = new Insets(0, 0, 0, 5);
		gbc_lblNm_14.gridx = 0;
		gbc_lblNm_14.gridy = 4;
		panel_5.add(lblNm_14, gbc_lblNm_14);
		
		txtNum15 = new JTextField();
		txtNum15.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				validaDados();
			}
		});
		txtNum15.setColumns(10);
		GridBagConstraints gbc_txtNum15 = new GridBagConstraints();
		gbc_txtNum15.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNum15.gridx = 1;
		gbc_txtNum15.gridy = 4;
		panel_5.add(txtNum15, gbc_txtNum15);
		
		JLabel label_26 = new JLabel("");
		
		JPanel panel_6 = new JPanel();
		GridBagLayout gbl_panel_6 = new GridBagLayout();
		gbl_panel_6.columnWidths = new int[]{0, 0, 0};
		gbl_panel_6.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_6.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_6.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_6.setLayout(gbl_panel_6);
		
		JLabel lblNm_15 = new JLabel("16\u00BA n\u00FAm:");
		GridBagConstraints gbc_lblNm_15 = new GridBagConstraints();
		gbc_lblNm_15.anchor = GridBagConstraints.EAST;
		gbc_lblNm_15.insets = new Insets(0, 0, 5, 5);
		gbc_lblNm_15.gridx = 0;
		gbc_lblNm_15.gridy = 0;
		panel_6.add(lblNm_15, gbc_lblNm_15);
		
		txtNum16 = new JTextField();
		txtNum16.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				validaDados();
			}
		});
		txtNum16.setColumns(4);
		GridBagConstraints gbc_txtNum16 = new GridBagConstraints();
		gbc_txtNum16.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNum16.insets = new Insets(0, 0, 5, 0);
		gbc_txtNum16.gridx = 1;
		gbc_txtNum16.gridy = 0;
		panel_6.add(txtNum16, gbc_txtNum16);
		
		JLabel lblNm_16 = new JLabel("17\u00BA n\u00FAm:");
		GridBagConstraints gbc_lblNm_16 = new GridBagConstraints();
		gbc_lblNm_16.anchor = GridBagConstraints.EAST;
		gbc_lblNm_16.insets = new Insets(0, 0, 5, 5);
		gbc_lblNm_16.gridx = 0;
		gbc_lblNm_16.gridy = 1;
		panel_6.add(lblNm_16, gbc_lblNm_16);
		
		txtNum17 = new JTextField();
		txtNum17.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				validaDados();
			}
		});
		txtNum17.setColumns(10);
		GridBagConstraints gbc_txtNum17 = new GridBagConstraints();
		gbc_txtNum17.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNum17.insets = new Insets(0, 0, 5, 0);
		gbc_txtNum17.gridx = 1;
		gbc_txtNum17.gridy = 1;
		panel_6.add(txtNum17, gbc_txtNum17);
		
		JLabel lblNm_17 = new JLabel("18\u00BA n\u00FAm:");
		GridBagConstraints gbc_lblNm_17 = new GridBagConstraints();
		gbc_lblNm_17.anchor = GridBagConstraints.EAST;
		gbc_lblNm_17.insets = new Insets(0, 0, 5, 5);
		gbc_lblNm_17.gridx = 0;
		gbc_lblNm_17.gridy = 2;
		panel_6.add(lblNm_17, gbc_lblNm_17);
		
		txtNum18 = new JTextField();
		txtNum18.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				validaDados();
			}
		});
		txtNum18.setColumns(10);
		GridBagConstraints gbc_txtNum18 = new GridBagConstraints();
		gbc_txtNum18.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNum18.insets = new Insets(0, 0, 5, 0);
		gbc_txtNum18.gridx = 1;
		gbc_txtNum18.gridy = 2;
		panel_6.add(txtNum18, gbc_txtNum18);
		
		JLabel lblNm_18 = new JLabel("19\u00BA n\u00FAm:");
		GridBagConstraints gbc_lblNm_18 = new GridBagConstraints();
		gbc_lblNm_18.anchor = GridBagConstraints.EAST;
		gbc_lblNm_18.insets = new Insets(0, 0, 5, 5);
		gbc_lblNm_18.gridx = 0;
		gbc_lblNm_18.gridy = 3;
		panel_6.add(lblNm_18, gbc_lblNm_18);
		
		txtNum19 = new JTextField();
		txtNum19.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				validaDados();
			}
		});
		txtNum19.setColumns(10);
		GridBagConstraints gbc_txtNum19 = new GridBagConstraints();
		gbc_txtNum19.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNum19.insets = new Insets(0, 0, 5, 0);
		gbc_txtNum19.gridx = 1;
		gbc_txtNum19.gridy = 3;
		panel_6.add(txtNum19, gbc_txtNum19);
		
		JLabel lblNm_19 = new JLabel("20\u00BA n\u00FAm:");
		GridBagConstraints gbc_lblNm_19 = new GridBagConstraints();
		gbc_lblNm_19.anchor = GridBagConstraints.EAST;
		gbc_lblNm_19.insets = new Insets(0, 0, 0, 5);
		gbc_lblNm_19.gridx = 0;
		gbc_lblNm_19.gridy = 4;
		panel_6.add(lblNm_19, gbc_lblNm_19);
		
		txtNum20 = new JTextField();
		txtNum20.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				validaDados();
			}
		});
		txtNum20.setColumns(10);
		GridBagConstraints gbc_txtNum20 = new GridBagConstraints();
		gbc_txtNum20.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNum20.gridx = 1;
		gbc_txtNum20.gridy = 4;
		panel_6.add(txtNum20, gbc_txtNum20);
		
		JLabel label_27 = new JLabel("");
		
		JPanel panel_7 = new JPanel();
		GridBagLayout gbl_panel_7 = new GridBagLayout();
		gbl_panel_7.columnWidths = new int[]{0, 0, 0};
		gbl_panel_7.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_7.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_7.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_7.setLayout(gbl_panel_7);
		
		JLabel lblNm_20 = new JLabel("21\u00BA n\u00FAm:");
		GridBagConstraints gbc_lblNm_20 = new GridBagConstraints();
		gbc_lblNm_20.anchor = GridBagConstraints.EAST;
		gbc_lblNm_20.insets = new Insets(0, 0, 5, 5);
		gbc_lblNm_20.gridx = 0;
		gbc_lblNm_20.gridy = 0;
		panel_7.add(lblNm_20, gbc_lblNm_20);
		
		txtNum21 = new JTextField();
		txtNum21.setColumns(4);
		GridBagConstraints gbc_txtNum21 = new GridBagConstraints();
		gbc_txtNum21.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNum21.insets = new Insets(0, 0, 5, 0);
		gbc_txtNum21.gridx = 1;
		gbc_txtNum21.gridy = 0;
		panel_7.add(txtNum21, gbc_txtNum21);
		
		JLabel lblNm_21 = new JLabel("22\u00BA n\u00FAm:");
		GridBagConstraints gbc_lblNm_21 = new GridBagConstraints();
		gbc_lblNm_21.anchor = GridBagConstraints.EAST;
		gbc_lblNm_21.insets = new Insets(0, 0, 5, 5);
		gbc_lblNm_21.gridx = 0;
		gbc_lblNm_21.gridy = 1;
		panel_7.add(lblNm_21, gbc_lblNm_21);
		
		txtNum22 = new JTextField();
		txtNum22.setColumns(10);
		GridBagConstraints gbc_txtNum22 = new GridBagConstraints();
		gbc_txtNum22.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNum22.insets = new Insets(0, 0, 5, 0);
		gbc_txtNum22.gridx = 1;
		gbc_txtNum22.gridy = 1;
		panel_7.add(txtNum22, gbc_txtNum22);
		
		JLabel lblNm_22 = new JLabel("23\u00BA n\u00FAm:");
		GridBagConstraints gbc_lblNm_22 = new GridBagConstraints();
		gbc_lblNm_22.anchor = GridBagConstraints.EAST;
		gbc_lblNm_22.insets = new Insets(0, 0, 5, 5);
		gbc_lblNm_22.gridx = 0;
		gbc_lblNm_22.gridy = 2;
		panel_7.add(lblNm_22, gbc_lblNm_22);
		
		txtNum23 = new JTextField();
		txtNum23.setColumns(10);
		GridBagConstraints gbc_txtNum23 = new GridBagConstraints();
		gbc_txtNum23.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNum23.insets = new Insets(0, 0, 5, 0);
		gbc_txtNum23.gridx = 1;
		gbc_txtNum23.gridy = 2;
		panel_7.add(txtNum23, gbc_txtNum23);
		
		JLabel lblNm_23 = new JLabel("24\u00BA n\u00FAm:");
		GridBagConstraints gbc_lblNm_23 = new GridBagConstraints();
		gbc_lblNm_23.anchor = GridBagConstraints.EAST;
		gbc_lblNm_23.insets = new Insets(0, 0, 5, 5);
		gbc_lblNm_23.gridx = 0;
		gbc_lblNm_23.gridy = 3;
		panel_7.add(lblNm_23, gbc_lblNm_23);
		
		txtNum24 = new JTextField();
		txtNum24.setColumns(10);
		GridBagConstraints gbc_txtNum24 = new GridBagConstraints();
		gbc_txtNum24.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNum24.insets = new Insets(0, 0, 5, 0);
		gbc_txtNum24.gridx = 1;
		gbc_txtNum24.gridy = 3;
		panel_7.add(txtNum24, gbc_txtNum24);
		
		JLabel lblNm_24 = new JLabel("25\u00BA n\u00FAm:");
		GridBagConstraints gbc_lblNm_24 = new GridBagConstraints();
		gbc_lblNm_24.anchor = GridBagConstraints.EAST;
		gbc_lblNm_24.insets = new Insets(0, 0, 0, 5);
		gbc_lblNm_24.gridx = 0;
		gbc_lblNm_24.gridy = 4;
		panel_7.add(lblNm_24, gbc_lblNm_24);
		
		txtNum25 = new JTextField();
		txtNum25.setColumns(10);
		GridBagConstraints gbc_txtNum25 = new GridBagConstraints();
		gbc_txtNum25.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNum25.gridx = 1;
		gbc_txtNum25.gridy = 4;
		panel_7.add(txtNum25, gbc_txtNum25);
		
		JPanel panel_8 = new JPanel();
		GridBagLayout gbl_panel_8 = new GridBagLayout();
		gbl_panel_8.columnWidths = new int[]{0, 0, 0};
		gbl_panel_8.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_8.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_8.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_8.setLayout(gbl_panel_8);
		
		JLabel lblNm_25 = new JLabel("26\u00BA n\u00FAm:");
		GridBagConstraints gbc_lblNm_25 = new GridBagConstraints();
		gbc_lblNm_25.anchor = GridBagConstraints.EAST;
		gbc_lblNm_25.insets = new Insets(0, 0, 5, 5);
		gbc_lblNm_25.gridx = 0;
		gbc_lblNm_25.gridy = 0;
		panel_8.add(lblNm_25, gbc_lblNm_25);
		
		txtNum26 = new JTextField();
		txtNum26.setColumns(4);
		GridBagConstraints gbc_txtNum26 = new GridBagConstraints();
		gbc_txtNum26.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNum26.insets = new Insets(0, 0, 5, 0);
		gbc_txtNum26.gridx = 1;
		gbc_txtNum26.gridy = 0;
		panel_8.add(txtNum26, gbc_txtNum26);
		
		JLabel lblNm_26 = new JLabel("27\u00BA n\u00FAm:");
		GridBagConstraints gbc_lblNm_26 = new GridBagConstraints();
		gbc_lblNm_26.anchor = GridBagConstraints.EAST;
		gbc_lblNm_26.insets = new Insets(0, 0, 5, 5);
		gbc_lblNm_26.gridx = 0;
		gbc_lblNm_26.gridy = 1;
		panel_8.add(lblNm_26, gbc_lblNm_26);
		
		txtNum27 = new JTextField();
		txtNum27.setColumns(10);
		GridBagConstraints gbc_txtNum27 = new GridBagConstraints();
		gbc_txtNum27.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNum27.insets = new Insets(0, 0, 5, 0);
		gbc_txtNum27.gridx = 1;
		gbc_txtNum27.gridy = 1;
		panel_8.add(txtNum27, gbc_txtNum27);
		
		JLabel lblNm_27 = new JLabel("28\u00BA n\u00FAm:");
		GridBagConstraints gbc_lblNm_27 = new GridBagConstraints();
		gbc_lblNm_27.anchor = GridBagConstraints.EAST;
		gbc_lblNm_27.insets = new Insets(0, 0, 5, 5);
		gbc_lblNm_27.gridx = 0;
		gbc_lblNm_27.gridy = 2;
		panel_8.add(lblNm_27, gbc_lblNm_27);
		
		txtNum28 = new JTextField();
		txtNum28.setColumns(10);
		GridBagConstraints gbc_txtNum28 = new GridBagConstraints();
		gbc_txtNum28.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNum28.insets = new Insets(0, 0, 5, 0);
		gbc_txtNum28.gridx = 1;
		gbc_txtNum28.gridy = 2;
		panel_8.add(txtNum28, gbc_txtNum28);
		
		JLabel lblNm_28 = new JLabel("29\u00BA n\u00FAm:");
		GridBagConstraints gbc_lblNm_28 = new GridBagConstraints();
		gbc_lblNm_28.anchor = GridBagConstraints.EAST;
		gbc_lblNm_28.insets = new Insets(0, 0, 5, 5);
		gbc_lblNm_28.gridx = 0;
		gbc_lblNm_28.gridy = 3;
		panel_8.add(lblNm_28, gbc_lblNm_28);
		
		txtNum29 = new JTextField();
		txtNum29.setColumns(10);
		GridBagConstraints gbc_txtNum29 = new GridBagConstraints();
		gbc_txtNum29.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNum29.insets = new Insets(0, 0, 5, 0);
		gbc_txtNum29.gridx = 1;
		gbc_txtNum29.gridy = 3;
		panel_8.add(txtNum29, gbc_txtNum29);
		
		JLabel lblNm_29 = new JLabel("30\u00BA n\u00FAm:");
		GridBagConstraints gbc_lblNm_29 = new GridBagConstraints();
		gbc_lblNm_29.anchor = GridBagConstraints.EAST;
		gbc_lblNm_29.insets = new Insets(0, 0, 0, 5);
		gbc_lblNm_29.gridx = 0;
		gbc_lblNm_29.gridy = 4;
		panel_8.add(lblNm_29, gbc_lblNm_29);
		
		txtNum30 = new JTextField();
		txtNum30.setColumns(10);
		GridBagConstraints gbc_txtNum30 = new GridBagConstraints();
		gbc_txtNum30.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNum30.gridx = 1;
		gbc_txtNum30.gridy = 4;
		panel_8.add(txtNum30, gbc_txtNum30);
		
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblEscrevaUm, GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label_21)
					.addGap(5)
					.addComponent(label_22)
					.addGap(5)
					.addComponent(label_23))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnGerarNumsAleatorios)
					.addGap(18)
					.addComponent(btnLimpar)
					.addContainerGap(389, Short.MAX_VALUE))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(388)
					.addComponent(label_26)
					.addGap(161)
					.addComponent(label_27)
					.addGap(84))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(236)
					.addComponent(btnContinuar, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(249, Short.MAX_VALUE))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel_6, 0, 0, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel_8, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
					.addGap(31))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(26)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(label_22)
								.addComponent(label_23)
								.addComponent(label_21)))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblEscrevaUm, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnGerarNumsAleatorios)
						.addComponent(btnLimpar))
					.addGap(18)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
							.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING, gl_panel_2.createParallelGroup(Alignment.TRAILING)
							.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
							.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(panel_8, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addComponent(btnContinuar, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(label_26)
						.addComponent(label_27))
					.addContainerGap())
		);
		panel_2.setLayout(gl_panel_2);
		
		JLabel lblEstruturaDeDados = new JLabel("Disciplina: Estrutura de Dados I - EDI");
		
		JLabel lblProfessorLuizAlbano = new JLabel("Professor: Luiz Roberto Albano");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblEstruturaDeDados)
						.addComponent(lblProfessorLuizAlbano))
					.addContainerGap(137, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblEstruturaDeDados)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblProfessorLuizAlbano)
					.addContainerGap(18, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		JLabel lblNomeMatheusVieira = new JLabel("Nome: Matheus Vieira de Paula");
		
		JLabel lblPronturioBp = new JLabel("Prontu\u00E1rio: BP300132-6");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNomeMatheusVieira)
						.addComponent(lblPronturioBp))
					.addContainerGap(126, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNomeMatheusVieira)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblPronturioBp)
					.addContainerGap(50, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
		
		
		campos[0] = txtNum1;
	    campos[1] = txtNum2;
	    campos[2] = txtNum3;
	    campos[3] = txtNum4;
	    campos[4] = txtNum5;
	    campos[5] = txtNum6;
	    campos[6] = txtNum7;
	    campos[7] = txtNum8;
	    campos[8] = txtNum9;
	    campos[9] = txtNum10;
	    campos[10] = txtNum11;
	    campos[11] = txtNum12;
	    campos[12] = txtNum13;
	    campos[13] = txtNum14;
	    campos[14] = txtNum15;
	    campos[15] = txtNum16;
	    campos[16] = txtNum17;
	    campos[17] = txtNum18;
	    campos[18] = txtNum19;
	    campos[19] = txtNum20;
	    campos[20] = txtNum21;
	    campos[21] = txtNum22;
	    campos[22] = txtNum23;
	    campos[23] = txtNum24;
	    campos[24] = txtNum25;
	    campos[25] = txtNum26;
	    campos[26] = txtNum27;
	    campos[27] = txtNum28;
	    campos[28] = txtNum29;
	    campos[29] = txtNum30;
	}
	
	void validaDados() {
		int erros = 0;
		for(int i=0; i<Exercicio4Model.TAM_VETOR; i++) {
			try {
				Integer.parseInt(campos[i].getText());
				
			}catch(Exception e) {
				erros++;
			}
						
		}
		
		if(erros == 0) {
			btnContinuar.setEnabled(true);
		}else {
			btnContinuar.setEnabled(false);
		}
		
	}
	
	void setAllInputs(int[] valores) {
		for(int i=0; i<Exercicio4Model.TAM_VETOR; i++) {
			campos[i].setText(Integer.toString(valores[i]));
		}
		validaDados();
	}
	
	public int[] getAllInputsVal() {
		int[] valores = new int[Exercicio4Model.TAM_VETOR];
		
		for(int i=0; i<Exercicio4Model.TAM_VETOR; i++) {
			valores[i] = Integer.parseInt(campos[i].getText());
		}
		
		return valores;
	}
	
	void limparCampos() {
		for(int i=0; i<Exercicio4Model.TAM_VETOR; i++) {
			campos[i].setText("");
		}
		btnContinuar.setEnabled(false);
	}
		
	void addNumAleatorioListener(ActionListener act) {
		btnGerarNumsAleatorios.addActionListener(act);		
	}
	
	void addContinuarListener(ActionListener act) {
		btnContinuar.addActionListener(act);		
	}	
	
	void addLimparListener(ActionListener act) {
		btnLimpar.addActionListener(act);
	}
}

