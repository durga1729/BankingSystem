package banking;

import java.util.ArrayList;
import java.util.List;

/**
 * Account implementation for commercial (business) customers.<br><br>
 *
 * Private Variables:<br>
 * {@link #authorizedUsers}: List&lt;Person&gt;<br>
 */
public class CommercialAccount  {
	private List<Person> authorizedUsers;
	private Long accountNumber = 1l;
	private int pin=0;
	private double startingDeposit;

	public CommercialAccount(Company company, Long accountNumber, int pin, double startingDeposit) {
		authorizedUsers = new ArrayList<Person>;
		this.accountNumber = accountNumber;
		this.pin = pin;
		this.startingDeposit = startingDeposit;
	}

	/**
	 * @param person The authorized user to add to the account.
	 */
	protected void addAuthorizedUser(Person person) {
		authorizedUsers.add(person);
	}

	/**
	 * @param person
	 * @return true if person matches an authorized user in {@link #authorizedUsers}; otherwise, false.
	 */
	public boolean isAuthorizedUser(Person person) {
		// complete the function
        return true;
	}
}
