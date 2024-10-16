package javaCurso2024;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormularioSimples {
    private JTextField campoNome; // Campo para nome
    private JTextField campoIdade; // Campo para idade
    private JButton botao; // Botão para enviar

    public FormularioSimples() {
        // Criando a janela
        JFrame frame = new JFrame("Formulário Simples");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        
        // Criando os campos de texto
        campoNome = new JTextField(20);
        campoIdade = new JTextField(3);
        
        // Criando o botão
        botao = new JButton("Enviar");
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = campoNome.getText(); // Obtém o nome
                String idade = campoIdade.getText(); // Obtém a idade
                
                // Exibe as informações em um JOptionPane
                JOptionPane.showMessageDialog(frame, "Nome: " + nome + "\nIdade: " + idade);
            }
        });
        
        // Criando um painel para organizar os componentes
        JPanel painel = new JPanel();
        painel.add(new JLabel("Nome:"));
        painel.add(campoNome);
        painel.add(new JLabel("Idade:"));
        painel.add(campoIdade);
        painel.add(botao);
        
        // Adicionando o painel ao frame
        frame.getContentPane().add(painel);
        
        // Tornando a janela visível
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Executando a interface gráfica em um thread separado
        SwingUtilities.invokeLater(() -> new FormularioSimples());
    }
}

