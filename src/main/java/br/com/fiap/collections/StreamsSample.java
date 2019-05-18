package br.com.fiap.collections;

import java.util.ArrayList;
class Cliente{

    private String nome;
    private int idade;

    public Cliente(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
public class StreamsSample {
    public static void main(String[] args) {

        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Cliente 1",30));
        clientes.add(new Cliente("Cliente 2", 18));
        clientes.add(new Cliente("Cliente 3", 22));
        clientes.add(new Cliente("Cliente 4", 26));
        clientes.add(new Cliente("Cliente 5", 41));


        int media = (int)clientes
                .stream()
                .mapToInt(Cliente::getIdade)
                .average()
                .getAsDouble();
        System.out.println("Média de idade: "+media);
    }
}
