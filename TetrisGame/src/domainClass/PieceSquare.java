package domainClass;



/**
 * Pe�a Quadrada.
 *
 */
public class PieceSquare extends Piece{

	//Armazena o formato da pe�a.
	private Point[][] pieceSquare;
	
	//Indica como � o formato para armazenar ap�s em PieceSquare.
	private Point[][] pieceFormat =		
			{
				{ new Point(0, 0), new Point(0, 1), new Point(1, 0), new Point(1, 1) },
				{ new Point(0, 0), new Point(0, 1), new Point(1, 0), new Point(1, 1) },
				{ new Point(0, 0), new Point(0, 1), new Point(1, 0), new Point(1, 1) },
				{ new Point(0, 0), new Point(0, 1), new Point(1, 0), new Point(1, 1) }
			};
		
		
	/**
	 * Construtor de PieceSquare.
	 */
	public PieceSquare(){
		pieceLocation = new Point(5, 1);
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


	/**
	 * Retorna as coordenadas da pe�a.
	 */
	@Override
	public Point[][] getPieceCoordinates() {
		return pieceSquare;
	}
}
