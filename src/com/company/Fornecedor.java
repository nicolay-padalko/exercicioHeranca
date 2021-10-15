package com.company;

public class Fornecedor extends Pessoa{

    public Fornecedor(String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
    }

    private int valorCredito;
    private int valorDivida;

    public int obterSaldo (int valorCredito, int valorDivida) {
        int saldo;
        return saldo = valorCredito - valorDivida;
    }
}
