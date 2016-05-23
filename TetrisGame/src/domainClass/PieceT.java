package domainClass;

/**
 * Peça T.
 *
 */
public class PieceT extends Piece{

	private Point[][] pieceT;
	private Point[][] pieceFormat =		
			{
				{ new Point(1, 0), new Point(0, 1), new Point(1, 1), new Point(2, 1) },
				{ new Point(1, 0), new Point(0, 1), new Point(1, 1), new Point(1, 2) },
				{ new Point(0, 1), new Point(1, 1), new Point(2, 1), new Point(1, 2) },
				{ new Point(1, 0), new Point(1, 1), new Point(2, 1), new Point(1, 2) }
			};
		
		

	public PieceT(){
		setPieceT(pieceFormat); 	
	}


	/**
	 * @return the pieceT
	 */
	public Point[][] getPieceT() {
		return pieceT;
	}


	/**
	 * @param pieceLI the pieceLI to set
	 */
	public void setPieceT(Point[][] pieceT) {
		this.pieceT = pieceT;
	}


	@Override
	public Point[][] getPieceCoordinates() {
		return pieceT;
	}
}
