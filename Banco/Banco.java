package Contas;

// import files
import Contas.ContaComum;
import Contas.ContaEspecial;
import java.util.Vector;
import java.io.*;

/*
::: MENU :::
+Criar
	-Conta Comum
	-Conta Especial
	-Voltar 
+Remover
	-Conta Comum
	-Conta Especial
	-Voltar 
+Listar
	-ContasComuns
	-ContasEspeciais
	-Voltar
+Operacoes
	+Creditar
		-Conta Comum
		-Conta Especial
		-Voltar
	+Debitar
		-Conta Comum
		-Conta Especial
		-Voltar
	+Saldo
		-Conta Comum
		-Conta Especial
		-Voltar 
	+Extrato
		-Conta Comum
		-Conta Especial
		-Voltar 
	+Procurar
		-Conta Comum
		-Conta Especial
		-Voltar
	-Voltar 
-Sair
*/

public class Banco{
	
	// variáveis
	Vector vListContaComum; 	// Vetor que armazena objetos tipo ContaComum
	Vector vListContaEspecial;	// Vetor que armazena objetos tipo ContaEspecial
	
	// método construtor da classe	
	public Banco(){
		vListContaComum = new Vector();		// instanciando objeto vListContaComum
		vListContaEspecial = new Vector();	// instanciando objeto vListContaEspecial
	}
	
	// método que captura String do teclado (modo texto)
	private static String getText(String sQuestao) throws IOException { 
        BufferedReader brResp = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(sQuestao);
        return brResp.readLine();
    }
    
    // método que cria uma nova Conta Comum e adiciona a lista de Contas Comuns
    public void addContaComum(){
    	
    	// variáveis
		String sNumConta;		// armazena o número da conta
		String sNomeConta;		// armazena o nome da conta
		double dSaldoConta;		// armazena o saldo da conta
		
		try{
			sNumConta = getText("Digite o numero da Conta: ");
			sNomeConta = getText("Digite o nome da Conta  : ");
			dSaldoConta = Double.parseDouble((getText("Digite o Saldo Inicial  : ")));
			
			vListContaComum.add(new ContaComum(sNumConta, sNomeConta, dSaldoConta));
			System.out.println("Nova Conta criada com sucesso!");
		}
		catch(IOException eErro){
			System.out.println("Houve um erro: " + eErro.getMessage());
			System.out.println("Cadastro abortado!");
		}
		catch(NumberFormatException eErro){
			System.out.println("Houve um erro: " + eErro.getMessage());
			System.out.println("Cadastro abortado!");
		}
    }
    
    // método que cria uma nova Conta Especial e adiciona a lista de Contas Especial
    public void addContaEspecial(){
    	
    	// variáveis
		String sNumConta;		// armazena o número da conta
		String sNomeConta;		// armazena o nome da conta
		double dSaldoConta;		// armazena o saldo da conta
		double dLimiteConta;	// armazena o limite da conta
		
		try{
			sNumConta = getText("Digite o numero da Conta: ");
			sNomeConta = getText("Digite o nome da Conta  : ");
			dSaldoConta = Double.parseDouble((getText("Digite o Saldo Inicial  : ")));
			dLimiteConta = Double.parseDouble((getText("Digite o limite da Conta: ")));
			
			vListContaEspecial.add(new ContaEspecial(sNumConta, sNomeConta, dSaldoConta, dLimiteConta));
			System.out.println("Nova Conta criada com sucesso!");
		}
		catch(IOException eErro){
			System.out.println("Houve um erro: " + eErro.getMessage());
			System.out.println("Cadastro abortado!");
		}
		catch(NumberFormatException eErro){
			System.out.println("Houve um erro: " + eErro.getMessage());
			System.out.println("Cadastro abortado!");
		}
    }
    
    // método que remove uma nova Conta Comum da lista de Contas Comuns
    public void removeContaComum(){
    	
    	if(vListContaComum.size() != 0){
    		
    		// variáveis
    		int iCont = 0;			// armazena a posição do Vector.
    		int iContas = 0;		// armazena a quantidade de contas removidas.
    		String sNumConta = "";	// armazena o número da conta a ser removida.
    	    	
    		try{
    			sNumConta = getText("Digite o numero da Conta: ");
    		}
    		catch(IOException eErro){
				System.out.println("Houve um erro: " + eErro.getMessage());
				System.out.println("Remocao abortada!");
			}
    		
    		while(iCont < vListContaComum.size()){    		
    			
    			// lê a posição do Vector para dentro do objeto ccConta
    			ContaComum ccConta = (ContaComum) vListContaComum.get(iCont);
    			
    			if(sNumConta.equalsIgnoreCase(ccConta.getNumConta()) == true){
    				vListContaComum.removeElementAt(iCont);
    				iContas++;
    			}
    			else{
    				/* OBS: A posição do Vector só deve ser incrementada quando
    				o não é feita nenhuma remoção, pois o Vector diminui quando
    				é feita uma remoção. */
    				iCont++;
    			}
    		}
    		
    		System.out.println("Contas removidas: " + iContas);
    	}
    	else{
    		System.out.println("Nenhuma Conta Cadastrada!");
    	}
    }
    
    // método que remove uma nova Conta Especial da lista de Contas Especial
    public void removeContaEspecial(){
    	
    	if(vListContaEspecial.size() != 0){
    		
    		// variáveis
    		int iCont = 0;			// armazena a posição do Vector.
    		int iContas = 0;		// armazena a quantidade de contas removidas.
    		String sNumConta = "";	// armazena o número da conta a ser removida.
    	    	
    		try{
    			sNumConta = getText("Digite o numero da Conta: ");
    		}
    		catch(IOException eErro){
				System.out.println("Houve um erro: " + eErro.getMessage());
				System.out.println("Remocao abortada!");
			}
    		
    		while(iCont < vListContaEspecial.size()){    		
    			
    			// lê a posição do Vector para dentro do objeto ccConta
    			ContaEspecial ceConta = (ContaEspecial) vListContaEspecial.get(iCont);
    			
    			if(sNumConta.equalsIgnoreCase(ceConta.getNumConta()) == true){
    				vListContaEspecial.removeElementAt(iCont);
    				iContas++;
    			}
    			else{
    				/* OBS: A posição do Vector só deve ser incrementada quando
    				o não é feita nenhuma remoção, pois o Vector diminui quando
    				é feita uma remoção. */
    				iCont++;
    			}
    		}
    		
    		System.out.println("Contas removidas: " + iContas);
    	}
    	else{
    		System.out.println("Nenhuma Conta Cadastrada!");
    	}
    }
    
    // método que lista todas as Contas Comuns por ordem de cadastro
    public void listContasComuns(){
    	if (vListContaComum.size() == 0){ // testa se há alguma Conta cadastrada
    		System.out.println("Nenhuma Conta Comum cadastrada!");
    	}
    	else{
    		int iCont; // variável auxiliar para percorrer Vector
    		for(iCont = 0; iCont < vListContaComum.size(); iCont++){
    			ContaComum ccConta = (ContaComum) vListContaComum.get(iCont);
				System.out.print ("Conta Numero: " + ccConta.getNumConta());
				System.out.print (" - Nome: " + ccConta.getNomeConta());
				System.out.println (" - Saldo: " + ccConta.getSaldoConta());
    		}
    	}
    }
    
    // método que lista todas as Contas Especiais por ordem de cadastro
    public void listContasEspeciais(){
    	if (vListContaEspecial.size() == 0){ // testa se há alguma Conta cadastrada
    		System.out.println("Nenhuma Conta Especial cadastrada!");
    	}
    	else{
    		int iCont; // variável auxiliar para percorrer Vector
    		for(iCont = 0; iCont < vListContaEspecial.size(); iCont++){
    			ContaEspecial ceConta = (ContaEspecial) vListContaEspecial.get(iCont);
				System.out.print ("Conta Numero: " + ceConta.getNumConta());
				System.out.print (" - Nome: " + ceConta.getNomeConta());
				System.out.print (" - Saldo: " + ceConta.getSaldoConta());
				System.out.println (" - Limite: " + ceConta.getLimiteConta());
    		}
    	}
    }
    
    // método que cria o menu Criar Conta
    public void menuCriarConta(){
    	
    	// variáveis
		int iOpcao = 0;
		
		while(iOpcao != 3){
			
			// menu criar conta
			System.out.println("\nMENU CRIAR CONTA\n");
			System.out.println("1 => Conta Comum");
			System.out.println("2 => Conta Especial");
			System.out.println("3 => Voltar\n");
			
			try{
				iOpcao = Integer.parseInt((getText("Opcao: ")));
			}
			catch(Exception eErro){
				System.out.println ("\nHouve um erro: " + eErro.getMessage());
			}
			
			switch(iOpcao){
				case 1: { addContaComum(); break;}
				case 2: { addContaEspecial(); break;}
				case 3: { break;}
				default: { System.out.println("\nOpcao Invalida!"); break;}
			}
		}
    }
    
    // método que cria o menu Listar Contas
    public void menuListarContas(){
    	
    	// variáveis
		int iOpcao = 0;
		
		while(iOpcao != 3){
			
			// menu listar contas
			System.out.println("\nMENU LISTAR CONTAS\n");
			System.out.println("1 => Conta Comum");
			System.out.println("2 => Conta Especial");
			System.out.println("3 => Voltar\n");
			
			try{
				iOpcao = Integer.parseInt((getText("Opcao: ")));
			}
			catch(Exception eErro){
				System.out.println ("Houve um erro: " + eErro.getMessage());
			}
			
			switch(iOpcao){
				case 1: { listContasComuns(); break;}
				case 2: { listContasEspeciais(); break;}
				case 3: { break;}
				default: { System.out.println("\nOpcao Invalida!"); break;}
			}
		}
    }
    
    // método que cria o menu Remover Conta
    public void menuRemoverConta(){
    	
    	// variáveis
		int iOpcao = 0;
		
		while(iOpcao != 3){
			
			// menu listar contas
			System.out.println("\nMENU REMOVER CONTA\n");
			System.out.println("1 => Conta Comum");
			System.out.println("2 => Conta Especial");
			System.out.println("3 => Voltar\n");
			
			try{
				iOpcao = Integer.parseInt((getText("Opcao: ")));
			}
			catch(Exception eErro){
				System.out.println ("Houve um erro: " + eErro.getMessage());
			}
			
			switch(iOpcao){
				case 1: { removeContaComum(); break;}
				case 2: { removeContaEspecial(); break;}
				case 3: { break;}
				default: { System.out.println("\nOpcao Invalida!"); break;}
			}
		}    	
    }
    
    // método que sinaliza que não foi criado menu
    public void menuVazio(){
    	System.out.println("\n::::: MENU SENDO CRIADO :::::\n");
    }
	
	// método principal do programa
	public static void main(String vsArg[]){
		
		// variáveis
		int iOpcao = 0;
		Banco bkControle = new Banco();
		
		while(iOpcao != 5){
			
			// menu principal
			System.out.println("\nMENU PRINCIPAL\n");
			System.out.println("1 => Criar Conta");
			System.out.println("2 => Remover Conta");
			System.out.println("3 => Listar Contas");
			System.out.println("4 => Operacoes");
			System.out.println("5 => Sair Programa\n");
			
			try{
				iOpcao = Integer.parseInt(getText("Opcao: "));
			}
			catch(Exception eErro){
				System.out.println ("\nHouve um erro: " + eErro.getMessage());
			}
			
			switch(iOpcao){
				case 1: { bkControle.menuCriarConta(); break;}
				case 2: { bkControle.menuRemoverConta(); break;}
				case 3: { bkControle.menuListarContas(); break;}
				case 4: { bkControle.menuVazio(); break;}
				case 5: { break;}
				default: { System.out.println("\nOpcao Invalida!"); break;}
			}
		}
		
		System.exit(0); // fecha a aplicação
	}
}