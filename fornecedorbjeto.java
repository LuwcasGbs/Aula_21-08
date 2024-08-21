package Aula21_08;

public class fornecedorbjeto {

	public static void main(String[] args) {
		fornecedor fornecedor1 = new fornecedor();
		
		fornecedor1.setId(11);
		fornecedor1.setRazaosocial("Empresa legal");
		fornecedor1.setNomefantasia("Alguém");
		fornecedor1.setCnpj("77656435");
		fornecedor1.setEndereco("Rua Onde Judas Perdeu As Botas");
		fornecedor1.setFone("888-888-888-8");
		fornecedor1.setEmail("empresalegal@gmail.com");
		fornecedor1.setInscricaoestadual("Sla");
		
		System.out.println("-------------------------");
		System.out.println(fornecedor1.getId());
		System.out.println(fornecedor1.getRazaosocial());
		System.out.println(fornecedor1.getNomefantasia());
		System.out.println(fornecedor1.getCnpj());
		System.out.println(fornecedor1.getEndereco());
		System.out.println(fornecedor1.getFone());
		System.out.println(fornecedor1.getEmail());
		System.out.println(fornecedor1.getInscricaoestadual());
	}

}
