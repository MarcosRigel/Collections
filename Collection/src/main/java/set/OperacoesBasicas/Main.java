package main.java.set.OperacoesBasicas;

public class Main {

	public static void main(String[] args) {
		
		ConjuntosConvidados conjuntoConvidados = new ConjuntosConvidados();
		System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");
		
		conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
		conjuntoConvidados.adicionarConvidado("Convidado 2", 1235);
		conjuntoConvidados.adicionarConvidado("Convidado 3", 1235);
		conjuntoConvidados.adicionarConvidado("Convidado 4", 1236);
		
		System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");
	
		conjuntoConvidados.removerConvidadoPorCodigoConvite(1236);
		System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dento do Set de Convidados");
		
		conjuntoConvidados.exibirConvidados();
	}

}
