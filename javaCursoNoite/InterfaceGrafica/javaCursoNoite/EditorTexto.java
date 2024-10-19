package javaCursoNoite;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class EditorTexto extends JFrame implements ActionListener {
	JTextArea areaTexto;
	JMenuBar menuBar;
	JMenu menuArquivo;
	JMenuItem abrir, salvar, sair;

	public EditorTexto() {
	 // Configurando a janela (JFrame)
		setTitle("Editor de Texto");
		setSize(500,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Criando a área de texto (JTextArea)
		areaTexto = new JTextArea();
		JScrollPane scrollPane = new JScrollPane (areaTexto); 
		add(scrollPane);
		
		// Criando a barra de menu (JMenuBar)
		menuBar = new JMenuBar();
        menuArquivo = new JMenu("Arquivo");
		
		// Criando as itens de menu (JMenuItem)
	abrir = new JMenuItem("abrir");
	salvar = new JMenuItem("Salvar");
	sair = new JMenuItem("Sair");
	
	// adicionando os ouvintes de eventeos (activonListener)
	abrir.addActionListener(this);
	salvar.addActionListener(this);
	sair.addActionListener(this);
	
	// Adicionando os itens ao menu
	menuArquivo.add(abrir);
	menuArquivo.add(salvar);	
	menuArquivo.add(sair);
	// Adicionando o menu a barra de menu
	menuBar.add(menuArquivo);
	
	// configurando a barra de menu na janela
	setJMenuBar(menuBar);
	}
	//definindo as ações dos itens de menu
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == abrir) {
			JFileChooser fileChooser = new JFileChooser();
			int opcao = fileChooser.showOpenDialog(this);
			if (opcao == JFileChooser.APPROVE_OPTION) {
				try {
					File arquivo = fileChooser.getSelectedFile();
					BufferedReader leitor = new BufferedReader(new FileReader(arquivo));
					areaTexto.read(leitor, null);
					leitor.close();
				} catch (IOException ex) {
					JOptionPane.showMessageDialog(this, "Erro ao abrir o arquivo");
				}

			}
		} else if (e.getSource() == sair) {
			System.exit(0);

		}

	}

// Método principal para iniciar o editor de texto
	public static void main(String[] args) {
			SwingUtilities.invokeLater(() -> {
			new EditorTexto().setVisible(true); 
		});
	
}

}

