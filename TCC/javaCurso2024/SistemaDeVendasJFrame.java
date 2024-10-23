package javaCurso2024;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

// Classe Produto para representar os produtos +no sistema
class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() { return nome; }
    public double getPreco() { return preco; }
    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    @Override
    public String toString() {
        return nome + " - " + preco + "€ (Stock: " + quantidade + ")";
    }
}

// Classe principal do sistema
public class SistemaDeVendasJFrame extends JFrame {
    private ArrayList<Produto> produtos = new ArrayList<>();
    private DefaultListModel<String> listaModelo = new DefaultListModel<>();
    private JList<String> listaProdutos = new JList<>(listaModelo);

    public SistemaDeVendasJFrame() {
        // Configurações da janela principal
        setTitle("Sistema de Vendas");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Painel para adicionar novos produtos
        JPanel painelAdicionar = new JPanel();
        painelAdicionar.setLayout(new GridLayout(4, 2));

        JTextField campoNome = new JTextField();
        JTextField campoPreco = new JTextField();
        JTextField campoQuantidade = new JTextField();
        JButton botaoAdicionar = new JButton("Adicionar Produto");

        painelAdicionar.add(new JLabel("Nome do Produto:"));
        painelAdicionar.add(campoNome);
        painelAdicionar.add(new JLabel("Preço:"));
        painelAdicionar.add(campoPreco);
        painelAdicionar.add(new JLabel("Quantidade:"));
        painelAdicionar.add(campoQuantidade);
        painelAdicionar.add(new JLabel("")); // Espaço vazio
        painelAdicionar.add(botaoAdicionar);

        // Painel para a lista de produtos e botão de vender
        JPanel painelProdutos = new JPanel();
        painelProdutos.setLayout(new BorderLayout());

        JButton botaoVender = new JButton("Vender Produto");

        painelProdutos.add(new JScrollPane(listaProdutos), BorderLayout.CENTER);
        painelProdutos.add(botaoVender, BorderLayout.SOUTH);

        // Adicionar os painéis à janela
        add(painelAdicionar, BorderLayout.NORTH);
        add(painelProdutos, BorderLayout.CENTER);

        // Ação do botão Adicionar Produto
        botaoAdicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = campoNome.getText();
                try {
                    double preco = Double.parseDouble(campoPreco.getText());
                    int quantidade = Integer.parseInt(campoQuantidade.getText());
                    Produto produto = new Produto(nome, preco, quantidade);
                    produtos.add(produto);
                    listaModelo.addElement(produto.toString());

                    // Limpar os campos após adicionar
                    campoNome.setText("");
                    campoPreco.setText("");
                    campoQuantidade.setText("");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Erro: Preço e Quantidade devem ser números.");
                }
            }
        });

        // Ação do botão Vender Produto
        botaoVender.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = listaProdutos.getSelectedIndex();
                if (index >= 0) {
                    Produto produtoSelecionado = produtos.get(index);
                    if (produtoSelecionado.getQuantidade() > 0) {
                        produtoSelecionado.setQuantidade(produtoSelecionado.getQuantidade() - 1);
                        listaModelo.set(index, produtoSelecionado.toString());
                    } else {
                        JOptionPane.showMessageDialog(null, "Produto sem stock!");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Selecione um produto para vender.");
                }
            }
        });
    }

    public static void main(String[] args) {
        // Inicializar a aplicação
        SwingUtilities.invokeLater(() -> {
            SistemaDeVendasJFrame frame = new SistemaDeVendasJFrame();
            frame.setVisible(true);
        });
    }
}