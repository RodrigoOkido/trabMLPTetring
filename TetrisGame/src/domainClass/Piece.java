package domainClass;

import java.awt.Color;

import tetrisInterface.Grid;

/**
 * Classe abstrata Pe�a. � uma classe abstrata com todos os dados necess�rios 
 * para a forma��o de uma pe�a dentro do game Tetris.
 * 
 *
 */
public abstract class Piece {
	
	//Localiza��o do Ponto da pe�a. Neste atributo � tamb�m definido 
	//onde a pe�a come�ar� caindo dentro do grid.
	protected Point pieceLocation;
	
	//Rota��o de uma pe�a. Come�a na rota��o Padr�o.
	protected int rotation = 0;
	
	
	//Determina��o de uma cor a pe�a
	protected static final Color[] pieceColors = {Color.BLUE,Color.YELLOW, Color.PINK, Color.GREEN
			,Color.RED, Color.ORANGE, Color.WHITE};
	
	
	
	/**
	 * Retorna a lista cores das pe�as.
	 * 
	 * @return pieceColors
	 */
	public static Color[] getPieceColors() {
		return pieceColors;
	}
	
	
	/**
	 * Desce a pe�a dentro do grid. Pega a coordenada Y e incrementa em 1.
	 * 
	 */
	public void dropPiece(){
		pieceLocation.setPositionY(pieceLocation.getPositionY()+1);
	}
	
	
	/**
	 * Retorna a localiza��o atual da pe�a. 
	 * 
	 * @return Retorna a localiza��o.
	 */
	public Point getPieceLocation(){
		return pieceLocation;
	}

	
	/**
	 * Respons�vel por retornar as coordenadas das pe�as. Retorna 
	 * uma lista de listas contendo todos os pontos de cada pe�a.
	 * Inclui a original e as rotacionadas. 
	 * 
	 * @return Retorna uma lista de lista de pontos.
	 */
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
	 * M�todo respons�vel pela rota��o da pe�a. Somando r recebida por par�metro 
	 * com a rota��o atual, este resultado � dividido por 4 e o resto gravado em
	 * newRotation. Isto permite que apenas 4 resultados sejam dados [0-4]. Cada
	 * valor corresponde a uma rota��o. (0 - original, 1 - rotacionado 90�, 2 -
	 * 180�, 3 - 270, 4 - 360�)
	 * 
	 * @param r Recebe um inteiro que determinar� a rota��o.
	 */
	public void rotatePiece(int r){
		int newRotation = (rotation + r) % 4;
		if (newRotation < 0) {
			newRotation = 3;
		}
		if (!Grid.collidesAtSomething(getPieceLocation().getPositionX(), getPieceLocation().getPositionY(), newRotation)) {
			rotation = newRotation;
		}
	}


	/**
	 * M�todo respons�vel por mover uma pe�a qualquer dentro do grid. Permite que
	 * a pe�a seja movimentada ou para a esquerda ou para a direita. Recebe um pa-
	 * r�metro que ser� somado a coordenada X da pe�a dentro do grid.
	 * 
	 * @param deslocamento Recebe um valor inteiro para determinar o deslocamento da pe�a.
	 */
	public void movePiece(int deslocamento) {
		if (!Grid.collidesAtSomething(getPieceLocation().getPositionX() + deslocamento, getPieceLocation().getPositionY(), rotation)) {
			getPieceLocation().setPositionX(getPieceLocation().getPositionX()+deslocamento);	
			}
	}

	

	/**
	 * M�todo para parar uma pe�a. Este m�todo apenas mant�m atualizando a pe�a 
	 * com a �ltima posi��o Y que a pe�a tinha.
	 */
	public void stopPiece() {
		pieceLocation.setPositionY(pieceLocation.getPositionY());	
	}
	

}
