package SingletionPattern;

public class ThreadSafeInitialization {

	//Lazy�nitialization instance static methodda yarat�l�r ve tekrar olu�turulamaz bo� ise olu�turulur
	
private static ThreadSafeInitialization INSTANCE;
	
	private ThreadSafeInitialization() {
		throw new AssertionError();
	}
	
	//MultiThread i�in sychronized kullan�r�z tek bir threadda i�leme
	//Dezavantaj:Her seferinde bunu checking yaparken bir maaliyet zaman ��k�yor.
	public static  synchronized ThreadSafeInitialization getInstance()
	{
		if(INSTANCE==null)
            INSTANCE=new ThreadSafeInitialization();
		
		return INSTANCE;
	}
	public void singletionTest()
	{
		System.out.println("ThreadSafe Signletion �al��t�");
	}
}
