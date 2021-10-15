package com.company;

public class Vendedor extends Empregado{

    private double valorVendas;

    public Vendedor(String nome, String endereco, String telefone, int codigoSetor,
                    double salarioBase, int imposto, double valorVendas, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto, comissao);
        this.valorVendas = valorVendas;
    }
    public double getValorVendas() {
        return valorVendas;
    }
    public void setValorVendas (double valorVendas) {
        this.valorVendas = valorVendas;
    }
}
