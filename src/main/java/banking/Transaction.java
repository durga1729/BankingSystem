package banking;

/**
 *
 * Private Variables:<br>
 * {@link #accountNumber}: Long<br>
 * {@link #bank}: Bank<br>
 */
public class Transaction {
	private Long accountNumber;
	private Bank bank;
	private int attemptedPin;

	/**
	 *
	 * @param bank
	 *            The bank where the account is housed.
	 * @param accountNumber
	 *            The customer's account number.
	 * @param attemptedPin
	 *            The PIN entered by the customer.
	 * @throws Exception
	 *             Account validation failed.
	 */
	public Transaction(Bank bank, Long accountNumber, int attemptedPin) throws Exception {
		this.bank = bank;
		this.accountNumber = accountNumber;
		this.attemptedPin = attemptedPin;
	}

	public double getBalance() {
        return new Account().getBalance(accountNumber);
	}

	public void credit(double amount) {
		return new Account().creditAccount(amount);
	}

	public boolean debit(double amount) {
        return creditAccount.debitAccount(amount);
	}
}
