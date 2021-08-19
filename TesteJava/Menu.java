import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Elevador1 controle = new Elevador1();
        int verificador = 0;
        int contadorSubir = 0;
        int contadorDescer = 0;

        System.out.println("Olá, por favor nos informe as respectivas perguntas");
        System.out.println("---------------");

        System.out.println("| Capacidade do elevador: ");
        int capacidade = input.nextInt();
        controle.setCapacidade(capacidade);
        System.out.println("| Número de andares (excetue o térreo): ");
        int ultimoandar = input.nextInt();
        controle.setUltimoandar(ultimoandar);
   
        controle.inicializar();
 

        System.out.println("Quantas pessoas entrarão neste andar? ");
        int a = input.nextInt();
        controle.entrar(a);

        while( verificador <= a ){
            System.out.println("Deseja subir ou descer? ");
            String resposta = input.next();
            if( resposta.equalsIgnoreCase("subir") ){
                contadorSubir++;
            }else{
                contadorDescer++;
            }
            verificador++;
        }
        if( contadorSubir > contadorDescer ){
            controle.subir();
            controle.sair(a);
            controle.descer();
            controle.descer();
            controle.sair(a);
        }else{
            controle.descer();
            controle.sair(a);
            controle.subir();
            controle.subir();
            controle.sair(a);
        }
            
    }
}
