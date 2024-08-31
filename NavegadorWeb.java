import java.util.Scanner;

public class NavegadorWeb {

    void exibirPagina(){
       System.out.println("Exibindo Página Atual");
    }

    void atualizarPagina(){
        System.out.println("Atualizando Página");
    }

    void  adicionarNovaAba(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indo para nova aba: Digite o nome da aba que deseja ir");
        String novaAba = scanner.next();
        System.out.println("Você está na aba" + novaAba);
    }
}
