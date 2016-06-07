package domainClass;



/**
 * Peça N.
 *
 */
public class PieceN extends Piece{

	//Armazena o formato da peça.
	private Point[][] pieceN;
	
	//Indica como é o formato para armazenar após em PieceN.
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
	 * Retorna as coordenadas da peça.
	 */
	@Override
	public Point[][] getPieceCoordinates() {
		return pieceN;
	}
}
