package domainClass;

/**
 * Peça I. 
 *
 */
public class PieceI extends Piece{
	
	//Armazena o formato da peça.
	private Point[][] pieceI;
	
	//Indica como é o formato para armazenar após em PieceI.
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
	 * Retorna as coordenadas da peça.
	 */
	@Override
	public Point[][] getPieceCoordinates() {
		return pieceI;
	}

	
	

}
