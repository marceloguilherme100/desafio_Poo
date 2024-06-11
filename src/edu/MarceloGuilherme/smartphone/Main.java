package edu.MarceloGuilherme.smartphone;

import edu.MarceloGuilherme.smartphone.aplicativos.Aparelho_Telefonico;
import edu.MarceloGuilherme.smartphone.aplicativos.Reprodutor_Musical;

public class Main {
	public static void main(String[] args) {
		
		IPhone iphone = new IPhone();
		// Reprodutor Musical
		iphone.tocar();
		iphone.pausar();
		iphone.selecionarMusica();
		
		// Navegador Internet
		iphone.exibirPagina();
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
		
		// Aparelho Telefonico
		iphone.ligar();
		iphone.atender();
		iphone.correioDeVoz();
	}
}
