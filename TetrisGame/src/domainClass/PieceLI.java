package domainClass;

/**
 * Pe�a L Invertida.  
 * 
 */
public class PieceLI extends Piece {

	//Armazena o formato da pe�a.
	private Point[][] pieceLI;
	
	//Indica como � o formato para armazenar ap�s em PieceLI.
	private Point[][] pieceFormat =		
			{
				{ new Point(0, 1), new Point(1, 1), new Point(2, 1), new Point(2, 0) },
				{ new Point(1, 0), new Point(1, 1), new Point(1, 2), new Point(2, 2) },
				{ new Point(0, 1), new Point(1, 1), new Point(2, 1), new Point(0, 2) },
				{ new Point(1, 0), new Point(1, 1), new Point(1, 2), new Point(0, 0) }
			};
		
		

	/**
	 * Construtor de PieceLI.
	 */
	public PieceLI(){
		pieceLocation = new Point(5, 1);
		setPieceLI(pieceFormat); 	
	}


	/**
	 * @return the pieceLI.
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


	/**
	 * Retorna as coordenadas da pe�a.
	 */
	@Override
	public Point[][] getPieceCoordinates() {
		return pieceLI;
	}
}
