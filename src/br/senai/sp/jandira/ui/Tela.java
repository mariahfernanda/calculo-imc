package br.senai.sp.jandira.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import calculo.CalculoImc;

public class Tela {

	public void criarTela() {
		Scanner leitor = new Scanner(System.in);

		Color blue = new Color(0, 200, 180);

		JFrame telinha = new JFrame();
		telinha.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telinha.setSize(500, 600);
		telinha.setTitle("Calculadora IMC");
		telinha.setLayout(null);

		JLabel lblTitulo = new JLabel();
		lblTitulo.setText("CALCULADORA IMC");
		lblTitulo.setBounds(60, 1, 300, 100);
		lblTitulo.setFont(new Font("Times new Roman", Font.BOLD, 25));
		lblTitulo.setForeground(blue);

		JLabel lblPeso = new JLabel();
		lblPeso.setText("Seu peso: ");
		lblPeso.setBounds(20, 105, 110, 40);

		JTextField txtPeso = new JTextField();
		txtPeso.setText("");
		txtPeso.setBounds(100, 110, 100, 30);

		JLabel lblAltura = new JLabel();
		lblAltura.setText("Sua altura: ");
		lblAltura.setBounds(20, 150, 100, 30);

		JTextField txtAltura = new JTextField();
		txtAltura.setText("");
		txtAltura.setBounds(100, 150, 100, 30);

		JButton bttCalcular = new JButton();
		bttCalcular.setText("CALCULAR");
		bttCalcular.setBounds(20, 200, 200, 50);

		JLabel lblResultado = new JLabel();
		lblResultado.setText("RESULTADO:");
		lblResultado.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblResultado.setBounds(20, 230, 120, 120);

		JLabel lblValorImc = new JLabel();
		lblValorImc.setText("Valor IMC:");
		lblValorImc.setBounds(30, 260, 1300, 130);

		JLabel lblEstadoImc = new JLabel();
		lblEstadoImc.setText("Estado IMC:");
		lblEstadoImc.setBounds(30, 300, 130, 130);

		telinha.getContentPane().add(lblTitulo);
		telinha.getContentPane().add(lblPeso);
		telinha.getContentPane().add(txtPeso);
		telinha.getContentPane().add(lblAltura);
		telinha.getContentPane().add(txtAltura);
		telinha.getContentPane().add(bttCalcular);
		telinha.getContentPane().add(lblResultado);
		telinha.getContentPane().add(lblValorImc);
		telinha.getContentPane().add(lblEstadoImc);
		telinha.setVisible(true);

		bttCalcular.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				CalculoImc imc = new CalculoImc();
				imc.setPeso(txtPeso.getText());
				imc.setAltura(txtAltura.getText());
				
				lblValorImc.setText(imc.mostrarImcComoString());
				
				lblEstadoImc.setText(imc.mostrarStatusImc());
				
			

			}
		});

	}
}
