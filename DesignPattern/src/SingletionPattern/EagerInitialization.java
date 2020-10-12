package SingletionPattern;

public class EagerInitialization {

	//Static Singletion program ba�lar ba�lamaz eager olarak INSTANCE'y�kler
	private static EagerInitialization INSTANCE=new EagerInitialization();
	
	//private yap�yoruz nesne yarat�lmas�n diye ve bunu k�rarlarsa hata d�nd�r�yor.
	private EagerInitialization() {
		throw new AssertionError();
	}
	
	//Dezavantaj:Bu nesneyi hi� kullanm�caksak bile yer kapl�yor program ba�larken
	public EagerInitialization getInstance()
	{
		return this.INSTANCE;
	}
	
	public void singletionTest()
	{
		System.out.println("EagerIn�tialization  Signletion �al��t�");
	}
}
