package AhorcadoTDD;

import java.io.IOException;

public class Principal {

	public static void main(String[] args) {
		
		Bienvenida b = new Bienvenida();
		b.bienvenida();
		
		boolean r;
		char ch;
		
		System.out.print("Enter a character: ");

		try {
		   ch = (char) System.in.read();	
		   r=b.esEnter(ch);
		   System.out.print(r);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
