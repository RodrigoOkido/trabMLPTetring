package domainClass;

/**
 * Peça L.
 *
 */
public class PieceL extends Piece {

		private Point[][] pieceL;
		private Point[][] pieceFormat =		
				{
					{ new Point(0, 1), new Point(1, 1), new Point(2, 1), new Point(2, 2) },
					{ new Point(1, 0), new Point(1, 1), new Point(1, 2), new Point(0, 2) },
					{ new Point(0, 1), new Point(1, 1), new Point(2, 1), new Point(0, 0) },
					{ new Point(1, 0), new Point(1, 1), new Point(1, 2), new Point(2, 0) }
				};
			
			

		public PieceL(){
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


		@Override
		public Point[][] getPieceCoordinates() {
			return pieceL;
		}
}


