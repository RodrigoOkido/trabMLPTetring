package domainClass;



/**
 * Pe�a N.
 *
 */
public class PieceN extends Piece{

	//Armazena o formato da pe�a.
	private Point[][] pieceN;
	
	//Indica como � o formato para armazenar ap�s em PieceN.
	private Point[][] pieceFormat =		
			{
				{ new Point(0, 0), new Point(1, 0), new Point(1, 1), new Point(2, 1) },
				{ new Point(1, 0), new Point(0, 1), new Point(1, 1), new Point(0, 2) },
				{ new Point(0, 0), new Point(1, 0), new Point(1, 1), new Point(2, 1) },
				{ new Point(1, 0), new Point(0, 1), new Point(1, 1), new Point(0, 2) }
			};
		
		

	/**
	 * Construtor de PieceN.
	 */
	public PieceN(){
		pieceLocation = new Point(5, 1);
		setPieceN(pieceFormat); 	
	}


	/**
	 * @return the pieceLI
	 */
	public Point[][] getPieceN() {
		return pieceN;
	}


	/**
	 * @param pieceLI the pieceLI to set
	 */
	public void setPieceN(Point[][] pieceN) {
		this.pieceN = pieceN;
	}


	/**
	 * Retorna as coordenadas da pe�a.
	 */
	@Override
	public Point[][] getPieceCoordinates() {
		return pieceN;
	}
}
