
public class Decoder {
	
	private String alphabet = "abcdefghijklmnopqrstuvwxyz ";
	private String rot13Alphabet = "nopqrstuvwxyzabcdefghijklm ";
	
	public String encrypt(String message) {
		String codedMessage = "";
		
		for (int i = 0; i < message.length(); i++) {
			codedMessage = codedMessage + rot13Alphabet.charAt(alphabet.indexOf(message.charAt(i)));
			
		}
		return codedMessage;	
	}
	
	public String decrypt(String codedMessage) {
		String decodedMessage = "";
		
		for (int i = 0; i < codedMessage.length(); i++) {
			decodedMessage = decodedMessage + alphabet.charAt(rot13Alphabet.indexOf(message.charAt(i)));
		}	
		return decodedMessage;	
	}
}
