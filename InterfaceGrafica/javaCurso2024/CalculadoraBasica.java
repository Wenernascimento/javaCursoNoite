package javaCurso2024;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraBasica {
    private JTextField campoNumero1; // Campo para o primeiro númer0
    private JTextField campoNumero2; // Campo para o segundo número
    private JLabel resultadoLabel; // JLabel para exibir o resultado
    private JButton botaoSomar; // Botão para realizar a soma

    public CalculadoraBasica() {
        // Criando a janela
        JFrame frame = new JFrame("Calculadora Básica");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        
        // Criando os campos de texto
        campoNumero1 = new JTextField(10);
        campoNumero2 = new JTextField(10);
        
        // Criando o JLabel para o resultado
        resultadoLabel = new JLabel("Resultado: ");
        
        // Criando o botão
        botaoSomar = new JButton("Somar");
        botaoSomar.addActionListener(new ActionListener() {
           
        	@Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Obtém os números dos campos de texto
                    double numero1 = Double.parseDouble(campoNumero1.getText());
                    double numero2 = Double.parseDouble(campoNumero2.getText());
                    
                    // Calcula a soma
                    double resultado = numero1 + numero2;
                    
                    // Atualiza o JLabel com o resultado
                    resultadoLabel.setText("Resultado: " + resultado);
                } catch (NumberFormatException ex) {
                    // Exibe uma mensagem de erro se a entrada não for válida
                    JOptionPane.showMessageDialog(frame, "Por favor, insira números válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
      
        // Criando um painel para organizar os componentes
        JPanel painel = new JPanel();
        painel.add(new JLabel("Número 1:"));
        painel.add(campoNumero1);
        painel.add(new JLabel("Número 2:"));
        painel.add(campoNumero2);
        painel.add(botaoSomar);
        painel.add(resultadoLabel);
        
        // Adicionando o painel ao frame
        frame.getContentPane().add(painel);
        
    
        // Tornando a janela visível
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Executando a interface gráfica em um thread separado
        SwingUtilities.invokeLater(() -> new CalculadoraBasica());
    }
}
