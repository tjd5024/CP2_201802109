package bankAccount;

public class BankAccount {
	String name;
	int balance;
	double interest_rate;
	
	public BankAccount() {
		balance = 0;
	}
	public BankAccount(String n, int b, double i) {
		name = n;
		balance = b;
		interest_rate = i;
	}
	
	public void deposit(int money) {
		balance = balance + money;
	}
	
	public void withdraw(int money) {
		if(money>balance) {
			System.out.println("출금할 수 없습니다.");
			System.out.print("오른쪽의 출금 문장은 무시해 주시길 바랍니다.      [ERROR] ");
			money = 0;
		}
		balance = balance - money;
		}
	public int installmentSavingPredict(int month,int money) {
		return balance+ (int)(money*interest_rate/12*(month*(month+1)/2)+money*month);
	}
	public int fixedDepositPredict(int month, int money) {
		double pow1 = 1+(interest_rate/12);
		double pow2 = month;
		return money+balance+(int)((money+balance)*((Math.pow(pow1, pow2))-1));
	}
	
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int b) {
		balance = b;
	}
}
