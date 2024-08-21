package Aula21_08;

public class pcbjeto {

	public static void main(String[] args) {
		pc pc1 = new pc();
		pc pc2 = new pc();
		pc pc3 = new pc();
		
		pc1.setObjeto("Mouse");
		pc1.setMarca("ASUS");
		pc1.setModelo("Óptico");
		pc1.setCor("Preto");
		pc1.setPreco("R$90,00");

		pc2.setObjeto("Teclado");
		pc2.setMarca("Redragon Mitra Switch");
		pc2.setModelo("Mecânico");
		pc2.setCor("Preto");
		pc2.setPreco("R$200,00");
		
		pc3.setObjeto("Monitor");
		pc3.setMarca("Dell");
		pc3.setModelo("Touch Screen");
		pc3.setCor("Preto");
		pc3.setPreco("R$1500,00");
		
		System.out.println("---------------PARTE1---------------");
		System.out.println(pc1.getObjeto());
		System.out.println(pc1.getMarca());
		System.out.println(pc1.getModelo());
		System.out.println(pc1.getCor());
		System.out.println(pc1.getPreco());
		System.out.println(pc1.ligar());
		System.out.println(pc1.desligar());
		System.out.println(pc1.clicar());
		
		System.out.println("---------------PARTE2---------------");
		System.out.println(pc2.getObjeto());
		System.out.println(pc2.getMarca());
		System.out.println(pc2.getModelo());
		System.out.println(pc2.getCor());
		System.out.println(pc2.getPreco());
		System.out.println(pc2.ligar());
		System.out.println(pc2.desligar());
		System.out.println(pc2.clicar());
		
		System.out.println("---------------PARTE3---------------");
		System.out.println(pc3.getObjeto());
		System.out.println(pc3.getMarca());
		System.out.println(pc3.getModelo());
		System.out.println(pc3.getCor());
		System.out.println(pc3.getPreco());
		System.out.println(pc3.ligar());
		System.out.println(pc3.desligar());
		System.out.println(pc3.clicar());
		System.out.println("-----------------------------------");
	}

}
