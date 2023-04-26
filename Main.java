import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {

        Menu menu = new Menu();
        Scanner leitor = new Scanner(System.in);
        int opcao = 0;
        int opcaoAdd = 0;

        menu.IniciaLista();

        while (opcao != 5) {
            menu.principal();
            opcao = Integer.parseInt(leitor.nextLine());
            if (opcao == 1) {
                while (opcaoAdd != 2 ) {
                    menu.adicionarPrincipal();
                    opcaoAdd = Integer.parseInt(leitor.nextLine());
                    if (opcaoAdd == 1) {
                        menu.adicionarInterno();
                    }
                }
            }
            if (opcao == 2) {
                menu.deletar();
            }
            if (opcao == 3) {
                menu.getLista();
            }
            if (opcao == 4) {
                menu.informacoes();
            }
            if (opcao < 1 || opcao > 5) {
                menu.opcaoInvalida();
            }
        }

        menu.escreveArquivo();

    }
}