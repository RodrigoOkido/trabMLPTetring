package domainClass;

import java.awt.Color;

import tetrisInterface.Grid;

/**
 * Classe abstrata Peça. É uma classe abstrata com todos os dados necessários 
 * para a formação de uma peça dentro do game Tetris.
 * 
 *
 */
public abstract class Piece {
	
	//Localização do Ponto da peça. Neste atributo é também definido 
	//onde a peça começará caindo dentro do grid.
	protected Point pieceLocation;
	
	//Rotação de uma peça. Começa na rotação Padrão.
	protected int rotation = 0;
	
	
	//Determinação de uma cor a peça
	protected static final Color[] pieceColors = {Color.BLUE,Color.YELLOW, Color.PINK, Color.GREEN
			,Color.RED, Color.ORANGE, Color.WHITE};
	
	
	
	/**
	 * Retorna a lista cores das peças.
	 * 
	 * @return pieceColors
	 */
	public static Color[] getPieceColors() {
		return pieceColors;
	}
	
	
	/**
	 * Desce a peça dentro do grid. Pega a coordenada Y e incrementa em 1.
	 * 
	 */
	public void dropPiece(){
		pieceLocation.setPositionY(pieceLocation.getPositionY()+1);
	}
	
	
	/**
	 * Retorna a localização atual da peça. 
	 * 
	 * @return Retorna a localização.
	 */
	public Point getPieceLocation(){
		return pieceLocation;
	}

	
	/**
	 * Responsável por retornar as coordenadas das peças. Retorna 
	 * uma lista de listas contendo todos os pontos de cada peça.
	 * Inclui a original e as rotacionadas. 
	 * 
	 * @return Retorna uma lista de lista de pontos.
	 */
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
	 * Método responsável pela rotação da peça. Somando r recebida por parâmetro 
	 * com a rotação atual, este resultado é dividido por 4 e o resto gravado em
	 * newRotation. Isto permite que apenas 4 resultados sejam dados [0-4]. Cada
	 * valor corresponde a uma rotação. (0 - original, 1 - rotacionado 90°, 2 -
	 * 180°, 3 - 270, 4 - 360°)
	 * 
	 * @param r Recebe um inteiro que determinará a rotação.
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
	 * Método responsável por mover uma peça qualquer dentro do grid. Permite que
	 * a peça seja movimentada ou para a esquerda ou para a direita. Recebe um pa-
	 * râmetro que será somado a coordenada X da peça dentro do grid.
	 * 
	 * @param deslocamento Recebe um valor inteiro para determinar o deslocamento da peça.
	 */
	public void movePiece(int deslocamento) {
		if (!Grid.collidesAtSomething(getPieceLocation().getPositionX() + deslocamento, getPieceLocation().getPositionY(), rotation)) {
			getPieceLocation().setPositionX(getPieceLocation().getPositionX()+deslocamento);	
			}
	}

	

	/**
	 * Método para parar uma peça. Este método apenas mantém atualizando a peça 
	 * com a última posição Y que a peça tinha.
	 */
	public void stopPiece() {
		pieceLocation.setPositionY(pieceLocation.getPositionY());	
	}
	

}
