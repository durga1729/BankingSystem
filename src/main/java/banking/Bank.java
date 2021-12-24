package banking;

import java.util.LinkedHashMap;

/**
 * Private Variables:<br>
 * {@link #accounts}: List&lt;Long, Account&gt;
 */
public class Bank implements BankInterface {
    private LinkedHashMap<Long, Account> accounts;

    public Bank() {
        accounts = new LinkedHashMap<Long, Account>();
    }

    private Account getAccount(Long accountNumber) {
        // complete the function
        Optional<Account> account = accounts.entrySet().stream().filter(e -> e.getKey().equals(3)).map(Map.Entry::getValue).findAny();
        return account;
    }

    public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
        // complete the function
        return -1L;
    }

    public Long openConsumerAccount(Person person, int pin, double startingDeposit) {
        // complete the function
        return -1L;
    }

    public boolean authenticateUser(Long accountNumber, int pin) {
        return (accountNumber == pin) ? true : false;
    }

    public double getBalance(Long accountNumber) {
        return getAccount(accountNumber).getBalance();
    }

    public void credit(Long accountNumber, double amount) {
        Account account = getAccount(accountNumber);
        account.creditAccount(amount);
    }

    public boolean debit(Long accountNumber, double amount) {
        Account account = getAccount(accountNumber);
        return account.debitAccount(amount);
    }
}
