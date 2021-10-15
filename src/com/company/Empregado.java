package com.company;

public class Empregado extends Pessoa{

    private int codigoSetor;
    private double salarioBase;
    private double imposto;
    private double salarioLiquido;
    private int saldo;
    private double comissao;


    public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, int imposto) {
        super(nome, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }
    public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, int imposto, double comissao) {
        super(nome, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
        this.comissao = comissao;
    }
    public Empregado() {
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }
    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    public double getImposto() {
        return imposto;
    }
    public void setImposto(int imposto) {
        this.imposto = imposto;
    }
    public double getSalarioLiquido() {
        return salarioLiquido;
    }
    public void setSalarioLiquido(double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }
    public int getSaldo() {
        return saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    public double getComissao() { return comissao; }
    public void setComissao(double comissao) { this.comissao = comissao; }



    public double calcularSalario() {
        return salarioLiquido = salarioBase - (salarioBase * (imposto / 100));
    }

    public int obterSaldo (int valorCredito, int valorDivida) {
        return saldo = valorCredito - valorDivida;
    }

}
