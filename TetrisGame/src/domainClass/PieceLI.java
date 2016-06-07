package domainClass;

/**
 * Peça L Invertida.  
 * 
 */
public class PieceLI extends Piece {

	//Armazena o formato da peça.
	private Point[][] pieceLI;
	
	//Indica como é o formato para armazenar após em PieceLI.
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
	 * Retorna as coordenadas da peça.
	 */
	@Override
	public Point[][] getPieceCoordinates() {
		return pieceLI;
	}
}
