package atividadeListaDuplamenteEncadeada;

public class ListaDuplamenteEncadeada<T> implements TADListaDuplamenteEncadeada<T> {

	private No<T> header;
	private No<T> trailer;
	private int tamanho;
	
	public ListaDuplamenteEncadeada() {
		header = new No<T>(null, null, null);
		trailer = new No<T>(header, null, null);
		
		header.setPosterior(trailer);
		tamanho = 0;
	}
	
	
	@Override
	public void insereValor(T valor, int posicao) {
		
		//Realiza as valida��es
		if (posicao < 1 || posicao > tamanho + 1) {
			System.out.println("Posi��o inv�lida para inser��o: " + posicao);
			return;
		}
		
		No<T> noAnteriorInsercao = header;

		if (posicao <= (tamanho/2)) {
			for(int i = 1; i < posicao; i++) {
				noAnteriorInsercao = noAnteriorInsercao.getPosterior();
			}
		}
		else {
			noAnteriorInsercao = trailer;
			for(int i = (tamanho + 1); i >= posicao; i--) {
				noAnteriorInsercao = noAnteriorInsercao.getAnterior();
			}
		}
		
		No<T> novoNo = new No<T>(noAnteriorInsercao, valor, null);
		
		novoNo.setPosterior(noAnteriorInsercao.getPosterior());
		novoNo.getPosterior().setAnterior(novoNo);
		
		noAnteriorInsercao.setPosterior(novoNo);
		
		tamanho++;
	}

	@Override
	public T removeValor(int posicao) {
		
		//Realiza valida��es
		if (posicao < 1 || posicao > tamanho) {
			System.out.println("Posi��o inv�lida para remo��o: " + posicao);
			return null;
		}
		
		No<T> noAnteriorRemocao = header;

		if (posicao <= (tamanho/2)) {
			for(int i = 1; i < posicao; i++) {
				noAnteriorRemocao = noAnteriorRemocao.getPosterior();
			}
		}
		else {
			noAnteriorRemocao = trailer;
			for(int i = (tamanho + 1); i >= posicao; i--) {
				noAnteriorRemocao = noAnteriorRemocao.getAnterior();
			}
		}
		
		No<T> noRemovido = noAnteriorRemocao.getPosterior();
		
		noAnteriorRemocao.setPosterior(noRemovido.getPosterior());
		noRemovido.getPosterior().setAnterior(noAnteriorRemocao);
		
		noRemovido.setAnterior(null);
		noRemovido.setPosterior(null);
		
		tamanho--;
		
		return noRemovido.getValor();
	}

	@Override
	public boolean listaVazia() {
		if (header.getPosterior().equals(trailer)) {
			return true;
		}
		return false;
	}

	@Override
	public void imprimeLista() {
		if (listaVazia()) {
			System.out.println("Lista Vazia. N�o h� elementos para impress�o.");
			return;
		}
		
		No<T> auxiliar = header;
		while(auxiliar != null) {
			System.out.print(auxiliar.getValor() + " <=> ");
			auxiliar = auxiliar.getPosterior();
		}
		System.out.println();

	}

}