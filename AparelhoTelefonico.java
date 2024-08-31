import java.util.Scanner;

public class AparelhoTelefonico {

  
    void  ligar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de contato que deseja telefonar com o DDD");
        String telefone = scanner.next();
        System.out.println("Ligando para" + telefone);
    }

    void atender(){
         Scanner scanner = new Scanner(System.in);
         System.out.print("Recebendo ligação! - Digite 1 para atender ou 2 para recusar");
         int chamada = scanner.nextInt();
         if (chamada == 1){
            System.out.println("Chamada atendida!");
         }
        else if (chamada == 2){
            System.out.println("Chamada Recusada!");
            }
        }
    
    void iniciar(){
        System.out.println("Iniciando seu aparelho");
    }
    
   
    }

   
   


