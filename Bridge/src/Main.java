
public class Main {

	public static void main(String[] args) {
		
		CafeDaManha cafe = new CafeDaManha();
		Almoco almoco = new Almoco();
		LancheNoturno lanche = new LancheNoturno();
		
		Refeicao r1 = new Refeicao(cafe);
		Refeicao r2 = new Refeicao(almoco);
		Refeicao r3 = new Refeicao(lanche);
		
		System.out.println(r1.getIrefeicao().infoRefeicao());
		System.out.println(r2.getIrefeicao().infoRefeicao());
		System.out.println(r3.getIrefeicao().infoRefeicao());
	}
}



