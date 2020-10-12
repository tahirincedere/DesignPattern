package SingletionPattern;

public class LazyInitialization {

	
private static LazyInitialization INSTANCE;
	
	private LazyInitialization() {
		throw new AssertionError();
	}
	
	//Instance bu methodu cagýrýlsa yaratýlýr Kullanýlacaðý zaman
	//1 Kez oluþturulur kontrolü saðlanýr
	public static LazyInitialization getInstance()
	{
		if(INSTANCE==null)
            INSTANCE=new LazyInitialization();
		
		return INSTANCE;
	}

	
	public void singletionTest()
	{
		System.out.println("LazyÝnitialization Signletion çalýþtý");
	}
}
