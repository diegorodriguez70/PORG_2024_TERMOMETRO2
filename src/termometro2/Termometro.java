package termometro2;

import java.util.Arrays;

public class Termometro {

	private float termometro[];
	private int contador;
	private int posicionTemp[];
	private int diasSemana;

	public Termometro() {
		termometro = new float[7];
		contador = 0;
		posicionTemp = new int[7];
		//posicionTemp=(Integer) null;

	}

	public void addTermometro(float temperatura) {
		if (contador >= termometro.length) {
			contador = 0;
		}
		termometro[contador] = temperatura;
		contador++;

	}

	public void buscarTemp(int temperatura, char dia) {
		dia = queDia(dia);
		int j=0;
		for (int i=0; i<termometro.length;i++) {
			if (termometro[i]==temperatura) {
				posicionTemp[j]=i;
				j++;
			}
			if (i==(dia)) {
				diasSemana=(int) termometro[i];
			}
		}
		
	}

	private char queDia(char dia) {
		if (dia == 'L') {
			dia=0;
		}
		 if(dia=='M') {
			dia=1;
		}
		 if (dia=='X') {
			dia=2;
		}
		 if (dia=='J') {
			dia=3;
		}
		 if(dia=='V') {
			dia=4;
		}
		if (dia=='S') {
			dia=5;
		}
		if(dia=='D') {
			dia=6;
		}
		return dia;
	}
	
//	public void tempDia(int dia) {
//		for (int i=0;i<termometro.length;i++) {
//			if (i==(dia-1)) {
//				diasSemana=(int) termometro[i];
//			}
//		}
//	}

	public String toString() {
		return "Termometro [termometro=" + Arrays.toString(termometro) +
				"\n\n La Temperatura que has buscado está en la posicion --->"+
				Arrays.toString(posicionTemp)+" del vector\n (Los 0 equivalen a que no está ahi esa temperatura, a no ser de que tengamos un 0 en la primera posicion y luego mas valores que no sean 0))"+
				"\n\n El dia que me has preguntado hubo una temperatura de --->"+diasSemana+" grados";
	}

}
