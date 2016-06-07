package domainClass;

/**
 * Pe�a T.
 *
 */
public class PieceT extends Piece{

	//Armazena o formato da pe�a.
	private Point[][] pieceT;
	
	//Indica como � o formato para armazenar ap�s em PieceT.
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
	 * Retorna as coordenadas da pe�a.
	 */
	@Override
	public Point[][] getPieceCoordinates() {
		return pieceT;
	}
}
