package FacadePattern;

public class SHAEncrypt {

	public void encrypt(String text,String key,boolean type)
	{
		if(type)
			System.out.println("<SHA> "+key + text + "</SHA>");
		else
			System.out.println("<SHA> "+text + key + "</SHA>");
	}
}
