import dao.RepositorioVoo;
import entidade.Passageiro;
import entidade.Passagem;
import entidade.Voo;

public class teste {

    public static void main(String[] args) {

        RepositorioVoo repo = RepositorioVoo.getInstance();

        Voo primeiroVoo = new Voo(20, 10, 5, 2);
        Voo segundoVoo = new Voo(50, 10, 5, 2);
        repo.adicionarVoo(primeiroVoo);

        repo.adicionarVoo(segundoVoo);

        Passageiro p1 = new Passageiro("Jailtom");
        Passageiro p2 = new Passageiro("Luigi");

        Passagem passagem1 = new Passagem(primeiroVoo, p1,1,1);
        Passagem passagem2 = new Passagem(segundoVoo,p2,1,1);

        repo.adicionarPassageiro(passagem1);
        repo.adicionarPassageiro(passagem2);

        imprimirPassageirosVoo(primeiroVoo);
        imprimirPassageirosVoo(segundoVoo);

        //--------------------------------------------------------------------

//        Passageiro p2 = new Passageiro("Jailton Das MEninas");
//
//        imprimirPassageirosVoo(segundoVoo);
//
//        Passagem passagem2 = new Passagem(segundoVoo, p2, 10, 1);
//
//        repo.adicionarPassageiro(passagem2);



//        Passageiro p3 = new Passageiro("CArlar");
//
//
//
//        Passagem passagem3 = new Passagem(primeiroVoo, p2, 5, 3);
//        Passagem passagem4 = new Passagem(primeiroVoo, p2, 13, 4);


    }

    public static void imprimirPassageirosVoo(Voo voo){
//para imprimir o passageiro, temos que criar dois for. Um para ler a linha e outro para ler a coluna.
      //aqui iremos imprimir o que falamos lá na classe voo, falando sobre os aviões no Brasil.
        for(int i = 0; i < voo.getPassageiros().length; i++) {
            for (int j = 0; j < voo.getPassageiros()[0].length; j++) {
                System.out.print("i:" + (i + 1) + " j:"+ (j+1) + " => " );
                if(voo.getPassageiros()[i][j] != null){
                    System.out.print(voo.getPassageiros()[i][j].getCodigo() +
                            " - " + voo.getPassageiros()[i][j].getNome() + " \n");
                }else{
                    System.out.println(" Null \n");
                }
            }
        }
    }

//    String vetor[][] = new String[10][2];
//
//    vetor[0][1] = "Jailtons das meninas";
//
//        System.out.println(vetor.length + " - " + vetor[0].length);
//
//        for(int i = 0; i < 10; i++) {
//        for (int j = 0; j < 2; j++) {
//            System.out.println("i:" + i + " j:"+ j + " => " + vetor[i][j]);
////                tab[i][j] = i * j;
//        }
//    }
}
