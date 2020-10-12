package SingletionPattern;

public class BillPughSingletion {
	
	private BillPughSingletion() {

	}
	
	public static BillPughSingletion getInstance()
	
	{
		return SingletionHelper.INSTANNCE;
	}
	
	private static class SingletionHelper{
		
		private static final BillPughSingletion INSTANNCE=new BillPughSingletion();
	}

}
