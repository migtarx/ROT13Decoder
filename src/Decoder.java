
public class Decoder {
	
	private String alphabet = "abcdefghijklmnopqrstuvwxyz ";
	private String rot13Alphabet = "nopqrstuvwxyzabcdefghijklm ";
	
	public String encrypt(String message) {
		String codedMessage = "";
		
		for (int i = 0; i < message.length(); i++) {
			for (int j = 0; j < alphabet.length(); j++) {
				if (message.charAt(i) == alphabet.charAt(j)) {
					codedMessage = codedMessage + rot13Alphabet.charAt(j);
				}
			}
		}
		return codedMessage;		
	}
	
	public String decrypt(String codedMessage) {
		String decodedMessage = "";
		
		for (int i = 0; i < codedMessage.length(); i++) {
			for (int j = 0; j < rot13Alphabet.length(); j++) {
				if (codedMessage.charAt(i) == rot13Alphabet.charAt(j)) {
					decodedMessage = decodedMessage + alphabet.charAt(j);
				}
			}
		}	
		return decodedMessage;	
	}
}
