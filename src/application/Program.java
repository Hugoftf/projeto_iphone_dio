package application;

import java.util.Scanner;

import entities.Iphone;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Iphone iphone = new Iphone();
		
		System.out.println("Meu novo iphone");
		
		System.out.println("Vou testar meu reprodutor musical");
		System.out.println("Vou tocar uma musica");
		iphone.play();
		System.out.println("Vou pausar a musica");
		iphone.pause();
		System.out.println("Vou parar a música");
		iphone.stop();
		
		System.out.println("Agora vou testar o meu aparelho telefonico");
		System.out.println("Vou fazer uma chamda");
		iphone.fazerChamada();
		System.out.println("Vou encerrar a chamada");
		iphone.encerrarChamada();
		System.out.println("Estou recebendo uma chamada");
		iphone.receberChamada();
		
		System.out.println("E por ultimo eu vou navegar pela internet");
		iphone.exibirPagina();
		System.out.println("Vou abrir uma nova aba");
		iphone.adicionarNovaAba();
		System.out.println("Vou recarregar a aba");
		iphone.recarregarPagina();
		
		
		
		sc.close();
		
	}
}
