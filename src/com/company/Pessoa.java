package com.company;

public class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;

    public Pessoa (String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public Pessoa () {
    }

    public String getNome() {
        return nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setNome(String value) {
        if(!value.isEmpty()) {
            nome = value;
        }
    }
    public void setEndereco(String value) {
        if(!value.isEmpty()) {
            endereco = value;
        }
    }
    public void setTelefone(String value) {
        if(!value.isEmpty()) {
            telefone = value;
        }
    }
}
