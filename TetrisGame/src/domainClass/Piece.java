package domainClass;

import java.awt.Color;

/**
 * Classe abstrata Pe�a. � uma classe abstrata com todos os dados necess�rios 
 * para a forma��o de uma pe�a dentro do game Tetris.
 * 
 *
 */
public abstract class Piece {
	
	//Localiza��o do Ponto inicial da pe�a
	private Point pieceLocation;
	
	//Rota��o de uma pe�a
	private int rotation;
	
	
	//Determina��o de uma cor a pe�a
	private static final Color[] pieceColors = {Color.BLUE,Color.YELLOW, Color.PINK, Color.GREEN
			,Color.RED};
	
	
	/**
	 * Desce a pe�a dentro do grid. Pega a coordenada Y e incrementa em 1.
	 * 
	 */
	public void descerPeca(){
		pieceLocation.setPositionY(pieceLocation.getPositionY()+1);
	}

	
	public abstract Point[][] getPieceCoordinates();
	
	
	/**
	 * Retorna a rota��o de uma pe�a.
	 * 
	 * @return A rota��o da pe�a.
	 */
	public int getRotation() {
		return rotation;
	}


	/**
	 * Modifica a rota��o de uma pe�a.
	 * 
	 * @param rotation Um inteiro para rotacionar a pe�a.
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
