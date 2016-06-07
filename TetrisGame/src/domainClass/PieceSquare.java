package domainClass;



/**
 * Peça Quadrada.
 *
 */
public class PieceSquare extends Piece{

	//Armazena o formato da peça.
	private Point[][] pieceSquare;
	
	//Indica como é o formato para armazenar após em PieceSquare.
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
	 * Retorna as coordenadas da peça.
	 */
	@Override
	public Point[][] getPieceCoordinates() {
		return pieceSquare;
	}
}
