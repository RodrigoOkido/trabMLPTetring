package domainClass;

import java.awt.Color;

/**
 * Classe abstrata Peca. e uma classe abstrata com todos os dados necessarios 
 * para a formacao de uma peca dentro do game Tetris.
 */
public abstract class Piece {
	
	
	private Point pieceLocation;	//Localizacao do Ponto inicial da peca
	private RotationState rotation;		//estado de rotacao de uma peca
	public Color[][] pieceGrid = new Color[4][4];
	
	
	public Point getPieceLocation() {
		return pieceLocation;
	}
	public void setPieceLocation(Point pieceLocation) {
		this.pieceLocation = pieceLocation;
	}
	public RotationState getRotation() {
		return rotation;
	}
	public void setRotation(RotationState rotation) {
		this.rotation = rotation;
	}
	
	abstract public void dropPiece();	//funcao para descer a peca
	abstract public boolean canStepDown();	//verifica no grid se a peca atingiu limite. Nao pode mais descer
	
		

}
