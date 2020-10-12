package SingletionPattern;

public class LazyInitialization {

	
private static LazyInitialization INSTANCE;
	
	private LazyInitialization() {
		throw new AssertionError();
	}
	
	//Instance bu methodu cag�r�lsa yarat�l�r Kullan�laca�� zaman
	//1 Kez olu�turulur kontrol� sa�lan�r
	public static LazyInitialization getInstance()
	{
		if(INSTANCE==null)
            INSTANCE=new LazyInitialization();
		
		return INSTANCE;
	}

	
	public void singletionTest()
	{
		System.out.println("Lazy�nitialization Signletion �al��t�");
	}
}
