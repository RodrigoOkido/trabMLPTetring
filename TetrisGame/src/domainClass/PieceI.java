package domainClass;

/**
 * Peça I. 
 *
 */
public class PieceI extends Piece{
	
	private Point[][] pieceI;
	private Point[][] pieceFormat =		
			{
				{ new Point(0, 1), new Point(1, 1), new Point(2, 1), new Point(3, 1) },
				{ new Point(1, 0), new Point(1, 1), new Point(1, 2), new Point(1, 3) },
				{ new Point(0, 1), new Point(1, 1), new Point(2, 1), new Point(3, 1) },
				{ new Point(1, 0), new Point(1, 1), new Point(1, 2), new Point(1, 3) }
			};
		
		

	public PieceI(){
		setPieceI(pieceFormat); 	
	}


	/**
	 * @return the pieceI
	 */
	public Point[][] getPieceI() {
		return pieceI;
	}


	/**
	 * @param pieceI the pieceI to set
	 */
	public void setPieceI(Point[][] pieceI) {
		this.pieceI = pieceI;
	}


	@Override
	public Point[][] getPieceCoordinates() {
		return pieceI;
	}

	
	

}
