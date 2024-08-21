package Aula21_08;

public class usuariobjeto {

	public static void main(String[] args) {
		usuario usuario1 = new usuario();
		usuario usuario2 = new usuario();
		
		usuario1.setId(01);
		usuario1.setNome("Lusca");
		usuario1.setPermissao("não tem permissão pra nada");
		usuario1.setSenha("62tyuhjdg8e");
		usuario1.setUsuario("Visitante");

		usuario2.setId(88);
		usuario2.setNome("Gertrudes");
		usuario2.setPermissao("tem permissão pra tudo");
		usuario2.setSenha("09u987ygvh2");
		usuario2.setUsuario("Administrador");
		
		System.out.println("-------------PESSOA1-------------");
		System.out.println(usuario1.getId());
		System.out.println(usuario1.getNome());
		System.out.println(usuario1.getPermissao());
		System.out.println(usuario1.getSenha());
		System.out.println(usuario1.getUsuario());
		
		System.out.println("-------------PESSOA2-------------");
		System.out.println(usuario2.getId());
		System.out.println(usuario2.getNome());
		System.out.println(usuario2.getPermissao());
		System.out.println(usuario2.getSenha());
		System.out.println(usuario2.getUsuario());
	}

}
