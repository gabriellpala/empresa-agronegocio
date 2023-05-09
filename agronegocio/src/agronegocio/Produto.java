/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agronegocio;

/**
 *
 * @author 13304611690
 */
public class Produto implements Vendavel {
    private int codigo;
    private String nome;
    private double preco;
    private Marca marca;
    private Categoria categoria;

    public Produto(int codigo, String nome, double preco, Marca marca, Categoria categoria) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.marca = marca;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    public Marca getMarca() {
        return marca;
    }

    public Categoria getCategoria() {
        return categoria;
    }
}
