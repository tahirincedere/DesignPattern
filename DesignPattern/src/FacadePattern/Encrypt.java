package FacadePattern;

public class Encrypt {
	
	public enum EncType{AES,SHA,MD5}
	
	private AESencryptor aeSencryptor=new AESencryptor();
	private MD5Encryptor md5Encryptor=new MD5Encryptor();
	private SHAEncrypt shaEncrypt=new SHAEncrypt();
	public void encrypt(String text,EncType encType)
	{
		switch (encType) {
		case AES: aeSencryptor.encrypt(text); break;
		case SHA:shaEncrypt.encrypt(text, "KEY", true);break;
		case MD5:md5Encryptor.encrypt(text, "KEY");break;
		default:System.out.println("you select the EncType");
			
			
		
		
		
		}
		
	}
	

}
