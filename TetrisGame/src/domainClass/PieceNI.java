package domainClass;


/**
 * Pe�a N Invertida.
 *
 */
public class PieceNI extends Piece{

	//Armazena o formato da pe�a.
	private Point[][] pieceNI;
	
	//Indica como � o formato para armazenar ap�s em PieceNI.
	private Point[][] pieceFormat =		
			{
				{ new Point(1, 0), new Point(2, 0), new Point(0, 1), new Point(1, 1) },
				{ new Point(0, 0), new Point(0, 1), new Point(1, 1), new Point(1, 2) },
				{ new Point(1, 0), new Point(2, 0), new Point(0, 1), new Point(1, 1) },
				{ new Point(0, 0), new Point(0, 1), new Point(1, 1), new Point(1, 2) }
			};
		
		

	/**
 	* Construtor de PieceNI. 
 	*/
	public PieceNI(){
		pieceLocation = new Point(5, 1);
		setPieceNI(pieceFormat); 	
	}


	/**
	 * @return the pieceLI
	 */
	public Point[][] getPieceNI() {
		return pieceNI;
	}


	/**
	 * @param pieceLI the pieceLI to set
	 */
	public void setPieceNI(Point[][] pieceNI) {
		this.pieceNI = pieceNI;
	}


	/**
	 * Retorna as coordenadas da pe�a.
	 */
	@Override
	public Point[][] getPieceCoordinates() {
		return pieceNI;
	}
}
