package FacadePattern;

import FacadePattern.Encrypt.EncType;

public class Main {

	public static void main(String[] args) {
		
		Encrypt encrypt=new Encrypt();
		encrypt.encrypt("Tahir", EncType.SHA);
		

	}

}
