package javaCurso2024;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContadorDeCliques {
private int contador = 0; // Variável para contar os cliques
private JLabel label; // JLabel para exibir o contador
private JButton botao; // JButton para incrementar o contador

public ContadorDeCliques() {
	// Criando a janela
	JFrame frame = new JFrame("Contador de Cliques");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 150);
    // Criando o JLabel
   
    label = new JLabel("Clique:" + contador);
    label.setHorizontalAlignment(SwingConstants.CENTER);
    
    // Criando o JButton
    botao = new JButton("Clique Aqui");
    botao.addActionListener(new ActionListener() {
    	@Override
    	
    	public void actionPerformed(ActionEvent e) {
    contador++; // Incrementa o contador
    label.setText("Clique:" + contador ); // atualiza o JLabel
    	}
    });
    
    // Adicionando componentes ao frame
    frame.getContentPane().setLayout(new java.awt.BorderLayout());
    frame.getContentPane().add(label,java.awt.BorderLayout.CENTER);
    frame.getContentPane().add(botao, java.awt.BorderLayout.SOUTH);
    
    // Tornando a janela visivel
    frame.setVisible(true);
}
 public static void main (String[] args) {
	// Exexutando a interface gráfica em um thread separado
	SwingUtilities.invokeLater(() -> new ContadorDeCliques());
	
    	

}
    	
    
    
}









	
