package file_operation;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class CreateTextFile {
private Formatter output;
public void openFile() {
	try {
		output=new Formatter("client.txt");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		System.err.println("Dosyaya mevcut deðildir");
		System.exit(1);	
	}
	catch (SecurityException e) {
		// TODO Auto-generated catch block
		System.err.println("Dosyaya yazma yetkiniz yoktur");
		System.exit(1);
	}
}
public void addAccount() {
	account hesap=new account();
	Scanner gir= new Scanner(System.in);
	System.out.println(" \n giriþi sonlandýrmak için Ctrl+z(Windows) veya Ctrl+d(linux) tuþlarýna basýnýz \n");
	System.out.println("\n hesap  numarasý (>0),Hesap sahibi adý,soyadi ve bakiye miktarýný giriniz. \n ");
	
	while(gir.hasNext())
	{
		try {
			hesap.setAccountnum(gir.nextInt());
			hesap.setName(gir.next());
			hesap.setLastname(gir.next());
			hesap.setBalance(gir.nextDouble());
			if(hesap.getAccountnum()>0)
			{
				output.format("%d %s %s %.2f \n ", hesap.getAccountnum(),hesap.getName(),hesap.getLastname(),hesap.getBalance());
			}
			else
			{
				System.out.println("Hesap numarasýný >0 olmak zorundadýr");
			}
		} catch (FormatterClosedException e) {
			System.err.println(" \n kullanýlabilir olamayabilir");
		}
		catch (NoSuchElementException e) {
			System.err.println("yeterli veri giriþi yapýlmadý");
		}
		System.out.println("\n hesap  numarasý (>0),Hesap sahibi adý,soyadi ve bakiye miktarýný giriniz. \n ");
	}
}
	public void closeFÝle() {
			if(output!=null)
				output.close();
					}
}
