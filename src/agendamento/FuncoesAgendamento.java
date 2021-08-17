package agendamento;

public class FuncoesAgendamento {

	public static boolean login (String usuario, String senha) {
		if(usuario.equalsIgnoreCase("Admin") && senha.equalsIgnoreCase("123")) {
			return true;
		}
		return false;
	}
	
	public static void exibirMenu() {
		System.out.println("ESCOLHA UMA DAS OPÇÕES A BAIXO!");
		System.out.println("1 - Adicionar horários disponiveis");
		System.out.println("2 - Agendar horário");
		System.out.println("3 - Exibir agenda completa");
		System.out.println("4 - Sair do programa");
	}
	
	public static void inserirHorario (String[] agendamentos, String horarioDigitado) {
		int i=0;
		while (agendamentos[i] != null && i<agendamentos.length) {
			i++;
		}
		if (i<agendamentos.length) {
			agendamentos[i] = horarioDigitado;
		}
	}
	
	public static boolean verificarDisponibilidade(String[] agendamentos, String horarioDesejado) {
		for (int i=0; i<agendamentos.length; i++) {
			if (horarioDesejado.equals(agendamentos[i])) {
				return true;
			}
		}
		return false;
	}

	public static void agendar (String[] agendamentos, String horarioDesejado, String nomeCliente) {
		for (int i=0; i<agendamentos.length; i++) {
			if (horarioDesejado.equals(agendamentos[i])) {
				agendamentos[i] = horarioDesejado + nomeCliente;
				System.out.println("Horario agendado as " + horarioDesejado + " para " + nomeCliente);
			}
		}
	}
	
}
