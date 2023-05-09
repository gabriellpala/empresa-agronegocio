

package view;

import agronegocio.Categoria;
import agronegocio.Cliente;
import agronegocio.Estoque;
import agronegocio.Marca;
import agronegocio.Produto;

public class Main {
public static void main(String[] args) {
    
Marca marca1 = new Marca(1, " john deere");
Categoria categoria1 = new Categoria(1, " maquinario");
Produto produto1 = new Produto(1, "Trator Série 7J", 200000.00, marca1, categoria1);
Cliente cliente1 = new Cliente(1, "João da Silva", "Rua 123, São Paulo", "(11) 99999-9999");    
Estoque e1 = new Estoque(50, 0, "nome do estoque", 0, marca1, categoria1);
    System.out.println("Informações do Produto: ");
    System.out.println("Nome: " + produto1.getNome());
    System.out.println("Marca: " + produto1.getMarca().getNome());
    System.out.println("Categoria: " + produto1.getCategoria().getNome());
    System.out.println("Preço: R$" + produto1.getPreco());
    System.out.println("---------------------------");

    System.out.println("Informações do Cliente: ");
    System.out.println("Nome: " + cliente1.getNome());
    System.out.println("Endereço: " + cliente1.getEndereco());
    System.out.println("Telefone: " + cliente1.getTelefone());
    System.out.println("---------------------------");

    System.out.println("Informações do Estoque: ");
    System.out.println("Nome: " + produto1.getNome());
    System.out.println("Marca: " + produto1.getMarca().getNome());
    System.out.println("Categoria: " + produto1.getCategoria().getNome());
    System.out.println("Preço: R$" + produto1.getPreco());
    System.out.println("Quantidade: " + e1.getQuantidade());
    System.out.println("---------------------------");
 }

}