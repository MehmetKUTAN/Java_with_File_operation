package file_operation;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class ReadTextFİle {
	private Scanner input;
	public void openFile() {
		try {
			input=new Scanner( new File ("client.txt"));
		} catch (FileNotFoundException fileNotFoundException) {
			// TODO Auto-generated catch block
			System.err.println("Dosya a�ma hatas�");
			System.exit(1);	
		}
		catch (SecurityException e) {
			// TODO Auto-generated catch block
			System.err.println("Dosyaya yazma yetkiniz yoktur");
			System.exit(1);
		}
	}
	public void ReadAccount() {
		account hesap=new account();
		Scanner gir= new Scanner(System.in);
		System.out.printf("%d %s %s %.2f \n ", hesap.getAccountnum(),hesap.getName(),hesap.getLastname(),hesap.getBalance());
		while(input.hasNext())
		{
			try {
				hesap.setAccountnum(input.nextInt());
				hesap.setName(input.next());
				hesap.setLastname(input.next());
				hesap.setBalance(input.nextDouble());
				
				System.out.printf("%d %s %s %.2f \n ", hesap.getAccountnum(),hesap.getName(),hesap.getLastname(),hesap.getBalance());				
			} 
			catch (NoSuchElementException elementException) {
				System.err.println("yanl�� bi�imlendirilmi� dosya");
			}
			catch (IllegalStateException stateException) {
				System.err.println(" \n dosya okuma hatas�");
			}}
	}
		public void closeF�le() {
				if(input!=null)
					input.close();
						}
}
