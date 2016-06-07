package domainClass;

/**
 * Peça L.
 *
 */
public class PieceL extends Piece {

		//Armazena o formato da peça.
		private Point[][] pieceL;
		
		//Indica como é o formato para armazenar após em PieceL.
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
		 * Retorna as coordenadas da peça.
		 */
		@Override
		public Point[][] getPieceCoordinates() {
			return pieceL;
		}
}


