public class Money {
    private double amount;

    // constructor
    public Money(double amount) {
        this.amount = amount;
    }

    // copy constructor
    public Money( Money other) {
        this.amount = other.amount;
    }

    public Money add(Money other) {
        return new Money(this.amount + other.amount);
    }

    public Money sub(Money other) {
        return new Money(this.amount - other.amount);
    }

    public boolean equal(Money other) {
        return this.amount == other.amount;
    }

    public int compareTo(Money other) {
        return Double.compare(this.amount, other.amount);
    }

    @Override
    public String toString() {
        return "$" + String.format("%.2f", amount);
    }
}
