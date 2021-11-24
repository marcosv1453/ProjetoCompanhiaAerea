package entidade;

import java.util.*;

public class Voo {

    private Integer codigo;
    private Double distancia;
    private Integer quantidade;

    //Passageiros criado com matriz
    private Passageiro passageiros[][];

    public Voo(){

    }
    //Construtor
    public Voo (double distancia, Integer quantidadePasseiros, int qtdLinhas, int qtdColunas){

        this.codigo = new Random().nextInt();
        this.distancia = distancia;
        this.quantidade = quantidadePasseiros;
        passageiros = new Passageiro[qtdLinhas][qtdColunas];
        /* passageiro tem linha e coluna
        vamos pensar igual ao avião comercial que roda no Brasil, ele tem dois lados
        e cada fileira tem os assentos A B C , D E F ...
         */
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Passageiro[][] getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(Passageiro[][] passageiros) {
        this.passageiros = passageiros;
    }

    //Reemplementacao do metodo equals para utilizar apenas o codigo como identificador para comparação
    @Override
    public boolean equals(Object obj) {
        Voo entrada = (Voo)obj;
        if(entrada.getCodigo() == this.codigo){
            return true;
        }else{
            return false;
        }
    }

}
