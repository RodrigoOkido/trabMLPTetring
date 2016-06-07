package domainClass;

/**
 * Peça T.
 *
 */
public class PieceT extends Piece{

	//Armazena o formato da peça.
	private Point[][] pieceT;
	
	//Indica como é o formato para armazenar após em PieceT.
	private Point[][] pieceFormat =		
			{
				{ new Point(1, 0), new Point(0, 1), new Point(1, 1), new Point(2, 1) },
				{ new Point(1, 0), new Point(0, 1), new Point(1, 1), new Point(1, 2) },
				{ new Point(0, 1), new Point(1, 1), new Point(2, 1), new Point(1, 2) },
				{ new Point(1, 0), new Point(1, 1), new Point(2, 1), new Point(1, 2) }
			};
		
		
	/**
	 * Construtor de PieceT.
	 */
	public PieceT(){
		pieceLocation = new Point(5, 1);
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


	/**
	 * Retorna as coordenadas da peça.
	 */
	@Override
	public Point[][] getPieceCoordinates() {
		return pieceT;
	}
}
