package Contas;

public abstract class ContaBanco {

    // variáveis
    protected String sNumConta; // armazena o número da conta
    protected String sNomeConta; // armazena o nome da conta
    protected double dSaldoConta; // armazena o saldo da conta

    // método construtor com saldo inicial
    public ContaBanco(String sNumConta, String sNomeConta, double dSaldoConta) {
        this.sNumConta = sNumConta;
        this.sNomeConta = sNomeConta;
        this.dSaldoConta = dSaldoConta;
    }

    // método construtor sem saldo inicial
    public ContaBanco(String sNumConta, String sNomeConta) {
        this.sNumConta = sNumConta;
        this.sNomeConta = sNomeConta;
        this.dSaldoConta = 0;
    }

    // pegar número da conta
    public String getNumConta() {
        return this.sNumConta;
    }

    // pegar nome da conta
    public String getNomeConta() {
        return this.sNomeConta;
    }

    // pegar saldo da conta
    public double getSaldoConta() {
        return this.dSaldoConta;
    }

    // realiza um incremento de saldo
    public void putCreditarConta(double dValor) {
        if (dValor > 0) { // testar valor negativo
            this.dSaldoConta += dValor;
            System.out.println("Credito realizado com sucesso!");
        } else {
            System.out.println("Valor Invalido!");
        }
    }

    // realiza um decremento de saldo
    public void putDebitarConta(double dValor) {
        if (dValor > 0) { // testa valor negativo
            if ((this.dSaldoConta - dValor) >= 0) { // testa saldo suficiente
                this.dSaldoConta -= dValor;
                System.out.println("Debito realizado com sucesso!");
            } else {
                System.out.println("Saldo Insuficiente!");
            }
        } else {
            System.out.println("Valor Invalido!");
        }
    }
}