package main;

import java.util.Scanner;

import source.Product;
import source.Tamanhos;

public class ActivityMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Product produto = new Product("camiseta","algodao", "escura");
	    Tamanhos tamanhos = new Tamanhos();	  
	    System.out.println("Por favor informe quantidade por tamanho");
	    
	    System.out.println("PP: ");
	    int pp = sc.nextInt();
	    tamanhos.setPP(pp);
	    System.out.println("P: ");
	    int p = sc.nextInt();
	    tamanhos.setP(p);
	    System.out.println("M: ");
	    int m = sc.nextInt();
	    tamanhos.setM(m);
	    System.out.println("G: ");
	    int g = sc.nextInt();
	    tamanhos.setG(g);
	    System.out.println("GG: ");
	    int gg = sc.nextInt();
	    tamanhos.setGg(gg);
	    System.out.println("EXG: ");
	    int exg = sc.nextInt();
	    tamanhos.setExg(exg);
	    System.out.println("Favor informe o peso total da malha: ");
	    double peso = sc.nextDouble();	    
		produto.rendimento(produto.setPeso(peso), tamanhos.totalQuantity());
		
		System.out.println(produto);
		sc.close();
	}

}
