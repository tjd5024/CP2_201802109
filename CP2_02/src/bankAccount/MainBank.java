package bankAccount;

public class MainBank {
	public static void main(String[] args) {
		BankAccount account = new BankAccount("����â",300000,0.1);
		int money, month ;
		
		System.out.println("���� ������ "+account.getName()+"�̰�, �ܾ��� "+account.getBalance()+"�� �Դϴ�.\n");
		
		money = 100000;
		account.deposit(money);
		System.out.println("���¿� "+money+"���� �Ա��Ͽ�, �ܾ��� "+account.getBalance()+"���� �Ǿ����ϴ�.");
		
		money = 100000;
		account.withdraw(money);
		System.out.println("���¿� "+money+"���� ����Ͽ�, �ܾ��� "+account.getBalance()+"���� �Ǿ����ϴ�.");
		
		money = 10000;
		month = 12;
		System.out.println("�ſ� "+money+"���� "+month+"���� �����ϸ�, �ܾ��� "+account.installmentSavingPredict(month, money)+"���� �ɰ��Դϴ�.");
		
		money = 2000000;
		month = 24;
		System.out.println(money+"���� "+month+"���� ���� �����ϸ�, �ܾ��� "+account.fixedDepositPredict(month,money)+"���� �ɰ��Դϴ�.");
	}

}
