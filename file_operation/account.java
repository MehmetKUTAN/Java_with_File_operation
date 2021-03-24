package file_operation;

public class account {
private int accountnum;
private String name;
private String lastname;
private double balance;

public account (){
	SetAccount(0," "," ",0.0);
	
}
public account(int accountnum, String name, String lastname, double balance) {
	 SetAccount(accountnum,name,lastname,balance);

	}
private void SetAccount(int i, String string, String string2, double d) {
	// TODO Auto-generated method stub
	accountnum=i;
	name=string;
	lastname=string2;
	balance=d;	
}
public int getAccountnum() {
	return accountnum;
}

public void setAccountnum(int accountnum) {
	this.accountnum = accountnum;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getLastname() {
	return lastname;
}

public void setLastname(String lastname) {
	this.lastname = lastname;
}

public double getBalance() {
	return balance;
}

public void setBalance(double balance) {
	this.balance = balance;
}

}
