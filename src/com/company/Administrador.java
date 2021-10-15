package com.company;

public class Administrador extends  Empregado{

    private double ajudaDeCusto;
    private double salarioFinal;

    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase,
                         int imposto, double ajudaDeCusto)
    {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }
    public Administrador(){
    }
    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }
    public  double getSalarioFinal() {
        return salarioFinal;
    }
    public void setAjudaDeCusto(double ajudaDeCusto) {
            this.ajudaDeCusto = ajudaDeCusto;
    }
    public void setSalarioFinal(double salarioFinal) {
        this.salarioFinal = salarioFinal;
    }


    public double salarioAdm() {
        return salarioFinal = super.calcularSalario() + ajudaDeCusto;
    }
}
