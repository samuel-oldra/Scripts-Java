/**
 * Esta classe define um ponto(x,y) não alterável no plano
 * @author Alexandre Zamberlam
 */
 
 public class XYPoint {
 	private double x,y;	//variaveis de instancia privada para as coordenadas
 	
 	/**
 	 * Constroi um ponto(x,y) em uma localizacao especifica
 	 *
 	 * @param xCoor A abscissa do ponto
 	 * @param yCoor A ordenada do ponto
 	 */
 	 public XYPoint(double xCoor, double yCoor) {
 	 	x = xCoor;
 	 	y = yCoor;
 	 }
 	 
 	 /**
 	  * Retorna o valor da abscissa
 	  *
 	  * @return abscissa
 	  */
 	  public double getX() {return x;}
 	  
 	  /**
 	   * Retorna o valor da ordenada
 	   *
 	   * @return ordenada
 	   */
 	   public double getY() {return y;}
 }