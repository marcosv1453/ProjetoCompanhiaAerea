import dao.RepositorioVoo;
import entidade.Passageiro;
import entidade.Voo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AbcArea {
    public static void main(String[] args) {

        Scanner scanText = new Scanner(System.in);
        Scanner scanNumber = new Scanner(System.in);
        int menuPrincpal = 0;
        Double distancia = 0.0;
        Integer quantidade = 0;
        int linhas = 0;
        int coluna = 0;
        int listarVoos = 0;

        Voo voo = new Voo();
        RepositorioVoo repo = RepositorioVoo.getInstance();
        Passageiro passageiro = new Passageiro();

        while (menuPrincpal != 9) {

            System.out.println("Companhia Aérea ABC:");

            System.out.println("1 - Cadastrar Vôo");
            System.out.println("2 - Cadastrar Passageiro");
            System.out.println("3 - Listar Vôos");
            System.out.println("4 - Listar Passageiros");
            System.out.println("5 - Alterar Passageiro");
            System.out.println("6 - Remover Passageiro");
            System.out.println("7 - Alterar Vôo");
            System.out.println("8 - Remover Vôo");
            System.out.println("9 - Fechar Programa");

            menuPrincpal = scanNumber.nextInt();

            switch (menuPrincpal) {

                case (1):
                    System.out.println("-------Cadastrar Vôo-------");
                    System.out.println("Digite a distância a ser percorrida: ");
                    distancia = scanNumber.nextDouble();
                    System.out.println("Quantidade de Assentos Disponiveis:");
                    quantidade = scanNumber.nextInt();
                    voo = new Voo(distancia,quantidade,linhas,coluna);
                    repo.adicionarVoo(voo);
                    System.out.println(" ---- voo cadastrado ----");

                    break;
                case (2):
                    System.out.println("---------Cadastrar Passageiro----------");
                    System.out.println("Digite o nome do Passageiro");
                    passageiro.setNome(scanText.nextLine());
                    System.out.println("Passageiro Cadastrado");
                    System.out.println("codigo do passageiro: " + passageiro.getCodigo()  + "Nome do Passageiro: " + passageiro.getNome());

                    break;
                case (3):
                    System.out.println("Listar Vôos");
                    do {
                        System.out.println("1 -Listar Todos os Vôos");
                        System.out.println("2 -Vôos com Mais Assentos Ocupados");
                        System.out.println("3 -Vôos com menos Assentos Ocupados");
                        System.out.println("4 -Vôos com maior distância: ");
                        System.out.println("5 -Vôos com menor distância");
                        System.out.println("6 -Média de ocupação por vôo");

                        listarVoos = scanNumber.nextInt();

                        switch (listarVoos){

                            case (1):
                                System.out.println("Listar Todos os Vôos\n\n");

                                repo.recuperarTodosVoos().forEach(voo1 ->
                                        System.out.println("Codigo: " + voo1.getCodigo() +
                                             "\nDistancia:" + voo1.getDistancia() +
                                                "\nQuantidade de assentos: " + voo1.getQuantidade() + "\n"
                                        ));
                                break;
                            case(2):
                                System.out.println("Vôos com Mais Assentos Ocupados");

                                break;
                            case(3):
                                System.out.println("Vôos com menos Assentos Ocupados");
                                break;
                            case(4):
                                System.out.println("Vôos com maior distância: ");

                                break;

                            case(5):
                                System.out.println("Vôos com menor distância");

                                break;

                            case(6):
                                System.out.println("Média de ocupação por vôo");
                                break;
                            case(7):
                                System.out.println("Voltar ao Menu Principal !");
                                break;
                        }
                    }while (listarVoos != 6);

                    break;
                case (4):
                    System.out.println("Listar Passageiros");

                    break;
                case (5):
                    System.out.println("Alterar Passageiro");
                    break;
                case (6):
                    System.out.println("Excluir Passageiro");
                    break;
                case (7):
                    System.out.println("Alterar Vôo");
                    break;
                case (8):
                    break;
                case (9):
                    System.out.println("Programa Finalizado");
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;

            }
        }


    }
}
