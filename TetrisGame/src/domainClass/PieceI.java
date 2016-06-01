package domainClass;

import java.awt.Color;

/**
 * Peca I. 
 */
public class PieceI extends Piece{
	
	public PieceI(){
		
		this.pieceGrid[0] = new Color[]{Color.BLACK,Color.blue,Color.BLACK,Color.BLACK}; 
		this.pieceGrid[1] = new Color[]{Color.BLACK,Color.blue,Color.BLACK,Color.BLACK};
		this.pieceGrid[2] = new Color[]{Color.BLACK,Color.blue,Color.BLACK,Color.BLACK};
		this.pieceGrid[3] = new Color[]{Color.BLACK,Color.blue,Color.BLACK,Color.BLACK};
		
		this.setRotation(RotationState.NONROTATED);//estado inicial da peca eh sem rotacao
		this.setPieceLocation(new Point((Grid.COLUMNS/2)-2, 0));//seta a posicao da peca no centro
	}

	@Override
	public void dropPiece() {
		// TODO Auto-generated method stub
		if(canStepDown())	//y++
			setPieceLocation(new Point(getPieceLocation().getPositionX(), 
					getPieceLocation().getPositionY()+1));
		
	}

	@Override
	public boolean canStepDown() {	//verifica se a peca pode descer sem colidir no grid
		// TODO Auto-generated method stub
		for (int i = 3; i > 0; i--) {
			for(int j = 0; j < 4; j++) {
				if((pieceGrid[i][j] != Color.BLACK) &&(Grid.gridMap[getPieceLocation().getPositionY()+i+1]
						[getPieceLocation().getPositionX()+j] != Color.BLACK))return false;
			}
		}
		
		return true;
	}
	
	



}
