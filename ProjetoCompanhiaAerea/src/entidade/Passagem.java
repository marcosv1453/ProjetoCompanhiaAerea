package entidade;

import java.util.Random;

public class Passagem {

    private int codigo;
    private Voo voo;
    private Passageiro passageiro;
    private int linha;
    private int coluna;

    public Passagem(){

    }

    public Passagem(Voo voo,Passageiro passageiro,int linha, int coluna){

        this.codigo = new Random().nextInt();
        this.voo = voo;
        this.passageiro = passageiro;
        this.linha = linha;
        this.coluna = coluna;
    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }
}
