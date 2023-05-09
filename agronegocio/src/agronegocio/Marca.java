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
public class Marca implements Vendavel {
    private int codigo;
    private String nome;

    public Marca(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        return 0;
    }
}

