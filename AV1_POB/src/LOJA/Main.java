package LOJA;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Produtos> listaProdutos = new ArrayList<>();
		
		//Produtos menu = new Produtos();

		 int op;

	        do {
	            System.out.println("\n\nO que deseja Efetuar?");
	            System.out.println("1 - Adicionar Produto");
	            System.out.println("2 - Alterar produto");
	            System.out.println("3 - Excluir produto");
	            System.out.println("4 - Listar todos produtos");
	            System.out.println("5 - Listar um produto");
	            System.out.println("6 - Sair");
	            System.out.print("Opção: ");
	            op = sc.nextInt();

	            switch (op) {
	                case 1:
	                    Produtos novoProduto = new Produtos();

	                    System.out.println("Insira o nome do produto a ser adicionado: ");
	                    novoProduto.setNome(sc.next());

	                    System.out.println("Insira a descrição do produto a ser adicionado: ");
	                    novoProduto.setDescricao(sc.next());

	                    System.out.println("Insira a categoria do produto a ser adicionado: ");
	                    novoProduto.setCategoria(sc.next());

	                    System.out.println("Insira o preço do produto a ser adicionado: ");
	                    while (!sc.hasNextDouble()) {
	                        System.out.println("Por favor, insira um preço válido: ");
	                        sc.next(); 
	                    }
	                    novoProduto.setPreco(sc.nextDouble());

	                    System.out.println("Insira o peso do produto a ser adicionado: ");
	                    while (!sc.hasNextDouble()) {
	                        System.out.println("Por favor, insira um peso válido: ");
	                        sc.next(); 
	                    }
	                    novoProduto.setPeso(sc.nextDouble());

	                    System.out.println("Insira o fabricante do produto a ser adicionado: ");
	                    novoProduto.setFabricante(sc.next());

	                    System.out.println("Insira o ID do produto a ser adicionado: ");
	                    novoProduto.setId(sc.nextInt());

	                    System.out.println("Insira o código de barras do produto a ser adicionado: ");
	                    novoProduto.setCodigoDeBarras(sc.next());

	                    System.out.println("Insira o SKU do produto a ser adicionado: ");
	                    novoProduto.setSku(sc.next());

	                    listaProdutos.add(novoProduto);

	                    System.out.println("Produto adicionado com sucesso!");
	                    break;

	                case 2:
	                    System.out.println("Insira o ID do produto a ser alterado: ");
	                    int idAlterar = sc.nextInt();

	                    for (Produtos produto : listaProdutos) {
	                        if (produto.getId() == idAlterar) {
	                            System.out.println("Insira o que deseja alterar no produto:");
	                            System.out.println("1 - Nome");
	                            System.out.println("2 - Descrição");
	                            System.out.println("3 - Categoria");
	                            System.out.println("4 - Preço");
	                            System.out.println("5 - Peso");
	                            System.out.println("6 - Fabricante");
	                            System.out.println("7 - Código de Barras");
	                            System.out.println("8 - SKU");
	                            System.out.print("Opção: ");
	                            int opcaoAlteracao = sc.nextInt();

	                            switch (opcaoAlteracao) {
	                                case 1:
	                                    System.out.println("Insira o novo nome: ");
	                                    produto.setNome(sc.next());
	                                    break;
	                                case 2:
	                                    System.out.println("Insira a nova descrição: ");
	                                    produto.setDescricao(sc.next());
	                                    break;
	                                case 3:
	                                    System.out.println("Insira a nova categoria: ");
	                                    produto.setCategoria(sc.next());
	                                    break;
	                                case 4:
	                                    System.out.println("Insira o novo preço: ");
	                                    while (!sc.hasNextDouble()) {
	                                        System.out.println("Por favor, insira um preço válido: ");
	                                        sc.next();
	                                    }
	                                    produto.setPreco(sc.nextDouble());
	                                    break;
	                                case 5:
	                                    System.out.println("Insira o novo peso: ");
	                                    while (!sc.hasNextDouble()) {
	                                        System.out.println("Por favor, insira um peso válido: ");
	                                        sc.next();
	                                    }
	                                    produto.setPeso(sc.nextDouble());
	                                    break;
	                                case 6:
	                                    System.out.println("Insira o novo fabricante: ");
	                                    produto.setFabricante(sc.next());
	                                    break;
	                                case 7:
	                                    System.out.println("Insira o novo código de barras: ");
	                                    produto.setCodigoDeBarras(sc.next());
	                                    break;
	                                case 8:
	                                    System.out.println("Insira o novo SKU: ");
	                                    produto.setSku(sc.next());
	                                    break;
	                                default:
	                                    System.out.println("Opção inválida!");
	                                    break;
	                            }
	                            System.out.println("Produto alterado com sucesso!");
	                            break;
	                        }
	                    }
	                    break;

	                case 3:
	                    System.out.println("Insira o ID do produto a ser excluído: ");
	                    int idExcluir = sc.nextInt();

	                    for (int i = 0; i < listaProdutos.size(); i++) {
	                        if (listaProdutos.get(i).getId() == idExcluir) {
	                            listaProdutos.remove(i);
	                            System.out.println("Produto removido com sucesso!");
	                            break;
	                        }
	                    }
	                    break;

	                case 4:
	                    System.out.println("Lista de todos os produtos: ");
	                    for (Produtos produto : listaProdutos) {
	                        System.out.println(produto.getNome() + " - " + produto.getId());
	                    }
	                    break;

	                case 5:
	                    System.out.println("Qual produto deseja que seja listado (insira o ID): ");
	                    int idListar = sc.nextInt();

	                    for (Produtos produto : listaProdutos) {
	                        if (produto.getId() == idListar) {
	                            System.out.println("Produto encontrado:");
	                            System.out.println("Nome: " + produto.getNome());
	                            System.out.println("Descrição: " + produto.getDescricao());
	                            System.out.println("Categoria: " + produto.getCategoria());
	                            System.out.println("Preço: R$ " + produto.getPreco());
	                            System.out.println("Peso: " + produto.getPeso() + " kg");
	                            System.out.println("Fabricante: " + produto.getFabricante());
	                            System.out.println("ID: " + produto.getId());
	                            System.out.println("Código de Barras: " + produto.getCodigoDeBarras());
	                            System.out.println("SKU: " + produto.getSku());
	                            
	                            break;
	                        }
	                    }
	                    break;

	                case 6:
	                    System.out.println("Saindo do programa...");
	                    break;

	                default:
	                    System.out.println("Opção inválida!");
	                    break;
	            }
	        } while (op != 6);
	    }
}
