package arkadas_sayilar;

public class Main {

	public static void main(String[] args) {
		int number1=220;
		int number2=284;
		int toplam1 =0;	
		int toplam2=0;
		for (int i=1;i<number1-1;i++) {
			if(number1 %i ==0) { toplam1= toplam1+i;
				
			}
		}
		for (int j=1;j<number2-1;j++) {
			if(number2 %j ==0) { toplam2= toplam2+j;
				
			}
			
		}
		if (toplam1==number2 &&toplam2==number1 ) {
			System.out.println("bu sayılar arkadaştır");
			}else {System.out.println("bu sayılar arkadaş değildir");}
	}

}
