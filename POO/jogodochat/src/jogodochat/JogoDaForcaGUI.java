package jogodochat;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 *
 * @author adrian
 */

public class JogoDaForcaGUI extends Application {

    private static void launch(String[] args) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private String palavraSecreta;
    private char[] palavraOculta;
    private int tentativas = 0;
    private int maxTentativas = 6;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Jogo da Forca");

        palavraSecreta = escolherPalavra();
        palavraOculta = new char[palavraSecreta.length()];
        for (int i = 0; i < palavraOculta.length; i++) {
            palavraOculta[i] = '_';
        }

        Label palavraLabel = new Label("Palavra: " + new String(palavraOculta));
        Label tentativasLabel = new Label("Tentativas restantes: " + (maxTentativas - tentativas));

        TextField letraInput = new TextField();
        letraInput.setPrefWidth(40);

        Button tentarButton = new Button("Tentar");
        tentarButton.setOnAction(e -> tentar(letraInput, palavraLabel, tentativasLabel));

        HBox inputBox = new HBox(10, new Label("Digite uma letra:"), letraInput, tentarButton);
        inputBox.setAlignment(Pos.CENTER);

        VBox layout = new VBox(20, palavraLabel, tentativasLabel, inputBox);
        layout.setAlignment(Pos.CENTER);
        layout.setPadding(new Insets(20));

        Scene scene = new Scene(layout, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private String escolherPalavra() {
        String[] palavras = {"java", "python", "javascript", "html", "css", "php"};
        return palavras[(int) (Math.random() * palavras.length)];
    }

    private void tentar(TextField letraInput, Label palavraLabel, Label tentativasLabel) {
        if (tentativas < maxTentativas) {
            char letra = letraInput.getText().toLowerCase().charAt(0);

            if (jaTentouLetra(letra, palavraOculta)) {
                exibirAlerta("Você já tentou essa letra. Tente outra.");
            } else {
                if (palavraSecreta.indexOf(letra) != -1) {
                    atualizarPalavraOculta(letra);
                } else {
                    tentativas++;
                }
            }

            palavraLabel.setText("Palavra: " + new String(palavraOculta));
            tentativasLabel.setText("Tentativas restantes: " + (maxTentativas - tentativas));

            if (checarFimDeJogo()) {
                encerrarJogo();
            }
        }
    }

    private boolean jaTentouLetra(char letra, char[] palavraOculta) {
        return new String(palavraOculta).indexOf(letra) != -1;
    }

    private void atualizarPalavraOculta(char letra) {
        for (int i = 0; i < palavraSecreta.length(); i++) {
            if (palavraSecreta.charAt(i) == letra) {
                palavraOculta[i] = letra;
            }
        }
    }

    private boolean checarFimDeJogo() {
        return tentativas == maxTentativas || new String(palavraOculta).equals(palavraSecreta);
    }

    private void encerrarJogo() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Fim do Jogo");

        if (tentativas == maxTentativas) {
            alert.setHeaderText("Game Over. A palavra era: " + palavraSecreta);
        } else {
            alert.setHeaderText("Parabéns! Você acertou a palavra.");
        }

        alert.showAndWait();
        System.exit(0);
    }
}

