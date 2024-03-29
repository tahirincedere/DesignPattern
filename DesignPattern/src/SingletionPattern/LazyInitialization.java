package SingletionPattern;

public class LazyInitialization {

	
private static LazyInitialization INSTANCE;
	
	private LazyInitialization() {
		throw new AssertionError();
	}
	
	//Instance bu methodu cagırılsa yaratılır Kullanılacağı zaman
	//1 Kez oluşturulur kontrolü sağlanır
	public static LazyInitialization getInstance()
	{
		if(INSTANCE==null)
            INSTANCE=new LazyInitialization();
		
		return INSTANCE;
	}

	
	public void singletionTest()
	{
		System.out.println("Lazyİnitialization Signletion çalıştı");
	}
}
