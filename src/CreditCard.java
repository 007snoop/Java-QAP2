public class CreditCard {
    private Person owner;
    private Money balance;
    private Money creditLimit;

    // constructor
    public CreditCard(Person owner, Money creditLimit) {
        this.owner = owner;
        this.creditLimit = new Money(creditLimit);
        this.balance = new Money(0);
    }

    public Money getBalance() {
        return new Money(balance);
    }

    public Money getCreditLimit() {
        return new Money(creditLimit);
    }

    public String getPersonals() {
        return owner.toString();
    }

    // need to charge the card if within limit
    public void charge( Money amount)
    {
        if (balance.add(amount).compareTo(creditLimit) <= 0) {
            balance = balance.add(amount);
            System.out.println("charge: " + amount);
        } else {
            System.out.println("Past credit limit.");
        }
    }

    // making a payment to the credit
    public void pay( Money amount) {
        balance = balance.sub(amount);
        System.out.println("payed: " + amount);
    }
}
