package dev.thinh.javacore;

public final class Money {

  private final long amount;
  private final String currency;

  public long amount() {
    return amount;
  }

  public String currency() {
    return currency;
  }

  public Money(long amount, String currency) {

    if (amount < 0) {
      throw new IllegalArgumentException("amount must be non-negative");
    }
    if (currency == null || currency.isBlank()) {
      throw new IllegalArgumentException("currency is required");
    }

    this.amount = amount;
    this.currency = currency;
  }

  public Money add(Money other) {
    if (other == null) {
      throw new IllegalArgumentException("Money not null");
    }

    if (!this.currency.equals(other.currency)) {
      throw new IllegalArgumentException("Not same currency");
    }
    return new Money(this.amount + other.amount, this.currency);
  }

}
