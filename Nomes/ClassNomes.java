import java.util.Vector;

public class ClassNomes{
	private static 
		String sNomeCompl;
		String sNomeAbrev;
		
	private void abrevia(){
		Vector vNomes = new Vector();
		char vcNomeCompl[];		
		int iInicio = 0;
		int iFinal = 0;
		int iCont = 0;
		
		// cria um vetor de caracteres igual a String.
		vcNomeCompl = new char[sNomeCompl.length()];
		vcNomeCompl = sNomeCompl.toCharArray();
		
		// separa as palavras
		while(iCont < sNomeCompl.length()){
			String sAux = "";
			if(vcNomeCompl[iCont] == ' '){
				iFinal = iCont;
				sAux = sNomeCompl.substring(iInicio, iFinal);
				vNomes.add(sAux.trim());
				iInicio = iFinal;
			}
			if(iCont == sNomeCompl.length() - 1){
				sAux = sNomeCompl.substring(iInicio, sNomeCompl.length());
				vNomes.add(sAux.trim());
			}
			iCont++;
		}
		
		// testa e abrevia as palavras
		iCont = 0;
		while(iCont < vNomes.size()){
			if((iCont == 0) || (iCont == vNomes.size() - 1)){
				String sAux = (String) vNomes.get(iCont);
				sAux = sAux.concat(" ");
				sNomeAbrev = sNomeAbrev.concat(sAux);
			}
			else{
				char cAux;
				String sAux = (String) vNomes.get(iCont);
				if(sAux.length() != 0){
					if((sAux.equalsIgnoreCase("da")) ||
					   (sAux.equalsIgnoreCase("de")) ||
					   (sAux.equalsIgnoreCase("di")) ||
					   (sAux.equalsIgnoreCase("do")) ||
					   (sAux.equalsIgnoreCase("du")) ||
					   (sAux.equalsIgnoreCase("das")) ||
					   (sAux.equalsIgnoreCase("des")) ||
					   (sAux.equalsIgnoreCase("dis")) ||
					   (sAux.equalsIgnoreCase("dos")) ||
					   (sAux.equalsIgnoreCase("dus"))){
					   	   sNomeAbrev = sNomeAbrev.concat(sAux);
					   	   sNomeAbrev = sNomeAbrev.concat(" ");
					}
					else{
						sNomeAbrev = sNomeAbrev.concat(sAux.valueOf(sAux.charAt(0)));
						sNomeAbrev = sNomeAbrev.concat(". ");
					}
				}
			}
			iCont++;
		}
		
		// imprime as posições do Vector
		iCont = 0;
		while(iCont < vNomes.size()){
			System.out.println(vNomes.get(iCont));
			iCont++;
		}
	}
	
	public ClassNomes(){
		sNomeCompl = "";
		sNomeAbrev = "";
	}
		
	public String abreviar(String sNome){
		sNomeCompl = sNome.trim();
		abrevia();
		return (sNomeAbrev.trim());
	}
}