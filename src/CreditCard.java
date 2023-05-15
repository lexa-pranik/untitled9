public class CreditCard {
    String number;
    double balance;

    public CreditCard(String account_number, double a) {
        number = account_number;
        balance = a;
    }

    double ad(double debit) {

        balance = balance + debit;
        return balance;
    }

    void info() {
        System.out.println("account_number - " + number);
        System.out.println("balance - " + balance);
    }

    double take(double minus) {
        if (balance >= minus) {
            balance = balance - minus;
        } else {
            System.out.println("insufficient funds~!");
        }
        return balance;
    }

    public static void main(String[] args) {
        CreditCard card1 = new CreditCard("1111111111", 0);
        CreditCard card2 = new CreditCard("2222222222", 100);
        CreditCard card3 = new CreditCard("3333333333", 1000000);
        card1.ad(1000);
        card2.ad(1231);
        card3.take(999999);
        card1.info();
        card2.info();
        card3.info();
    }
}
