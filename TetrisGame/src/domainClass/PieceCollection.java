package domainClass;

import Interfaces.Collection;

/**
 * Classe que cria toda a lista de pe�as existentes do game.
 * Implementa a interface Collection, que generaliza receber 
 * qualquer tipo de lista para associar. Neste caso ser�o Pe�as.
 *
 */
public class PieceCollection implements Collection<Piece> {
	
	
	//numero de Pe�as caso
	private int pieceNumbers;
	
	
	//Vetor com todas as Pe�as do game.
	private Piece[] Pieces = {
			new PieceI(),
			new PieceL(),
			new PieceLI(),
			new PieceN(),
			new PieceNI(),
			new PieceSquare(),
			new PieceT()};
			
	//Vetor que recebe todas as pe�as.
	private Piece[] AllPieces;
	
	
	/**
	 * Construtor Padr�o. Recebe o n�mero de Pe�as
	 * padr�o vindo da lista de pe�as. (Atributo Piece[] Pieces)
	 */
	public PieceCollection(){
		AllPieces = Pieces;
	}
	
	
	/**
	 * Construtor parametrizado de PieceCollection. 
	 * 
	 * @param n Recebe um numero que ser� o numero de pe�as.
	 */
	public PieceCollection(int n){
		pieceNumbers = n;
		AllPieces = new Piece[pieceNumbers];
	}
	
	
	/**
	 * Retorna o numero de pe�as da lista.
	 * 
	 * @return Retorna este numero.
	 */
	public int getPieceNumbers(){
		return pieceNumbers;
	}
	
	/**
	 * Modifica o numero de pe�as.
	 * 
	 * @param p Recebe um numero.
	 */
	public void setPieceNumbers(int p){
		pieceNumbers = p;
	}
	
	
	/**
	 * Retorna o vetor com todas pe�as.
	 */
	public Piece[] getList(){
		return AllPieces;
	}
	
	/**
	 * Associa uma lista de pe�as a uma outra lista maior de pe�as. 
	 * Ideal para casos que � desejado aumentar o n�mero de pe�as
	 * por exemplo.
	 * 
	 * @return Retorna true se a lista for maior que a lista rece-
	 * bida por par�metro. False caso contr�rio.
	 */
	public boolean associateList(Piece[] list){
		if (pieceNumbers >= list.length){
			for (int i = 0; i < Pieces.length; i++) {
				list[i] = AllPieces[i];
				return true;
			}
		} 
		return false;
			
	}
}
	
	

