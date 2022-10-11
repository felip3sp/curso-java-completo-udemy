package controle;

public class DesafioFor {

	public static void main(String[] args) {
		
		String valor = "#";
		for(char i = 'a'; i <= 'e'; i++) {
			System.out.println(valor);
			valor += "#";
		}
		
		for(String v = "#"; !v.equals("######"); v += "#") {
			System.out.println(v);
		}
	}
}
