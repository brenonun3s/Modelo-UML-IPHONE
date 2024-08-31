import java.util.Scanner;

public class ReprodutorMusical {
    
    void selecionarMusica(){
        System.out.println("Olá, digite o nome da música que deseja tocar:\n");
        Scanner scanner = new Scanner(System.in);
        String musicaSelecionada = scanner.next();
        System.out.println("Reproduzindo" + musicaSelecionada);
    }

    void pausarMusica(){
        System.out.println("Pausando a música");
    }

    void tocarMusica(){
        System.out.println("Tocando a música");
    }
}
