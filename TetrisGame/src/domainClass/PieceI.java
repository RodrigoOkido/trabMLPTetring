package domainClass;

import java.awt.Color;

/**
 * Peca I. 
 */
public class PieceI extends Piece{
	
	public PieceI(){
		
		this.pieceGrid[0] = new Color[]{Color.black,Color.BLACK,Color.black,Color.BLACK}; 
		this.pieceGrid[1] = new Color[]{Color.black,Color.blue,Color.black,Color.BLACK};
		this.pieceGrid[2] = new Color[]{Color.blue,Color.blue,Color.blue,Color.BLACK};
		this.pieceGrid[3] = new Color[]{Color.black,Color.BLACK,Color.black,Color.BLACK};
		
		this.setRotation(RotationState.NONROTATED);
		this.setPieceLocation(new Point(7, 0));
	}

	@Override
	public void dropPiece() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean canStepDown() {
		// TODO Auto-generated method stub
		return false;
	}
	
	



}
