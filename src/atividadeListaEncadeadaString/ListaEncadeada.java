package atividadeListaEncadeadaString;

public class ListaEncadeada<T> implements TADListaEncadeada<T> {

	private No<T> cabeca;
	private int tamanho;
	private int numResultados = 0;

	public ListaEncadeada() {
		cabeca = null;
		tamanho = 0;
	}


	@Override
	public void insereInicio(T valor) {
		No<T> novoNo = new No<T>(valor, null);

		if (cabeca == null) {
			cabeca = novoNo;
		} else {
			novoNo.setProximo(cabeca);
			cabeca = novoNo;
		}
		tamanho++;

	}

	@Override
	public void inserePosicao(T valor, int posicao) {

		//Verifica se a posi��o � v�lida
		if (posicao == 0) {
			insereInicio(valor);
			return;
		} else if (posicao == tamanho) {
			insereFinal(valor);
			return;
		} else if (posicao < 0 || posicao > tamanho) {
			System.out.println("Posi��o inv�lida " + posicao + " para inser��o.");
			return;
		}

		//Inserir no meio da lista
		No<T> novoNo = new No<T>(valor, null);

		No<T> noAnteriorInsercao = cabeca;
		for (int i = 0; i < posicao - 1; i++) {
			noAnteriorInsercao = noAnteriorInsercao.getProximo();
		}

		No<T> noPosteriorInsercao = noAnteriorInsercao.getProximo();
		noAnteriorInsercao.setProximo(novoNo);
		novoNo.setProximo(noPosteriorInsercao);

		tamanho++;
	}

	@Override
	public void insereFinal(T valor) {

		No<T> novoNo = new No<T>(valor, null);

		if (cabeca == null) {
			cabeca = novoNo;
		} else {
			getCauda().setProximo(novoNo);
		}
		tamanho++;
	}

	@Override
	public T removePosicao(int posicao) {

		//Verifica se a posi��o � v�lida
		if (posicao < 0 || posicao >= tamanho) {
			System.out.println("N� n�o removido. Posi��o inv�lida para remo��o");
			return null;
		}

		No<T> noAnteriorRemocao = cabeca;

		//Encontra o n� anterior ao n� que ser� removido
		for(int i = 0; i < posicao - 1; i++) {
			noAnteriorRemocao = noAnteriorRemocao.getProximo();
		}

		No<T> noRemovido = noAnteriorRemocao.getProximo();

		//Remove do inicio
		if (posicao == 0) {
			noRemovido = cabeca;
			cabeca = noRemovido.getProximo();
		} else {
			noAnteriorRemocao.setProximo(noRemovido.getProximo());
			noRemovido.setProximo(null);
		}
		tamanho--;

		return noRemovido.getValor();
	}

	@Override
	public T removeValor(T valor) {

		No<T> auxiliar = cabeca;
		No<T> noAnteriorRemocao = cabeca;
		No<T> noRemovido = null;
		int posicao = 0;

		//Percorre a lista em busca do valor dado
		while(auxiliar != null) {
            String str = (String) auxiliar.getValor();
			if (str.contains((CharSequence) valor)) {
				
				numResultados++;
				
				if (posicao == 1) {
					noAnteriorRemocao = cabeca;
				}
				else {
					//Encontra o n� anterior ao n� que ser� removido
					for(int i = 0; i < posicao - 1; i++) {
						noAnteriorRemocao = noAnteriorRemocao.getProximo();
					}
				}

				noRemovido = noAnteriorRemocao.getProximo();
				
				//Remove do inicio
				if (posicao == 0) {
					noRemovido = cabeca;
					cabeca = noRemovido.getProximo();
					auxiliar = auxiliar.getProximo();
					
				} else {
					noAnteriorRemocao.setProximo(noRemovido.getProximo());
					auxiliar = auxiliar.getProximo();
					noRemovido.setProximo(null);
				}
				
				posicao--;
				tamanho--;
			}
			else {
				auxiliar = auxiliar.getProximo();
			}
			
			posicao++;
		}
		
		if (numResultados == 0) {
			System.out.println("Elemento inv�lido, n�o consta na lista.");
			
			return null;
		}
		
		numResultados = 0;

		return noRemovido.getValor();	
	}

	@Override
	public boolean listaVazia() {
		if (cabeca == null) {
			return true;
		}
		return false;
	}

	@Override
	public void imprimeLista() {
		//Realiza valida��es
		if(listaVazia()) {
			System.out.println("Lista Vazia. N�o h� elementos para impress�o");
			return;
		}

		No<T> auxiliar = cabeca;

		while(auxiliar != null) {
			System.out.print(" => " + auxiliar.getValor());
			auxiliar = auxiliar.getProximo();
		}
		System.out.println();

	}

	public No<T> getCauda(){

		No<T> aux = cabeca;

		if (aux == null) {
			return null;
		}
		while (aux.getProximo() != null) {
			aux = aux.getProximo();
		}
		return aux;

	}

}

