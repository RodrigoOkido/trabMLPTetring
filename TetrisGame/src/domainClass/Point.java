package domainClass;

/**
 * Classe Ponto. Esta classe ser� a respons�vel por criar os pontos dentro da coordenada
 * x e y no grid. Os pontos neste caso, corresponder�o as pe�as do game. Cada pe�a, ser� 
 * formada por diversos pontos. Por exemplo, a pe�a N poderia ser representada da seguinte 
 * forma:
 * 		  *
 *  	 **
 *		 *
 */
public class Point {
	
	
	//Atributos para configurar as coordenadas do eixo X e Y.
	private int positionX, positionY;
	
	
	/**
	 * Construtor da classe Ponto.
	 * 
	 * @param x Coordenada do eixo X
	 * @param y Coordenada do eixo Y
	 */
	public Point (int x, int y){
		positionX = x;
		positionY = y;
	}
	
	
	/**
	 * @return A PositionX
	 */
	public int getPositionX() {
		return positionX;
	}
	
	/**
	 * @return A positionY
	 */
	public int getPositionY() {
		return positionY;
	}


	/**
	 * Modifica a posi��o X do ponto.
	 * 
	 * @param positionX 
	 */
	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}
	
	
	/**
	 * Modifica a posi��o Y do ponto.
	 *  
	 * @param positionY 
	 */
	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}
	

	
}
