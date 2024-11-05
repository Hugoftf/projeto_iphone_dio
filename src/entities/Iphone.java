package entities;

public class Iphone implements NavegadorInternet, AparelhoTelefonico, ReprodutorMusical {

	@Override
	public void play() {
		System.out.println("A musica começou a tocar");
		
	}

	@Override
	public void pause() {
		System.out.println("A musica foi pausada");
		
	}

	@Override
	public void stop() {
		System.out.println("A musica foi parada");
		
	}

	@Override
	public void fazerChamada() {
		System.out.println("Fazendo uma chamada");
		
	}

	@Override
	public void receberChamada() {
		System.out.println("Recebendo a chamada");
		
	}

	@Override
	public void encerrarChamada() {
		System.out.println("Encerrar a chamada");
		
	}

	@Override
	public void exibirPagina() {
		System.out.println("Exebindo a imagem");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adcionando uma nova aba");
		
	}

	@Override
	public void recarregarPagina() {
		System.out.println("Recarregando a pagina");
		
	}

	
}
