package domainClass;


/**
 * Peça N Invertida.
 *
 */
public class PieceNI extends Piece{

	private Point[][] pieceNI;
	private Point[][] pieceFormat =		
			{
				{ new Point(0, 1), new Point(1, 1), new Point(2, 1), new Point(2, 0) },
				{ new Point(1, 0), new Point(1, 1), new Point(1, 2), new Point(2, 2) },
				{ new Point(0, 1), new Point(1, 1), new Point(2, 1), new Point(0, 2) },
				{ new Point(1, 0), new Point(1, 1), new Point(1, 2), new Point(0, 0) }
			};
		
		

	public PieceNI(){
		setPieceNI(pieceFormat); 	
	}


	/**
	 * @return the pieceLI
	 */
	public Point[][] getPieceNI() {
		return pieceNI;
	}


	/**
	 * @param pieceLI the pieceLI to set
	 */
	public void setPieceNI(Point[][] pieceNI) {
		this.pieceNI = pieceNI;
	}


	@Override
	public Point[][] getPieceCoordinates() {
		return pieceNI;
	}
}
