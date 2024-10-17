package javaCursoNoite;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
public class CalculadoraIMC_IAC {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora de IMC e IAC");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(new GridLayout(5, 2));
        JLabel pesoLabel = new JLabel("Peso (kg):");
        JTextField pesoField = new JTextField();
        JLabel alturaLabel = new JLabel("Altura (m):");
        JTextField alturaField = new JTextField();
        JLabel resultadoLabel = new JLabel("Resultado:");
        JTextArea resultadoArea = new JTextArea();
        resultadoArea.setEditable(false);
        JButton calcularButton = new JButton("Calcular");
        // Adicionando o ActionListener corretamente
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double peso = Double.parseDouble(pesoField.getText());
                    double altura = Double.parseDouble(alturaField.getText());
                    
                    double imc = peso / (altura * altura);
                    double iac = (peso * 1.3) / (altura * altura) - 3.8; // Fórmula simplificada
                    
                    String resultado = String.format("IMC: %.2f\nIAC: %.2f", imc, iac);
                    resultadoArea.setText(resultado);
                    gerarArquivo(resultado);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Por favor, insira valores válidos.");
                }
            }
        });
        frame.add(pesoLabel);
        frame.add(pesoField);
        frame.add(alturaLabel);
        frame.add(alturaField);
        frame.add(calcularButton);
        frame.add(resultadoLabel);
        frame.add(new JScrollPane(resultadoArea));
        frame.setVisible(true);
    }
    private static void gerarArquivo(String resultado) {
        try (PrintWriter out = new PrintWriter(new FileOutputStream("resultado.txt"))) {
            out.println(resultado);
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}

	