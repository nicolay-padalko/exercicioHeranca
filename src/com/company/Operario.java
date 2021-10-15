package com.company;

public class Operario extends Empregado {

    private double valorProducao;
    public double salOperario;


    public Operario(String nome, String endereco, String telefone, int codigoSetor,
                    double salarioBase, int imposto, double valorProducao, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
    }
    public Operario(){
    }

    public double getValorProducao() {
        return valorProducao;
    }
    public void setValorProducao (double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double salarioOperario() {
        return salOperario = super.calcularSalario() + ( valorProducao * (super.getComissao() / 100));
    }


}


