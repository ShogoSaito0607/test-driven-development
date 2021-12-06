package main.java.money;

public interface Expression {
    Money reduce(Bank bank, String to);
}
