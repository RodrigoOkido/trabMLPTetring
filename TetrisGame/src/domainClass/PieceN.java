package domainClass;



/**
 * Peça N.
 *
 */
public class PieceN extends Piece{

	private Point[][] pieceN;
	private Point[][] pieceFormat =		
			{
				{ new Point(0, 0), new Point(1, 0), new Point(1, 1), new Point(2, 1) },
				{ new Point(1, 0), new Point(0, 1), new Point(1, 1), new Point(0, 2) },
				{ new Point(0, 0), new Point(1, 0), new Point(1, 1), new Point(2, 1) },
				{ new Point(1, 0), new Point(0, 1), new Point(1, 1), new Point(0, 2) }
			};
		
		

	public PieceN(){
		setPieceN(pieceFormat); 	
	}


	/**
	 * @return the pieceLI
	 */
	public Point[][] getPieceN() {
		return pieceN;
	}


	/**
	 * @param pieceLI the pieceLI to set
	 */
	public void setPieceN(Point[][] pieceN) {
		this.pieceN = pieceN;
	}


	@Override
	public Point[][] getPieceCoordinates() {
		return pieceN;
	}
}
