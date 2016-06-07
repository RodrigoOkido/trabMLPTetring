package domainClass;

/**
 * Pe�a L.
 *
 */
public class PieceL extends Piece {

		//Armazena o formato da pe�a.
		private Point[][] pieceL;
		
		//Indica como � o formato para armazenar ap�s em PieceL.
		private Point[][] pieceFormat =		
				{
					{ new Point(0, 1), new Point(1, 1), new Point(2, 1), new Point(2, 2) },
					{ new Point(1, 0), new Point(1, 1), new Point(1, 2), new Point(0, 2) },
					{ new Point(0, 1), new Point(1, 1), new Point(2, 1), new Point(0, 0) },
					{ new Point(1, 0), new Point(1, 1), new Point(1, 2), new Point(2, 0) }
				};
			
			
		/**
		 * Construtor de PieceL.
		 */
		public PieceL(){
			pieceLocation = new Point(5, 1);
			setPieceL(pieceFormat); 	
		}


		/**
		 * @return the pieceL
		 */
		public Point[][] getPieceL() {
			return pieceL;
		}


		/**
		 * @param pieceL the pieceL to set
		 */
		public void setPieceL(Point[][] pieceL) {
			this.pieceL = pieceL;
		}

		/**
		 * Retorna as coordenadas da pe�a.
		 */
		@Override
		public Point[][] getPieceCoordinates() {
			return pieceL;
		}
}


