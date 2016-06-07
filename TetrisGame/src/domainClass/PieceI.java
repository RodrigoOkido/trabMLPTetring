package domainClass;

/**
 * Pe�a I. 
 *
 */
public class PieceI extends Piece{
	
	//Armazena o formato da pe�a.
	private Point[][] pieceI;
	
	//Indica como � o formato para armazenar ap�s em PieceI.
	private Point[][] pieceFormat =		
			{
				{ new Point(0, 1), new Point(1, 1), new Point(2, 1), new Point(3, 1) },
				{ new Point(1, 0), new Point(1, 1), new Point(1, 2), new Point(1, 3) },
				{ new Point(0, 1), new Point(1, 1), new Point(2, 1), new Point(3, 1) },
				{ new Point(1, 0), new Point(1, 1), new Point(1, 2), new Point(1, 3) }
			};
		
		
	/**
	 * Construtor de PieceI.
	 */
	public PieceI(){
		pieceLocation = new Point(5, 1);
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

	
	/**
	 * Retorna as coordenadas da pe�a.
	 */
	@Override
	public Point[][] getPieceCoordinates() {
		return pieceI;
	}

	
	

}
