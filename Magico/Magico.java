/*
 Samuel Brando Oldra
 Programação III
 Faculdade de Informática
*/

public class Magico{
	
	// variáveis.
	private int iSize;			// tamanho matriz.
	private int oQuadro[][];	// matriz.
		
	// construtor da classe Magico.
	public Magico(int iSize){
		
		int x, y; // coordenadas iniciais.
		this.iSize = iSize;
		oQuadro = new int[this.iSize][this.iSize];
		
		// OBS.: ponto de partida meio da última linha.
		x = this.iSize / 2; // coluna inicial.
		y = this.iSize - 1; // linha inicial.
				
		gerarMatriz(x, y);
		mostrarMatriz();
	}
	
	// método que cria o quadrado mágico.
	private void gerarMatriz(int iX, int iY){
				
		// variáveis.
		int iCont = 0;	// controla a execução do laço;
		int x = 0;		// controla a posição horizontal(coluna).
		int y = 1;		// controla a posição vertical(linha).
		
		// OBS.: baixo + direita; ocupada cima ponto partida.
		while(iCont < (iSize * iSize)){
			
			if(oQuadro[x][y] == 0){
				
				oQuadro[x][y] = iCont + 1;
				
				if((x + 1) < iSize){ 		// testa se é a última coluna.
					x = x + 1;				// vai uma coluna para direita.
				}
				else{
					x = 0;					// vai para a primeira coluna.
				}
				
				if((y + 1) < iSize){ 		// testa se é a última linha.
					y = y + 1;				// vai uma linha para baixo.
				}
				else{
					y = 0;					// vai para a primeira da linha.
				}				
			}
			else{
				if(x == 0){ 				// testa se é a primeira coluna.
					x = iSize - 1;			// vai para a última da linha.
				}
				else{
					x = x - 1;				// vai uma coluna para esquerda.
				}
				
				if(y <= 1){ 				// testa se é a segunda linha.
					if(y == 0){
						y = iSize - 2;		// vai para a penúltima da linha.
					}
					else{
						y = iSize - 1; 		// vai para a última da linha.
					}
				}
				else{
					y = y - 2;				// vai duas coluna para esquerda.
				}
				
				oQuadro[x][y] = iCont + 1;
				
				if((x + 1) < iSize){ 		// testa se é a última coluna.
					x = x + 1;				// vai uma coluna para direita.
				}
				else{
					x = 0;					// vai para a primeira coluna.
				}
				
				if((y + 1) < iSize){ 		// testa se é a última linha.
					y = y + 1;				// vai uma linha para baixo.
				}
				else{
					y = 0;					// vai para a primeira da linha.
				}
			}
			
			iCont++;						// incrementa o contador;
		}
	}
	
	// método que mostra o quadrado mágico.
	private void mostrarMatriz(){
		
		// variáveis.
		int iContX = 0;		// controla a posição horizontal(coluna).
		int iContY = 0;		// controla a posição vertical(linha).
		
		for(iContY = 0; iContY < this.iSize; iContY++){
			for(iContX = 0; iContX < this.iSize; iContX++){
				if(iContX < iSize - 1){
					System.out.print(oQuadro[iContX][iContY] + "\t");
				}
				else{
					System.out.println(oQuadro[iContX][iContY] + "\t");
				}
			}			
		}
	}
}