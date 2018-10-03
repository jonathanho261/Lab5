import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        /**Checkings account.*/
        CHECKINGS,
        /**Savings account.*/
        SAVINGS,
        /**Student account.*/
        STUDENT,
        /**Work account.*/
        WORKPLACE
    }
    /**This is the account number.*/
    private int accountNumber;
    /**Type of bank account.*/
    public BankAccountType accountType;
    /**Account balance.*/
    private double accountBalance;
    /**Name of oowner.*/
    private String ownerName;
    /**Interest charged.*/
    public double interestRate;
    /**Interest earned.*/
    private double interestEarned;
    /**Static stuff yay*/
    public static int numBanks;

    /**This is a constructor.
     *
     * @param name name of the owner.
     * @param accountCategory type of account.
     * */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        ownerName = name;
        accountType = accountCategory;
        numBanks++;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
    /**
     * This is a getter for balance.
     * @return money left.
     * */
    public double getAccountBalance() {
        return accountBalance;
    }
    /**This is a setter for ownerName.
     * @param change change of balance
     */
    public void setAccountBalance(final double change) {
        accountBalance = accountBalance + change;
    }


    /**This is setter of ownerName.
     * @param name new name.
     */
    public void setOwnerName(final String name) {
        ownerName = name;
    }

    /**This is a getter for ownerName.
     * @return name of owner.
     */
    public String getOwnerName() {
        return ownerName;
    }
}
