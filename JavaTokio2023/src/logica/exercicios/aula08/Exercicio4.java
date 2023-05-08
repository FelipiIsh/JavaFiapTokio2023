package logica.exercicios.aula08;

public class Exercicio4 {

	public static void main(String[] args) {

		double PI = Math.PI;
		
		int x = (int) Math.sqrt(81);
				
		int z = (int) Math.cbrt(8);
		
		Double y = (Double) ((5*x + 2*(Math.pow(x,2)) + z - PI * x) / ((Math.pow(3,4)) + x));
		
		System.out.println(y);
		
		
		
	}

}
