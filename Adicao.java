import javax.swing.JOptionPane;

public class Adicao{
	public static void main(String args[]){
		String primNum, seguNum; // armazenam as strings dos dois numeros
		int num1, num2, soma;	// armazenam os números convertidos e a soma
		
		primNum = JOptionPane.showInputDialog(null,"Entre com primeiro inteiro: ",
		"Primeiro número",JOptionPane.QUESTION_MESSAGE);
		seguNum = JOptionPane.showInputDialog(null,"Entre com segundo inteiro: ",
		"Segundo número",JOptionPane.QUESTION_MESSAGE);
		// lê os números do usuário como STRING
		
		num1 = Integer.parseInt(primNum);
		num2 = Integer.parseInt(seguNum);
		// converte as STRINGS lidas para o tipo INTEIRO
		
		soma = num1 + num2;
		
		JOptionPane.showMessageDialog(null,"A soma é: " + soma, "Resultado",
		JOptionPane.PLAIN_MESSAGE); // mostra o resultado
		/*
		 * null = centraliza a caixa de diálogo
		 * "Resultado" = título da aplicação
		 * PLAINLMESSAGE = ícone da caixa de diálogo
		 */
		
		System.exit(0);
		// fecha a aplicação.
	}
	// fim main
}