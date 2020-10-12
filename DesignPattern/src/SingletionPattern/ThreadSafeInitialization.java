package SingletionPattern;

public class ThreadSafeInitialization {

	//LazyÝnitialization instance static methodda yaratýlýr ve tekrar oluþturulamaz boþ ise oluþturulur
	
private static ThreadSafeInitialization INSTANCE;
	
	private ThreadSafeInitialization() {
		throw new AssertionError();
	}
	
	//MultiThread için sychronized kullanýrýz tek bir threadda iþleme
	//Dezavantaj:Her seferinde bunu checking yaparken bir maaliyet zaman çýkýyor.
	public static  synchronized ThreadSafeInitialization getInstance()
	{
		if(INSTANCE==null)
            INSTANCE=new ThreadSafeInitialization();
		
		return INSTANCE;
	}
	public void singletionTest()
	{
		System.out.println("ThreadSafe Signletion çalýþtý");
	}
}
