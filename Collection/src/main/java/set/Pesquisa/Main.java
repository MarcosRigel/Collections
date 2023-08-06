package main.java.set.Pesquisa;

public class Main {
	
	public static void main(String[] args) {
		AgendaContatos agendaContatos = new AgendaContatos();
		
		agendaContatos.exibirContatos();
		
		agendaContatos.adicionarContato("Camila", 123456);
		agendaContatos.adicionarContato("Camila", 0);
		agendaContatos.adicionarContato("Camila Cavalcante", 11111111);
		agendaContatos.adicionarContato("Camila DIO", 654987);
		agendaContatos.adicionarContato("Maria Silva", 1111111);
		
		agendaContatos.exibirContatos();
		
		System.out.println(agendaContatos.pesquisarPorNome("Maria"));
		
		System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Maria Silva", 55555555));
		
		agendaContatos.exibirContatos();
	}

}
