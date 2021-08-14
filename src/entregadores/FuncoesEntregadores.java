package entregadores;

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
		for (int i=0; i<nomesEntregadores.length; i++) {
		nomesEntregadores[i] = novoNome;
		telefonesEntregadores[i] = novoTelefone;
		avaliacoesEntregadores[i] = novaAvaliacao; 
		}
	}
	
}
