package Contas;

// import files
import Contas.ContaBanco;

// classe ContaComum que herda atributos e métodos do pai
public class ContaEspecial extends ContaBanco{
	
	// variáveis
	protected double dLimiteConta;	// armazena o limite da conta
	
	// método construtor com saldo inicial
	public ContaEspecial(String sNumConta, String sNomeConta, double dSaldoConta, double dLimiteConta){
		super(sNumConta, sNomeConta, dSaldoConta); // usa método construtor do pai
		this.dLimiteConta = dLimiteConta;
	}
	
	// método construtor sem saldo inicial
	public ContaEspecial(String sNumConta, String sNomeConta, double dLimiteConta){
		super(sNumConta, sNomeConta); // usa método construtor do pai
		this.dLimiteConta = dLimiteConta;
	}
	
	// pegar saldo da conta
	public double getSaldoConta(){
		return (this.dSaldoConta + this.dLimiteConta);
	}
	
	public double getLimiteConta(){
		return this.dLimiteConta;
	}
	
	// realiza um decremento de saldo
	public void putDebitarConta(double dValor){
		if(dValor > 0){ // testa valor negativo
			if(((this.dSaldoConta + dLimiteConta) - dValor) >= 0){ // testa saldo suficiente
				this.dSaldoConta -= dValor;
				System.out.println("Debito realizado com sucesso!");
			}
			else{
				System.out.println("Saldo Insuficiente!");
			}
		}
		else{
			System.out.println("Valor Invalido!");
		}
	}
}