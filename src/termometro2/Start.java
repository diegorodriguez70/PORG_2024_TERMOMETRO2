package termometro2;

public class Start {

	public static void main(String[] args) {
		Termometro termometro = new Termometro();
		termometro.addTermometro(1);
		termometro.addTermometro(7);
		termometro.addTermometro(3);
		termometro.addTermometro(7);
		termometro.addTermometro(6);
		termometro.addTermometro(6);
		termometro.addTermometro(7);
		termometro.addTermometro(3);
		
		termometro.buscarTemp(7, 'V');
		System.out.println(termometro);
		
	}

}
