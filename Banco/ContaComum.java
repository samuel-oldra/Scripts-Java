package Contas;

// import files
import Contas.ContaBanco;

// classe ContaComum que herda atributos e métodos do pai
public class ContaComum extends ContaBanco{
	
	// método construtor com saldo inicial
	public ContaComum(String sNumConta, String sNomeConta, double dSaldoConta){
		super(sNumConta, sNomeConta, dSaldoConta); // usa método construtor do pai
	}
	
	// método construtor sem saldo inicial
	public ContaComum(String sNumConta, String sNomeConta){
		super(sNumConta, sNomeConta); // usa método construtor do pai
	}
}