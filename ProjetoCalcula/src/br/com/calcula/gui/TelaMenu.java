package br.com.calcula.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import org.junit.jupiter.engine.descriptor.NestedClassTestDescriptor;

import br.com.calcula.model.Circulo;
import br.com.calcula.model.Quadrado;
import br.com.calcula.model.Retangulo;
import br.com.calcula.model.Triangulo;

public class TelaMenu extends JFrame {

	JLabel lbQuadrado, lbRetangulo, lbTriangulo, lbCirculo, lbArea, lbValor1, lbValor2, lbResultado;
	JTextField tfResultado, tfValor1, tfValor2;
	JButton btnCalcular, btnLimpar;
	JRadioButton rbQuadrado, rbRetangulo, rbTriangulo, rbCirculo;
	ButtonGroup bgOpcao;

	public TelaMenu() {

		setTitle("Calculo Geometrico - AREA");
		setSize(550, 480);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		RadioButtonHandler handler = new RadioButtonHandler();

		getContentPane().setLayout(null);

		// Label
		lbQuadrado = new JLabel("Quadrado");
		lbRetangulo = new JLabel("Retangulo");
		lbTriangulo = new JLabel("Triangulo");
		lbCirculo = new JLabel("Circulo");

		getContentPane().add(lbQuadrado);
		getContentPane().add(lbRetangulo);
		getContentPane().add(lbCirculo);
		getContentPane().add(lbTriangulo);

		lbQuadrado.setBounds(40, 30, 100, 30);
		lbRetangulo.setBounds(170, 30, 100, 30);
		lbCirculo.setBounds(310, 30, 100, 30);
		lbTriangulo.setBounds(430, 30, 100, 30);

		// TextFild e Label
		lbValor1 = new JLabel();
		lbValor2 = new JLabel();
		tfValor1 = new JTextField();
		tfValor2 = new JTextField();

		tfResultado = new JTextField("RESULTADO");

		getContentPane().add(tfResultado);

		tfResultado.setBounds(210, 370, 150, 40);

		// RadioButton
		rbQuadrado = new JRadioButton("");
		rbRetangulo = new JRadioButton("");
		rbTriangulo = new JRadioButton("");
		rbCirculo = new JRadioButton("");

		bgOpcao = new ButtonGroup();

		getContentPane().add(rbQuadrado);
		getContentPane().add(rbRetangulo);
		getContentPane().add(rbCirculo);
		getContentPane().add(rbTriangulo);

		rbQuadrado.setBounds(65, 60, 100, 30);
		rbRetangulo.setBounds(195, 60, 100, 30);
		rbCirculo.setBounds(325, 60, 100, 30);
		rbTriangulo.setBounds(450, 60, 100, 30);

		bgOpcao.add(rbQuadrado);
		bgOpcao.add(rbRetangulo);
		bgOpcao.add(rbCirculo);
		bgOpcao.add(rbTriangulo);

		rbQuadrado.addItemListener(handler);
		rbRetangulo.addItemListener(handler);
		rbCirculo.addItemListener(handler);
		rbTriangulo.addItemListener(handler);

		// Button
		btnCalcular = new JButton("Calcular");
		btnLimpar = new JButton("Limpar");

		getContentPane().add(btnCalcular);
		getContentPane().add(btnLimpar);

		btnCalcular.setBounds(120, 280, 120, 35);
		btnLimpar.setBounds(320, 280, 120, 35);

		// Ação do Botao Calcula
		btnCalcular.addActionListener(new ActionListener() {

			RadioButtonHandler buttonHandler = new RadioButtonHandler();

			@Override
			public void actionPerformed(ActionEvent e) {

				if (rbQuadrado.isSelected()) {

					if (tfValor1.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "Insira o Lado");
					} else {

						double valor1 = Double.parseDouble(tfValor1.getText());

						Quadrado quadrado = new Quadrado(valor1);

						String resultado = String.valueOf(quadrado.calculoArea());

						tfResultado.setText(resultado);
					}

				} else if (rbRetangulo.isSelected()) {

					if (tfValor1.getText().isEmpty() || tfValor2.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "Informe os Dados");
					} else {

						double valor1 = Double.parseDouble(tfValor1.getText());
						double valor2 = Double.parseDouble(tfValor2.getText());

						Retangulo retangulo = new Retangulo(valor1, valor2);

						String resultado = String.valueOf(retangulo.calculoArea());

						tfResultado.setText(resultado);
					}

				} else if (rbCirculo.isSelected()) {

					if (tfValor1.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "Insira o Raio");
					} else {

						double valor1 = Double.parseDouble(tfValor1.getText());

						Circulo circulo = new Circulo(valor1);

						String resultado = String.valueOf(circulo.calculoArea());

						tfResultado.setText(resultado);

					}
				} else if (rbTriangulo.isSelected()) {

					if (tfValor1.getText().isEmpty() || tfValor2.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "Informe os Dados");
					} else {
						
						double valor1 = Double.parseDouble(tfValor1.getText());
						double valor2 = Double.parseDouble(tfValor2.getText());
						
						Triangulo triangulo = new Triangulo(valor1, valor2);
						
						int medidas[] = new int[3];
						
						for(int i = 0; i < medidas.length; i++) {
							medidas[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe as medidas do triangulo"));
						}
						
						boolean retorno = triangulo.verificaTriangulo(medidas[0], medidas[1], medidas[2]);
						
						if(retorno == true) {
							
							String resultado = String.valueOf(triangulo.calculoArea());

							tfResultado.setText(resultado);
							
						}else {
							JOptionPane.showMessageDialog(null, "Não foi possivel calcular", "Informação", 2);
						}
						

						
						
					}
				}

			}
		});

		// Ação botao Limpar
		btnLimpar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				RadioButtonHandler buttonHandler = new RadioButtonHandler();

				buttonHandler.limparValores();

			}
		});

	}

	private class RadioButtonHandler implements ItemListener {

		public void limparValores() {
			tfValor1.setText("");
			tfValor2.setText("");
			tfResultado.setText("RESULTADO");

		}

		public void limparComponentes() {
			
			limparValores();

			lbValor1.setVisible(false);
			lbValor2.setVisible(false);
			tfValor1.setVisible(false);
			tfValor2.setVisible(false);
		}

		@Override
		public void itemStateChanged(ItemEvent e) {
			if (rbQuadrado.isSelected()) {

				limparComponentes();

				lbValor1 = new JLabel("Informe o Lado");
				tfValor1 = new JTextField("");

				getContentPane().add(tfValor1);
				getContentPane().add(lbValor1);

				lbValor1.setBounds(228, 150, 150, 40);
				tfValor1.setBounds(230, 200, 100, 40);

			} else if (rbRetangulo.isSelected()) {

				limparComponentes();

				lbValor1 = new JLabel("Informe a Base");
				lbValor2 = new JLabel("Altura");

				tfValor1 = new JTextField("");
				tfValor2 = new JTextField("");

				getContentPane().add(lbValor1);
				getContentPane().add(tfValor1);
				getContentPane().add(lbValor2);
				getContentPane().add(tfValor2);

				lbValor1.setBounds(145, 150, 150, 40);
				tfValor1.setBounds(150, 200, 100, 40);
				lbValor2.setBounds(320, 150, 150, 40);
				tfValor2.setBounds(300, 200, 100, 40);

			} else if (rbCirculo.isSelected()) {

				limparComponentes();

				lbValor1 = new JLabel("Informe o Raio");
				tfValor1 = new JTextField("");

				getContentPane().add(tfValor1);
				getContentPane().add(lbValor1);

				lbValor1.setBounds(228, 150, 150, 40);
				tfValor1.setBounds(230, 200, 100, 40);

			} else if (rbTriangulo.isSelected()) {

				limparComponentes();

				lbValor1 = new JLabel("Informe a Base");
				lbValor2 = new JLabel("Altura");

				tfValor1 = new JTextField("");
				tfValor2 = new JTextField("");

				getContentPane().add(lbValor1);
				getContentPane().add(tfValor1);
				getContentPane().add(lbValor2);
				getContentPane().add(tfValor2);

				lbValor1.setBounds(145, 150, 150, 40);
				tfValor1.setBounds(150, 200, 100, 40);
				lbValor2.setBounds(320, 150, 150, 40);
				tfValor2.setBounds(300, 200, 100, 40);
			}

		}

	}

}
