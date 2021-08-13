package entregadores;

public class FuncoesEntregadores {

	public static boolean login (String usuario, String senha) {
		if(usuario.equalsIgnoreCase("Admin") && senha.equalsIgnoreCase("123")) {
			return true;
		}
		return false;
	}
}
