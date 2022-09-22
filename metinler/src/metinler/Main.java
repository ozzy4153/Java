package metinler;

public class Main {

	public static void main(String[] args) {
		
		char harf ='F';
		switch (harf) {
		case 'A':
		case 'U':
		case 'O':
		case 'I':
			System.out.println("Kalın harftir");
			break;
		
		case 'E':
		case 'İ':
		case 'Ö':
		case 'Ü':
			System.out.println("İnce harftir");
			break;
			
		default:
			System.out.println("sessiz harftir");
		}
			
		}
	}

