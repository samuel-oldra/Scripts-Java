public class Calculadora{
	public static void main(String vsArgs[]){
		
		System.out.println("Iniciando programa...");
		
		// cria a interface gráfica.
		WinCalculadora oCalculadora = new WinCalculadora();
		
		System.out.println("Mostrando a janela...");
		
		// adiciona objeto responsável por tratar eventos da janela.
		oCalculadora.addWindowListener(new TtdCalculadora());
		
		oCalculadora.show();
	}
}