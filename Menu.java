import java.io.IOException;
import java.util.Scanner;

public class Menu {

    Motor motor = new Motor();

    public void principal() {
        System.out.println("");
        System.out.println("----------------------");
        System.out.println("-  LISTA DE COMPRAS  -");
        System.out.println("----------------------");
        System.out.println("-        Menu        -");
        System.out.println("----------------------");
        System.out.println("- 1 - Adicionar item -");
        System.out.println("- 2 - Deletar item   -");
        System.out.println("-                    -");
        System.out.println("- 3 - Mostrar lista  -");
        System.out.println("-                    -");
        System.out.println("- 4 - Informações    -");
        System.out.println("- 5 - Sair           -");
        System.out.println("----------------------");
        System.out.print("Digite sua opção : ");
    }
    public void adicionarPrincipal() {
        System.out.println("");
        System.out.println("----------------------");
        System.out.println("-  LISTA DE COMPRAS  -");
        System.out.println("----------------------");
        System.out.println("-      Adicionar     -");
        System.out.println("----------------------");
        System.out.println("- 1 - Novo Item      -");
        System.out.println("- 2 - Retornar       -");
        System.out.println("----------------------");
        System.out.print("Digite sua opção : ");
    }
    public void adicionarInterno() throws IOException {

        Scanner leitor = new Scanner(System.in);
        String nome;
        double quantidade;
        String unidade;

        System.out.println("");
        System.out.print("Digite o nome do item : ");
        nome = leitor.nextLine();
        System.out.print("Digite a quantidade desejada : ");
        quantidade = Double.parseDouble(leitor.nextLine());
        System.out.print("Digite a unidade correspondente (ex. quilo, litro, etc...) : ");
        unidade = leitor.nextLine();

        motor.addItem(nome, quantidade, unidade);

    }
    public void deletar() throws IOException {

        Scanner leitor = new Scanner(System.in);

        System.out.println("");
        System.out.println("----------------------");
        System.out.println("-  LISTA DE COMPRAS  -");
        System.out.println("----------------------");
        System.out.println("-       Exluir       -");
        System.out.println("----------------------");
        System.out.print("Digite a ID do item : ");
        motor.deletaItem(Integer.parseInt(leitor.nextLine()));
    }
    public void informacoes() {
        System.out.println("");
        System.out.println("");
        System.out.println("----------------------");
        System.out.println("-     INFORMAÇÕES    -");
        System.out.println("----------------------");
        System.out.println("");
        System.out.println("Rafael M. Antonelli");
        System.out.println("Abril de 2023");
        System.out.println("");
        System.out.println("Obrigado por utilizar");
        System.out.println("");
        System.out.println("");
    }
    public void opcaoInvalida() {
        System.out.println("");
        System.out.println("----------------------");
        System.out.println("----------------------");
        System.out.println("-  Opção  inválida!  -");
        System.out.println("-  Favor reinformar  -");
        System.out.println("----------------------");
        System.out.println("----------------------");
        System.out.println("");
    }
    public void IniciaLista() throws IOException {
        motor.iniciaLista();
    }
    public void escreveArquivo() throws IOException {
        motor.escreveArquivo();
    }
    public Menu() throws IOException {
    }
    public void getLista() throws IOException {
        motor.getLista();
    }

}
