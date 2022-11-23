import java.util.ArrayList;
import java.util.Scanner;
public class Sessão {

	public static void main(String[] args) {
		Filme filme1= new Filme("Harry Potter e a pedra filosofal","Chris Columbus", "Harry Potter é um garoto órfão que vive infeliz com seus tios, os Dursleys. Ele recebe uma carta contendo um convite para ingressar em Hogwarts, uma famosa escola especializada em formar jovens bruxos. Inicialmente, Harry é impedido de ler a carta por seu tio, mas logo recebe a visita de Hagrid, o guarda-caça de Hogwarts, que chega para levá-lo até a escola. Harry adentra um mundo mágico que jamais imaginara, vivendo diversas aventuras com seus novos amigos, Rony Weasley e Hermione Granger.", "Fantasia/Aventura", "2h 32m");
		Filme filme2= new Filme ("Harry Potter e a câmera secreta", "Chris Columbus", "Após as sofríveis férias na casa dos tios, Harry Potter se prepara para voltar a Hogwarts e começar seu segundo ano na escola de bruxos. Na véspera do início das aulas, a estranha criatura Dobby aparece em seu quarto e o avisa de que voltar é um erro e que algo muito ruim pode acontecer se Harry insistir em continuar os estudos de bruxaria. O garoto, no entanto, está disposto a correr o risco e se livrar do lar problemático.", "Fantasia/Aventura", "2h 41m");
		ArrayList<Filme> filme = new ArrayList<Filme>();
		filme.add(filme1);
		filme.add(filme2); 
				
		
		MenuController interacao= new MenuController(0);
		Ingresso ingresso= new Ingresso("","","");
		interacao.setMeia(12);
		interacao.setInteira(24);
		int total=0;
		int contador = 0;
		int soma;
		Scanner leitor = new Scanner(System.in);
		while(contador!= 4) {
			System.out.println("1- Harry Potter e a pedra filosofal\n2- Harry Potter e a câmera secreta");
			interacao.setPreferencia(leitor.nextInt());
			interacao.setPreferencia(interacao.getPreferencia()-1);
			ingresso.setFilme(filme.get(interacao.getPreferencia()).getNomeDoFilme()+"\n"+filme.get(interacao.getPreferencia()).getDiretor()+"\n"+filme.get(interacao.getPreferencia()).getDescricao()+"\n"+ filme.get(interacao.getPreferencia()).getGenero()+"\n"+filme.get(interacao.getPreferencia()).getDuracaoDoFilme());
			
			System.out.println(filme.get(interacao.getPreferencia()).getNomeDoFilme());
			
			System.out.println("1 sessão = 14h versão dublada\n2 Sessão = 18h versão legendada");
			interacao.setPreferencia(leitor.nextInt());
			if (interacao.getPreferencia()==1) {
				ingresso.setHorarioDaSessao("14h versão dublada");
			}
			
			if (interacao.getPreferencia()==2) {
				ingresso.setHorarioDaSessao("18h versão legendada");
			}
			System.out.println("Inteira = 32");
			soma = leitor.nextInt();
			
			if (soma>0) {
				ingresso.setTipoDeIngresso("inteira");
			}
			total= soma*interacao.getInteira();
			
			System.out.println("Meia = 16");
			soma = leitor.nextInt();
			
			if (soma>0) {
				if (total>0) {
					ingresso.setTipoDeIngresso(ingresso.getTipoDeIngresso()+" e meia");
				}
				else {
					ingresso.setTipoDeIngresso("meia");
				}
			}
			
			total+= soma*interacao.getMeia();
			
			System.out.println(ingresso.getFilme()+"\n"+ingresso.getHorarioDaSessao()+"\n"+ ingresso.getTipoDeIngresso()+" = "+ total);
			total= 0;
			
			System.out.println("Quer continuar comprando ingresso? 1 = sim e 2 = não");
			contador = leitor.nextInt();
			
			if (contador==2) {
				System.out.println("Obrigado pela sua escolha e tenha um bom filme");
				break;
			
		}
	}

}}
