package entregadores;

import java.util.Scanner;

public class SistemaEntregadores {
	public static final int QUANTIDADE_ENTREGADORES = 2;
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String[] nomesEntregadores = new String[QUANTIDADE_ENTREGADORES];
		String[] telefonesEntregadores = new String[QUANTIDADE_ENTREGADORES];
		double[] avaliacoesEntregadores = new double[QUANTIDADE_ENTREGADORES];
		int opcao = 0;
		String usuario, senha;
		System.out.println("Bem vindo ao Ssitema de Entregadores!!");
		System.out.println("Usuário: ");
		usuario = leitor.next();
		System.out.println("Senha: ");
		senha = leitor.next();

		if(FuncoesEntregadores.login(usuario, senha)){
			System.out.println("Login bem sucedido!");
		}else {
			System.out.println("Usuário ou senha incorretos.");
			System.exit(1);
		}
		
		
		while(opcao!=4) {
			FuncoesEntregadores.exibirMenu();
			opcao = leitor.nextInt();
			
			switch(opcao) {
			case 1:
				for (int i=0; i<nomesEntregadores.length; i++) {
				System.out.println("Digite o nome do " + (i+1) + "º Entregador!");
				String novoNome = leitor.next();
				System.out.println("Informe o telefone: ");
				String novoTelefone = leitor.next();
				System.out.println("Qual foi a sua avaliação? ");
				double novaAvaliacao = leitor.nextDouble();	
				FuncoesEntregadores.cadastrarEntregador(nomesEntregadores, telefonesEntregadores, avaliacoesEntregadores, novoNome, novoTelefone, novaAvaliacao);
				}
				break;
				
			case 2:
				System.out.println("Informe a nova avaliação: ");
				double novaAvaliacao = leitor.nextDouble();
				FuncoesEntregadores.alterarAvaliacao(nomesEntregadores, avaliacoesEntregadores, novaAvaliacao);
				break;
			case 3:
				FuncoesEntregadores.melhorAvaliado(nomesEntregadores, telefonesEntregadores, avaliacoesEntregadores);
				break;
			case 4:
				System.out.println("Encerrando o sistema!");
				break;	
			default:
				System.out.println("Ops! A opção não existe, tente novamente.");
				break;
				
			}
		}
	}

}
