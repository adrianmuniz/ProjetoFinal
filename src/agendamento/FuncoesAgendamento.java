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
	

}
