package com.company;

public class Vendedor extends Empregado{

    private double valorVendas;
    public double salVendedor;

    public Vendedor(String nome, String endereco, String telefone, int codigoSetor,
                    double salarioBase, int imposto, double valorVendas, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto, comissao);
        this.valorVendas = valorVendas;
    }
    public Vendedor(){
    }
    public double getValorVendas() {
        return valorVendas;
    }
    public void setValorVendas (double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double salarioVendedor() {
        return salVendedor = super.calcularSalario() + ( valorVendas * (super.getComissao() / 100));
    }
}
