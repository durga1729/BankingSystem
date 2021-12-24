package banking;

public class ConsumerAccount  {
	private Person person;
	private Long accountNumber;
	private int pin;
	private double currentBalance;

	public ConsumerAccount(Person person, Long accountNumber, int pin, double currentBalance) {
        this.person = person;
		this.accountNumber = accountNumber;
		this.pin = pin;
		this.currentBalance;
	}
}
