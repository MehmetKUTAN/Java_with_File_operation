package file_operation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextFile {
	private Scanner input;
	public void openFile() {
		try {
			input=new Scanner(new File("client.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("Dosyaya mevcut de�ildir");
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
		//System.out.println(" \n giri�i sonland�rmak i�in Ctrl+z(Windows) veya Ctrl+d(linux) tu�lar�na bas�n�z \n");
		//System.out.println("\n hesap  numaras� (>0),Hesap sahibi ad�,soyadi ve bakiye miktar�n� giriniz. \n ");
		
		while(input.hasNext())
		{
			try {
				hesap.setAccountnum(gir.nextInt());
				hesap.setName(gir.next());
				hesap.setLastname(gir.next());
				hesap.setBalance(gir.nextDouble());
				if(hesap.getAccountnum()>0)
				{
					System.out.printf("%d %s %s %.2f \n ", hesap.getAccountnum(),hesap.getName(),hesap.getLastname(),hesap.getBalance());
				}
				else
				{
					System.out.println("Hesap numaras�n� >0 olmak zorundad�r");
				}
			} catch (FormatterClosedException e) {
				System.err.println(" \n kullan�labilir olamayabilir");
				input.close();
			}
			catch (NoSuchElementException e) {
				System.err.println("yeterli veri giri�i yap�lmad�");
			}
			System.out.println("\n hesap  numaras� (>0),Hesap sahibi ad�,soyadi ve bakiye miktar�n� giriniz. \n ");
		}
	}
		public void closeFile() {
				if(input!=null)
					input.close();
						}
	}

