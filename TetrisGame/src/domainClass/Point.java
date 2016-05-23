package domainClass;

import java.awt.Color;


/**
 * Classe Ponto. Esta classe será a responsável por criar os pontos dentro da coordenada
 * x e y no grid. Os pontos neste caso, corresponderão as peças do game. Cada peça, será 
 * formada por diversos pontos. Por exemplo, a peça N poderia ser representada da seguinte 
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
	 * Modifica a posição X do ponto.
	 * 
	 * @param positionX 
	 */
	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}
	
	
	/**
	 * Modifica a posição Y do ponto.
	 *  
	 * @param positionY 
	 */
	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}
	

	
}
