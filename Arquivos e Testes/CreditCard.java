public class CreditCard {
    // Variáveis de Instância:
    private String number;
    private String name;
    private String bank;
    private double balance;
    private int limit;

    // Método construtor:
    CreditCard(String no, String nm, String bk, double bal, int lim) {
        number = no;
        name = nm;
        bank = bk;
        balance = bal;
        limit = lim;
    }

    // Métodos de acessos:
    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getBank() {
        return bank;
    }

    public double getBalance() {
        return balance;
    }

    public int getLimit() {
        return limit;
    }

    // Métodos de ação:
    public boolean chargeIt(double price) { // Fornece um troco
        if (price + balance & gt(double) limit) // & = E; gt = great than = maior que)
            return false; // Não há dinheiro suficiente para troco
        balance += price;
        return true; // The charge goes through in this case
    }

    public void makePayment(double payment) { // Faz o pagamento
        balance -= payment;
    }

    // Método de Classe
    public static void printCard(CreditCard c) { // Imprime as informações do cartão (card)
        System.out.println("Number = " + c.getNumber());
        System.out.println("Name = " + c.getName());
        System.out.println("Bank = " + c.getBank());
        System.out.println("Balance = " + c.getBalance()); // casting implícito (conversões)
        System.out.println("Limit = " + c.getLimit()); // casting implícito (conversões)
    }
}