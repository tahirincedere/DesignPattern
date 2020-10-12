package SingletionPattern;

public class EagerInitialization {

	//Static Singletion program baþlar baþlamaz eager olarak INSTANCE'yükler
	private static EagerInitialization INSTANCE=new EagerInitialization();
	
	//private yapýyoruz nesne yaratýlmasýn diye ve bunu kýrarlarsa hata döndürüyor.
	private EagerInitialization() {
		throw new AssertionError();
	}
	
	//Dezavantaj:Bu nesneyi hiç kullanmýcaksak bile yer kaplýyor program baþlarken
	public EagerInitialization getInstance()
	{
		return this.INSTANCE;
	}
	
	public void singletionTest()
	{
		System.out.println("EagerInýtialization  Signletion çalýþtý");
	}
}
