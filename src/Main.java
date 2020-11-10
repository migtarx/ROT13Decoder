import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Decoder decode = new Decoder();
		Scanner scan = new Scanner(System.in);
		String normalMessage, encryptedMessage;
		String option;
		System.out.println("  _____   ____ _______ __ ____      _____  ______ _____ ____  _____  ______ _____  ");
		System.out.println(" |  __ \\ / __ \\__   __/_ |___ \\    |  __ \\|  ____/ ____/ __ \\|  __ \\|  ____|  __ \\ ");
		System.out.println(" | |__) | |  | | | |   | | __) |   | |  | | |__ | |   | |  | | |  | | |__  | |__) |");
		System.out.println(" |  _  /| |  | | | |   | ||__ <    | |  | |  __|| |   | |  | | |  | |  __| |  _  / ");
		System.out.println(" | | \\ \\| |__| | | |   | |___) |   | |__| | |___| |___| |__| | |__| | |____| | \\ \\ ");
		System.out.println(" |_|  \\_\\\\____/  |_|   |_|____/    |_____/|______\\_____\\____/|_____/|______|_|  \\_\\");
		System.out.println();
		
		do {
			System.out.println("What do you want to do: ");
			System.out.println("1.- Encrypt");
			System.out.println("2.- Decrypt");
			System.out.println("3.- Exit");
			System.out.print("Your option(1/2/3): ");
			option = scan.nextLine();
			
			switch (option) {
			case "1":
				System.out.print("Enter your normal message: ");
				normalMessage = scan.nextLine();
				System.out.println();
				System.out.println("==============================================================");
				System.out.println("Your coded message is: " + decode.encrypt(normalMessage));
				System.out.println("==============================================================");
				System.out.println();
				break;
			case "2":
				System.out.print("Enter your ROT13 coded message: ");
				encryptedMessage = scan.nextLine();
				System.out.println();
				System.out.println("==============================================================");
				System.out.println("Your decoded message is:" + decode.decrypt(encryptedMessage));
				System.out.println("==============================================================");
				System.out.println();
				break;
			case "3":
				System.exit(0);
				break;

			default:
				System.out.println("Invalid value");
				break;
			}
		} while (!option.equals("3"));
	}
}
