package dao;

import entidade.Passageiro;
import entidade.Passagem;
import entidade.Voo;

import java.util.ArrayList;
import java.util.List;

/**
 * Cria uma instacia unica do repositorio..
 * onde ele nao pode gerar um novo
 */
public class RepositorioVoo {

    private static RepositorioVoo instanciaUnica;

    private RepositorioVoo() { }

    public static synchronized RepositorioVoo getInstance() {
        if (instanciaUnica == null) {
            instanciaUnica = new RepositorioVoo();
        }
        return instanciaUnica;
    }

    private List<Voo> listaVoos = new ArrayList<Voo>();

    public List<Voo> getListaVoos() {
        return listaVoos;
    }

    public void setListaVoos(List<Voo> listaVoos) {
        this.listaVoos = listaVoos;
    }

    /**
     * Metodo utilizado para recuperar todos os voos
     * @return listaVoos
     */
    public List<Voo> recuperarTodosVoos(){
        return this.listaVoos;
    }

    public boolean adicionarVoo(Voo voo){
        this.listaVoos.add(voo);
        return true;
    }

    public boolean alterarVoo(Voo voo){
        Voo vooExiste = this.existeVoo(voo);
        if(vooExiste != null){
            this.listaVoos.remove(vooExiste);
            this.adicionarVoo(voo);
            return true;
        }else{
            System.out.println("Voo não existe !");
            return false;
        }
    }

    public boolean removerVoo(Voo voo){
        Voo vooExiste = this.existeVoo(voo);
        if (vooExiste != null){
            this.listaVoos.remove(vooExiste);
            return true;
        }else {
            System.out.println("Voo não existe !");
            return false;
        }
    }

    public Voo existeVoo(Voo voo){
        int index = this.listaVoos.indexOf(voo);
        // verifica
        if(index == -1){
            return null;
        }else{
            return this.listaVoos.get(index);
        }
    }

    public Passageiro existePassageiro(Voo voo, int linha, int coluna){
        Passageiro passExiste = voo.getPassageiros()[linha][coluna];
        if(passExiste != null){
            return passExiste;
        }else{
            return null;
        }
    }

    public boolean adicionarPassageiro(Passagem passagem){
        Voo vooExiste = this.existeVoo(passagem.getVoo());
        if(vooExiste != null){
            Passageiro passExiste = this.existePassageiro(passagem.getVoo(), passagem.getLinha() -1, passagem.getColuna() -1);
            if(passExiste == null){
                vooExiste.getPassageiros()[passagem.getLinha() - 1][passagem.getColuna() - 1] = passagem.getPassageiro();
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }


}
