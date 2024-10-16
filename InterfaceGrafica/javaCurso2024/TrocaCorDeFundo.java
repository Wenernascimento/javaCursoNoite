package javaCurso2024;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrocaCorDeFundo {
    private JFrame frame; // Janela principal
    private JPanel painel; // Painel onde a cor de fundo será alterada

    
    public TrocaCorDeFundo() {
        // Criando a janela
        frame = new JFrame("Troca de Cor de Fundo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 323);
        
        // Criando o painel
    
        painel = new JPanel();
        painel.setLayout(new FlowLayout()); // Layout para organizar os botões
        
        // Criando os botões
        JButton botaoVermelho = new JButton("Vermelho");
        JButton botaoAzul = new JButton("Azul");
        JButton botaoVerde = new JButton("Verde");
        
        // Adicionando ActionListeners para os botões
        
        botaoVermelho.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                painel.setBackground(Color.RED); // Altera a cor de fundo para vermelho
            }
        });
        
        botaoAzul.addActionListener(new ActionListener() {
        
        	@Override
            
        	public void actionPerformed(ActionEvent e) {
                painel.setBackground(Color.BLUE); // Altera a cor de fundo para azul
            }
        });
        
        botaoVerde.addActionListener(new ActionListener() {
            
        	@Override
            public void actionPerformed(ActionEvent e) {
            
        		painel.setBackground(Color.GREEN); // Altera a cor de fundo para verde
            }
        });
        
        // Adicionando os botões ao painel
        
        painel.add(botaoVermelho);
        painel.add(botaoAzul);
        painel.add(botaoVerde);
        
        // Adicionando o painel à janela
        
        frame.getContentPane().add(painel);
        
        // Tornando a janela visível
        
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        
    	// Executando a interface gráfica em um thread separado
        SwingUtilities.invokeLater(() -> new TrocaCorDeFundo());
    }
}

