package entregadores;

import java.util.Scanner;

public class FuncoesEntregadores {

	public static boolean login (String usuario, String senha) {
		if(usuario.equalsIgnoreCase("Admin") && senha.equalsIgnoreCase("123")) {
			return true;
		}
		return false;
	}
	
	public static void exibirMenu() {
		System.out.println("ESCOLHA UMA DAS OPÇÕES A BAIXO!");
		System.out.println("1 - Cadastrar entregador");
		System.out.println("2 - Alterar avaliação");
		System.out.println("3 - Exibir nome e telefone do entregador");
		System.out.println("4 - Sair do programa");
	}
	
	public static void cadastrarEntregador (String[] nomesEntregadores,String[] telefonesEntregadores, double[] avaliacoesEntregadores,String novoNome,String novoTelefone,double novaAvaliacao) {
		int i =0;
		while(nomesEntregadores[i] != null && i<nomesEntregadores.length) {
			i++;
		}
		if (i<nomesEntregadores.length) {
			nomesEntregadores[i] = novoNome;
			telefonesEntregadores[i] = novoTelefone;
			avaliacoesEntregadores[i] = novaAvaliacao;
		}
	}
	
	public static void alterarAvaliacao(String[] nomesEntregadores,double[] avaliacoesEntregadores, double novaAvaliacao) {
		Scanner leitor = new Scanner (System.in);
		System.out.println("Informe o nome do entregador que deseja alterar a avaliação:");
		String nomeEntregador = leitor.next();
		for (int i=0; i<nomesEntregadores.length; i++) {
			if (nomesEntregadores[i].equals(nomeEntregador)) {
					avaliacoesEntregadores[i] = novaAvaliacao;
					System.out.println("Avaliação alterada!");
			} else {
				System.out.println("Entregador não encontrado! Tente novamente.");
			}
		}
	}
	
	public static void melhorAvaliado (String[] nomesEntregadores, String[]telefonesEntregadores, double[] avaliacoesEntregadores) {
		double melhorAvaliacao =0;
		for (int i=0; i<avaliacoesEntregadores.length; i++) {
			if (avaliacoesEntregadores[i] > melhorAvaliacao) {
				melhorAvaliacao = avaliacoesEntregadores[i];
			}
		}
		for (int i=0; i<nomesEntregadores.length; i++) {
			if (melhorAvaliacao == avaliacoesEntregadores[i]) {
				System.out.println("O entregador melhor avaliado é o " + nomesEntregadores[i] + "e seu telefone: " + telefonesEntregadores[i]);
			}
		}
	}
}



