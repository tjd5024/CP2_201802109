package bankAccount.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import bankAccount.BankAccount;

class BankAccountTest {


	@Test
	void testInstallmentSavingPredict() {
		BankAccount bankAccount = new BankAccount();
		assertEquals(426500,bankAccount.installmentSavingPredict(12,10000));
	}

	@Test
	void testFixedDepositPredict() {
		BankAccount bankAccount = new BankAccount();
		assertEquals(2806899,bankAccount.fixedDepositPredict(24, 2000000));
		
		
	}

	@Test
	void testGetName() {
		BankAccount bankAccount = new BankAccount();
		assertSame("¼º¿ìÃ¢",bankAccount.getName());
	}

	@Test
	void testGetBalance() {
		BankAccount bankAccount = new BankAccount();
		assertEquals(300000,bankAccount.getBalance());
	}

}
