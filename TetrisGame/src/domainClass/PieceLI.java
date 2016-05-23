package domainClass;

/**
 * Peça L Invertida.  
 * 
 *
 */
public class PieceLI extends Piece {

	private Point[][] pieceLI;
	private Point[][] pieceFormat =		
			{
				{ new Point(0, 1), new Point(1, 1), new Point(2, 1), new Point(2, 0) },
				{ new Point(1, 0), new Point(1, 1), new Point(1, 2), new Point(2, 2) },
				{ new Point(0, 1), new Point(1, 1), new Point(2, 1), new Point(0, 2) },
				{ new Point(1, 0), new Point(1, 1), new Point(1, 2), new Point(0, 0) }
			};
		
		

	public PieceLI(){
		setPieceLI(pieceFormat); 	
	}


	/**
	 * @return the pieceLI
	 */
	public Point[][] getPieceLI() {
		return pieceLI;
	}


	/**
	 * @param pieceLI the pieceLI to set
	 */
	public void setPieceLI(Point[][] pieceLI) {
		this.pieceLI = pieceLI;
	}


	@Override
	public Point[][] getPieceCoordinates() {
		return pieceLI;
	}
}
