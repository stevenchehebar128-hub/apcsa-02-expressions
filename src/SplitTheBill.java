/**
 * Exercise 5 (Homework) — SplitTheBill
 *
 * A bill total in cents, split between some number of people.
 * Print each person's share and how many cents are left over.
 *
 * Example: 10000 cents, 3 people
 *   Each person pays: 3333 cents ($33.33)
 *   Left over:        1 cent
 *
 * Challenge: also print the share formatted as dollars.
 */
public class SplitTheBill {
    public static void main(String[] args) {
        int billCents = 10000;
        int people = 3;

        int share = billCents / people;
        int leftOver = billCents % people;

        System.out.println("Each person pays: " + share + " cents");

        double dollars = share / 100.0;
        System.out.printf("Each person pays: $%.2f%n", dollars);

        System.out.println("Left over: " + leftOver + " cent");
    }
}