package domainClass;



/**
 * Peça Quadrada.
 *
 */
public class PieceSquare extends Piece{

	private Point[][] pieceSquare;
	private Point[][] pieceFormat =		
			{
				{ new Point(0, 0), new Point(0, 1), new Point(1, 0), new Point(1, 1) },
				{ new Point(0, 0), new Point(0, 1), new Point(1, 0), new Point(1, 1) },
				{ new Point(0, 0), new Point(0, 1), new Point(1, 0), new Point(1, 1) },
				{ new Point(0, 0), new Point(0, 1), new Point(1, 0), new Point(1, 1) }
			};
		
		

	public PieceSquare(){
		setPieceSquare(pieceFormat); 	
	}


	/**
	 * @return the pieceSquare
	 */
	public Point[][] getPieceSquare() {
		return pieceSquare;
	}


	/**
	 * @param pieceSquare the pieceSquare to set
	 */
	public void setPieceSquare(Point[][] pieceSquare) {
		this.pieceSquare = pieceSquare;
	}


	@Override
	public Point[][] getPieceCoordinates() {
		return pieceSquare;
	}
}
