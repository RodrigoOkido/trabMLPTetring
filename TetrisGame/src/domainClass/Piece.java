package domainClass;

import java.awt.Color;

/**
 * Classe abstrata Peça. É uma classe abstrata com todos os dados necessários 
 * para a formação de uma peça dentro do game Tetris.
 * 
 *
 */
public abstract class Piece {
	
	//Localização do Ponto inicial da peça
	private Point pieceLocation;
	
	//Rotação de uma peça
	private int rotation;
	
	
	//Determinação de uma cor a peça
	private static final Color[] pieceColors = {Color.BLUE,Color.YELLOW, Color.PINK, Color.GREEN
			,Color.RED};
	
	
	/**
	 * Desce a peça dentro do grid. Pega a coordenada Y e incrementa em 1.
	 * 
	 */
	public void descerPeca(){
		pieceLocation.setPositionY(pieceLocation.getPositionY()+1);
	}

	
	public abstract Point[][] getPieceCoordinates();
	
	
	/**
	 * Retorna a rotação de uma peça.
	 * 
	 * @return A rotação da peça.
	 */
	public int getRotation() {
		return rotation;
	}


	/**
	 * Modifica a rotação de uma peça.
	 * 
	 * @param rotation Um inteiro para rotacionar a peça.
	 */
	public void setRotation(int rot) {
		rotation = rot;
	}


	/**
	 * Retorna a lista cores.
	 * 
	 * @return pieceColors
	 */
	public static Color[] getPieceColors() {
		return pieceColors;
	}
	
	
	

}
