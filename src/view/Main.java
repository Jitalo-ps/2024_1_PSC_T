/*package view;

import javax.swing.JOptionPane;

import model.Categoria;

//import javax.swing.JOptionPane;

import model.Cidade;
import model.Cliente;
import model.ClienteFisico;
import model.ClienteJuridico;
import model.Pedido;
import model.Produto;

public class Main{
    public static void main(String[] args) throws Exception {
        System.out.println("Projeto Loja!");

        Cidade c1 = new Cidade();
        Cidade c2 = new Cidade ("Porto Alegre");
        Cidade c3 = new Cidade( 1, "Rio de Janeiro");

       // System.out.println("Cidade c1: " + c1.nome );
       // System.out.println("Cidade c2: id - " + c2.id + " - " + c2.nome );
        //System.out.println("Cidade c3: id - " + c3.id + " - " + c3.nome );
        
        Cliente cli01 = new Cliente();
        cli01.nome = "João";
       // cli01.altura = 1.75;
        //cli01.casado = true;
        cli01.cidade = c2;

        Cliente cli02 = new Cliente("Maria");
        //cli02.altura = 1.80;
       // cli02.casado = false;
        cli02.cidade = c3;

        Cliente cli03 = new Cliente(0, "José", "Rua A, nº 100", c3);

        Cliente cli04 = new Cliente(2, "Carlos", "Rua B, nº 200", new Cidade("Tangamandápio")); 

        cli03.cidade = cli04.cidade;
        //String texto = "Nome do cliente: " + cli04.nome + "\nCidade: " + cli04.cidade.nome + "\nCasado: " + cli04.casado + "\nAltura:" + cli04.altura;

        System.out.println( cli04 );
        //JOptionPane.showMessageDialog(null, cli04);
        System.out.println("-------------------");
        System.out.println(c3);

        Cidade[] cidades = {c1, c2, c3};
        for (Cidade cid: cidades ){
            System.out.println("----------------");
            System.out.println(cid.nome);
        }

        System.out.println("--23/04/2023--------------");
        System.out.println( "Nome da cidade: " + c3.nome );
        System.out.println("------------------------");
        System.out.println( c3 );

        ClienteFisico pf1 = new ClienteFisico();
        pf1.nome = "Adalto";
        pf1.cidade = c2;
        System.out.println( "Nome do cliente pf1: " + pf1.nome);

    ClienteFisico pf2 = new ClienteFisico("Luis", "000.111.222.33");
    System.out.println( "Nome do cliente pf2: " + pf2.nome);

    System.out.println("-----------pf3------------");
    ClienteFisico pf3 = new ClienteFisico(1, "Juan", "Rua B n 200", c3,  "999.111.222.33", 1.75, true);

    System.out.println("-----------pj1------------");
    ClienteJuridico pj1 = new ClienteJuridico ();
    pj1.nome = "Mercearia do Seu Manuel";
    pj1.cnpj = "00.111.222/0001-33";
    pj1.cidade = c2;
    pj1.endereco = "Rua C, nº 300";
    //System.out.println( pj1 );
    //JOptionPane.showMessageDialog(null, pj1);



    //30/04/2024 -------------

    Categoria cat01 = new Categoria(1, "Bebidas");
    Categoria cat02 = new Categoria(2, "Alimentos");

    Produto prod01 = new Produto("Coca-cola");
    prod01.preco = 8.99;
    prod01.quantidade = 100;
    prod01.categoria = cat01;
    Produto prod02 = new Produto("Pepsi");
    prod02.preco = 7.65;
    prod02.quantidade = 50;
    prod02.categoria = cat01;
    Produto prod03 = new Produto("Arroz");
    prod03.preco = 4.99;
    prod03.quantidade = 80;
    prod03.categoria = cat02;
    //Produto prod2 = new Produto("Pepsi", 7.65, 50, cat01);
    //Produto prod3 = new Produto("Arroz", 4.99, 80, cat02);

    Pedido ped01 = new Pedido("Rua A, N° 150", pf1);
    System.out.println( "\n----30/04/2024---------");
    ped01.imprimirPedido();

    ped01.addProduto( prod01 );
    ped01.addProduto( prod02, prod03 );

    //Produto[] lista = {prod01,prod02};
    //ped01.addProduto( new Produto[] {prod01, prod02, prod03} );

    

    System.out.println("-----------Modificadores e acessores---------------");
    ped01.imprimirPedido();
   // ped01.totalPedido = -1000;
   ped01.setTotalPedido(10);
    System.out.println("\n----------------\nTaxa de entrega: " + Pedido.TAXA_DE_ENTREGA);



    }
}*/
