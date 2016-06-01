package domainClass;

/**
 * Classe que cria toda a lista de pe�as existentes do game.
 *
 */
public class PieceCollection {
	
	private Piece[] Pieces = {
			new PieceI(),
			new PieceL(),
			new PieceLI(),
			new PieceN(),
			new PieceNI(),
			new PieceSquare(),
			new PieceT()};
			
	private Piece[] AllPieces;
	
	public PieceCollection(){
		AllPieces = Pieces;
	}
	
	public Piece[] getList(){
		return AllPieces;
	}
	
	

}
