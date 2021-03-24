package file_operation;
import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		int sorgu;
		do {
			System.out.print("0.exit \n 1.Veri Giriþi \n 2. Veri okuma \n tercih=" );
			Scanner scan=new Scanner(System.in);
			 sorgu=scan.nextInt();
			if(sorgu==1) {
CreateTextFile ornek=new CreateTextFile();
ornek.openFile();
ornek.addAccount();
ornek.closeFÝle();
		}
		else if(sorgu==2) {
			ReadTextFÝle ornek1=new ReadTextFÝle();
		ornek1.openFile();
		ornek1.ReadAccount();
		ornek1.closeFÝle();
		
		}	
		}while(sorgu!=0);
	}
}	
