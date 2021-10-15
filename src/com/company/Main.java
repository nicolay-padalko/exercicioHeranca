package com.company;

public class Main {

    public static void main(String[] args) {
        Administrador adm = new Administrador();

        adm.setSalarioBase(5500.0);
        adm.setAjudaDeCusto(750.5);
        adm.setImposto(10);

        System.out.println(adm.salarioAdm());

        Empregado emp = new Empregado();
        emp.setSalarioBase(2500.0);
        emp.setImposto(7);

        System.out.println(emp.calcularSalario());

        Operario oper = new Operario();
        oper.setValorProducao(4500.0);
        oper.setComissao(10);
        oper.setSalarioBase(2500.0);
        oper.setImposto(7);

        System.out.println(oper.salarioOperario());

        Vendedor vend = new Vendedor();
        vend.setValorVendas(7500.0);
        vend.setComissao(20);
        vend.setSalarioBase(2500.0);
        vend.setImposto(7);

        System.out.println(vend.salarioVendedor());



    }
}
