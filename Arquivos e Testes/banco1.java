import java.io.*;

class ContaDeBanco {
    protected double saldo;

    public ContaDeBanco(double saldoInicial) // funcao construtora
    {
        saldo = saldoInicial;
    }

    public static int leInteiro(String s) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(s);
        int i = 0;
        try {
            i = Integer.parseInt(input.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;
    } // classe leInteiro

    public void deposito(double valor) {
        saldo += valor;
    }

    void retirada(double valor) {
        saldo -= valor;
    }

    public void mostraSaldo() {
        System.out.print("Saldo atual = " + saldo);
        if (saldo < 0)
            System.out.println(" - ESTOURADO");
    }
} //  classe ContaDeBanco

class ContaEspecial extends ContaDeBanco {
    private double limite;

    public ContaEspecial(double valor) // funcao construtora
    {
        super(valor);
        limite = (valor * 10);
    }

    public void mostraSaldo() {
        System.out.println("Saldo atual = " + saldo);
        System.out.println("Limite    = " + limite);
        if ((limite + saldo) > 0)
            System.out.println("Valor disponivel para saque = " + (limite + saldo));
        else
            System.out.println("Limite ESTOURADO");
    }
} // classe ContaEspecial

class ContaPoupanca extends ContaDeBanco {
    int diaAniversario, correcao = 0;

    public ContaPoupanca(double valor, int dia) // funcao construtora
    {
        super(valor);
        diaAniversario = dia;
    }

    public void corrigeSaldo() {
        correcao = leInteiro("Entre com a correcao monetaria: ");
        saldo += (saldo * correcao / 100);
    }

    public void mostraSaldo() {
        System.out.println("Saldo atual = " + saldo);
        System.out.println("Dia de Aniversario = " + diaAniversario);
    }

} // classe ContaPoupanca

public class banco1 {
    public static void main(String[] args) {
        ContaDeBanco contaNormal = new ContaDeBanco(50.00);
        ContaEspecial contaEsp = new ContaEspecial(100.00);
        ContaPoupanca contaPoup = new ContaPoupanca(0, 12);

        System.out.println("\nInformacoes da conta especial:  ");
        contaEsp.mostraSaldo();

        contaEsp.deposito(50.00);
        System.out.print("\nDepositando 50 reais na conta especial: ");
        contaEsp.mostraSaldo();

        contaEsp.retirada(200.00);
        System.out.print("\nRetirando 200 reais da conta especial: ");
        contaEsp.mostraSaldo();

        contaEsp.retirada(2200.00);
        System.out.print("\nRetirando 2200 reais da conta especial: ");
        contaEsp.mostraSaldo();

        System.out.println("\nInformacoes da conta normal:  ");
        contaNormal.mostraSaldo();

        contaNormal.deposito(100.00);
        System.out.print("\nDepositando 50 reais na conta normal: ");
        contaNormal.mostraSaldo();

        contaNormal.retirada(200.00);
        System.out.print("\nRetirando 200 reais da conta normal: ");
        contaNormal.mostraSaldo();

        contaPoup.deposito(123.00);
        System.out.println("\nDepositando 123 reais da conta poupanca");
        contaPoup.mostraSaldo();
        contaPoup.corrigeSaldo();
        System.out.println("\nDepois da correcao monetaria");
        contaPoup.mostraSaldo();
    } // metodo main
} // classe banco1