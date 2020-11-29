package atividadeListaEstatica;

/**
 * TAD Lista
 */
public interface Lista<E> {

	/** Operações básicas */
	public abstract E set(int pos, E e);
	
	public abstract void addPrimeiro(E e);
	public abstract void addUltimo(E e);
	
	public abstract void addAntes(int pos, E e);
	public abstract void addApos(int pos, E e);
	
	public abstract void removeValor(E e);
	public abstract void removePosicao(int pos);
	
	/** Operações auxiliares */
	public abstract E first();
	public abstract E last();

	public abstract E anterior(int pos);
	public abstract E posterior(int pos);
	
	public boolean listaCheia();
	public boolean listaVazia();
	public void imprimeLista();

}
