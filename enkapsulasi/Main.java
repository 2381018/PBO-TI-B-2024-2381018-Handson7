package enkapsulasi;

public class Main {
    public static void main(String[] args) {
        BankAccount joshuaSinabutar = new BankAccount(200);
        joshuaSinabutar.deposit(20);
        System.out.println(joshuaSinabutar.getSaldo());
    }
}
