 /* ::::: DADOS DO PROGRAMADOR :::::
 * Aluno: Samuel Brando Oldra
 * Matrícula: 10205981
 * Disciplina: Programação 3
 * Professor: Alexandre Zamerlam
 * Faculdade: Faculdade de Informática de Taquara
 * Mantenedora: Fundação Educacional Encosta Inferior do Nordeste
 */
  
import javax.swing.JOptionPane;
 
public class Pares{
	public static void main(String vArgs[]){
		
		// variáveis
		String sNume = ""; 	// leitura da caixa de diálogo
		int iNume = 0; 		// número informado
		int iSoma = 0; 		// soma dos anteriores
		
		// leitura do número inteiro.
		sNume = JOptionPane.showInputDialog(null,"Informe um número inteiro: ",
        "Solicitação",JOptionPane.QUESTION_MESSAGE);
                
        if(sNume != null){           
        	// conversão de String -> int
        	iNume = Integer.parseInt(sNume);
        
        	int iAux = 0;		// auxiliar para soma
        	while(iAux < iNume){
        		if(iAux % 2 == 0){
        			iSoma += iAux;
        		}
        		iAux++;
        	}
        
        	// mostra o resultado
        	JOptionPane.showMessageDialog(null,"A soma é: " + iSoma, "Resultado",
			JOptionPane.INFORMATION_MESSAGE);
		} else{
			// mostra o erro
        	JOptionPane.showMessageDialog(null,"Entrada de dados inválida!", "ERRO",
			JOptionPane.ERROR_MESSAGE);	
		}
		
		System.exit(0); 
	}
}