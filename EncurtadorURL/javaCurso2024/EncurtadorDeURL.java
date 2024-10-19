package javaCurso2024;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class EncurtadorDeURL {
    private JTextField urlField;
    private JTextArea resultArea;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(EncurtadorDeURL::new);
    }

    public EncurtadorDeURL() {
        // Configuração da interface gráfica
        JFrame frame = new JFrame("Encurtador de URL");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        // Campo de entrada para a URL
        urlField = new JTextField();
        JButton shortenButton = new JButton("Encurtar URL");

        // Área de texto para exibir o resultado
        resultArea = new JTextArea();
        resultArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultArea);

        // Painel para os componentes de entrada
        JPanel inputPanel = new JPanel(new BorderLayout());
        inputPanel.add(urlField, BorderLayout.CENTER);
        inputPanel.add(shortenButton, BorderLayout.EAST);

        // Adicionando componentes ao frame
        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Listener do botão
        shortenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String longUrl = urlField.getText();
                String shortUrl = encurtarUrl(longUrl);
                resultArea.setText(shortUrl);
            }
        });

        frame.setVisible(true);
    }

    private String encurtarUrl(String longUrl) {
        String apiUrl = "https://api.tinyurl.com/create"; // Substitua pela URL da API real
        try {
            // Configurar conexão com a API
            URL url = new URL(apiUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            // Se necessário, adicione o cabeçalho de autenticação
            // conn.setRequestProperty("Authorization", "Bearer SUA_CHAVE_DE_API_AQUI");
            conn.setDoOutput(true);

            // JSON com a URL longa
            String jsonInputString = "{\"url\":\"" + longUrl + "\"}";

            // Envio da requisição
            conn.getOutputStream().write(jsonInputString.getBytes("UTF-8"));

            // Ler a resposta
            int responseCode = conn.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuilder response = new StringBuilder();
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
                return response.toString(); // Processar a resposta JSON se necessário
            } else {
                BufferedReader errorReader = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
                StringBuilder errorResponse = new StringBuilder();
                String errorLine;
                while ((errorLine = errorReader.readLine()) != null) {
                    errorResponse.append(errorLine);
                }
                errorReader.close();
                return "Erro: " + responseCode + " - " + errorResponse.toString();
            }
        } catch (Exception e) {
            return "Erro ao encurtar a URL: " + e.getMessage();
        }
    }
}
