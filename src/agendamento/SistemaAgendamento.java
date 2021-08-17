package agendamento;

import java.util.Scanner;

public class SistemaAgendamento {
	public static final int QUANTIDADE_AGENDAMENTOS = 10;
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String[] agendamentos = new String[QUANTIDADE_AGENDAMENTOS];
		int opcao = 0;
		String usuario, senha;
		System.out.println("Para entrar no sistema você deve informar seu usuário e sua senha");
		System.out.println("Usuário:");
		usuario = leitor.next();
		System.out.println("Senha: ");
		senha = leitor.next();

		if(FuncoesAgendamento.login(usuario, senha)){
			System.out.println("Login bem sucedido!");
		}else {
			System.out.println("Usuário ou senha incorretos.");
			System.exit(1);
		}
		
		
		while(opcao!=4) {
			FuncoesAgendamento.exibirMenu();
			opcao = leitor.nextInt();
			
			switch(opcao) {
			case 1:
				for (int i=0; i<agendamentos.length; i++) {
				System.out.println("Digite o " + (i+1) + "° horário disponivel:");
				String horarioDigitado = leitor.next();
				FuncoesAgendamento.inserirHorario(agendamentos, horarioDigitado);
				}
				break;
				
			case 2:
				System.out.println("Informe o horário que deseja agendar:");
				String horarioDesejado = leitor.next();
				if (FuncoesAgendamento.verificarDisponibilidade(agendamentos, horarioDesejado)) {
					System.out.println("Nome:");
					String nomeCliente = leitor.next();
					FuncoesAgendamento.agendar(agendamentos,horarioDesejado, nomeCliente);
				}
				break;
			case 3:
				FuncoesAgendamento.exibirAgenda(agendamentos);
				break;
			
			case 4:
				System.out.println("Sistema encerrado");
				break;
			default:
				System.out.println("Ops! Opção inválida, tente novamente.");
				break;
				
			}
		}
	}
}
