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
public class Estoque extends Produto {
    private int quantidade;
    String nome = null;

    public Estoque(int quantidade, int codigo, String nome, double preco, Marca marca, Categoria categoria) {
        super(codigo, nome, preco, marca, categoria);
        this.quantidade = quantidade;
    } 
    
    public int getQuantidade() {
        return quantidade;
    }
}