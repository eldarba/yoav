package bank.system;

public class Client {

	private int id;
	private String name;
	private float balance;
	private Account[] accounts = new Account[5];
	private float commissionRate;
	private float interestRate;
	private Logger logger;

	public Client(int id, String name, float balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
		logger = new Logger(null);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public Account[] getAccounts() {
		return accounts;
	}

	/**
	 * add the account to the array and log the operation. You should seek the array
	 * and place the Account where the first null value is found. Clients shouldn't
	 * be able to add Accounts with already existing IDs.
	 */
	public void addAccount(Account account) {
		// check that this account is not already exist
		if (getAccount(account.getId()) != null) {
			System.out.println("account with id " + account.getId() + " already exists");
			return;
		}

		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] == null) {
				accounts[i] = account;
				// log the operation
				long timestamp = System.currentTimeMillis();
				int clientId = this.id;
				String description = "addAccount";
				float amount = account.getBalance();
				Log log = new Log(timestamp, clientId, description, amount);
				logger.log(log);
				// =================
				return;
			}
		}
		System.out.println("account not added. you already have " + accounts.length + " accounts");

	}

	/**
	 * returns the account with the specified id or null if does not exist
	 */
	public Account getAccount(int accountId) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null && accounts[i].getId() == accountId) {
				return accounts[i];
			}
		}
		System.out.println("no account");
		return null;
	}

	/**
	 * remove the account with the same id from the array (by assigning a 'null'
	 * value to the array[position]) & transfers the money to the clients balance.
	 * Log the operation via creating Log object with appropriate data and sending
	 * it to the Logger.log(..) method.
	 */
	public void removeAccount(int accountId) {
		for (int i = 0; i < accounts.length; i++) {
			Account curr = accounts[i];
			if (curr != null && curr.getId() == accountId) {
				float accountBalance = curr.getBalance();
				this.balance = this.balance + accountBalance;// transfers the money to the clients balance
				accounts[i] = null;
				// log the operation
				Log log = new Log(System.currentTimeMillis(), this.id, "removeAccount", accountBalance);
				logger.log(log);
				// =================
			}
		}
	}

	/**
	 * implement to add the amount from clients balance according to the commission
	 * (which is now zero). Use the commission data member in your calculation).
	 * Example: if a client deposits 1000, the actual amount added to his account
	 * will be = 1000-commission. If a client withdraws 1000, the actual amount
	 * taken from his account will be = 1000+commission.
	 */
	public void deposit(float amount) {
		float commission = amount * this.commissionRate;
		this.balance += amount;// this.balance = this.balance + amount;
		this.balance -= commission;
		// log the operation
		Log log = new Log(System.currentTimeMillis(), this.id, "deposit", amount);
		logger.log(log);
		// =================
	}

	/**
	 * implement to remove the amount from clients balance according to the
	 * commission (which is now zero). Use the commission data member in your
	 * calculation). Example: if a client deposits 1000, the actual amount added to
	 * his account will be = 1000-commission. If a client withdraws 1000, the actual
	 * amount taken from his account will be = 1000+commission.
	 */
	public void withdraw(float amount) {
		float commission = amount * this.commissionRate;
		this.balance -= amount;// this.balance = this.balance + amount;
		this.balance -= commission;
		// log the operation
		Log log = new Log(System.currentTimeMillis(), this.id, "withdraw", amount);
		logger.log(log);
		// =================
	}

	/**
	 * this method loops over the client accounts, calculates the amount to add
	 * according to the client interest (meanwhile it is zero) and adds it to each
	 * account balance. Use the interest data member in your calculation. Log this
	 * operation. Note: this method will be invoked once a day by a background
	 * thread – we will add it in future phases.
	 */
	public void autoUpdateAccounts() {
		for (int i = 0; i < accounts.length; i++) {
			Account currAccount = accounts[i];
			if (currAccount != null) {
				float interest = currAccount.getBalance() * this.interestRate;
				currAccount.setBalance(currAccount.getBalance() + interest);
				// log the operation
				Log log = new Log(System.currentTimeMillis(), this.id, "autoUpdateAccounts", interest);
				logger.log(log);
				// =================
			}
		}
	}

	/** returns the sum of client balance + total accounts balance. */
	public float getFortune() {
		float fortune = this.balance;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) {
				fortune += accounts[i].getBalance();
			}
		}
		return fortune;
	}

}
