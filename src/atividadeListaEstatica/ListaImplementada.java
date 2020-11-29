package atividadeListaEstatica;

public class ListaImplementada<E> implements Lista<E> {

	private E[] lista;
	private int posicao;	
	
	public ListaImplementada (int tamanho) {
		lista = (E[]) new Object[tamanho];
		posicao = -1;
	}
	
	@Override
	public E set(int pos, E e) {
		// Validações
		if(listaCheia()) {
			System.out.println("Lista cheia");
			return null;
		}
		
		if(pos > (lista.length - 1) || pos < 0 || pos > posicao) {
			System.out.println("Posição inválida.");
			return null;
		}
		
		// Deslocamento dos elementos pra direita
		for (int i = posicao; i >= (pos); i--) {
			lista [i + 1] = lista[i];
		}
		
		lista[pos] = e;
		++posicao;
		
		return e;
	}

	@Override
	public void addPrimeiro(E e) {
		// Validações
		if (listaCheia()) {
			System.out.println("Lista cheia");
			return;
		}
		
		// Deslocamento dos elementos pra direita
		for(int i = posicao; i >= 0; i--) {
			lista[i + 1] = lista[i];
		}
		
		lista[0] = e;
		++posicao;
	}

	@Override
	public void addUltimo(E e) {
		if (listaCheia()) {
			System.out.println("Lista cheia.");
			return;
		}

        lista[posicao + 1] = e;
        ++posicao;
	}

	@Override
	public void addAntes(int pos, E e) {
		// Validações
		if (listaCheia()) {
			System.out.println("Lista cheia.");
			return;
		}
		
		if (listaVazia()) {
			System.out.println("Lista vazia. Adicione o primeiro elemento.");
			return;
		}
		
		if (pos > (lista.length - 1) || pos < 0 || pos > posicao) {
			System.out.println("Posição inválida.");
			return;
		}
		
		// Deslocamento dos elementos pra direita
		for (int i = posicao; i >= (pos - 1); i--) {
			lista[i + 1] = lista[i];
		}
		
		lista[pos - 1] = e;
		++posicao;
	}

	@Override
	public void addApos(int pos, E e) {
		// Validações
		if (listaCheia()) {
			System.out.println("Lista cheia.");
			return;
		}
		
		if (listaVazia()) {
			System.out.println("Lista vazia. Adicione o primeiro elemento.");
			return;
		}
		
		if (pos > (lista.length - 1) || pos < 0 || pos > posicao) {
			System.out.println("Posição inválida.");
			return;
		}
		
		// Deslocamento dos elementos pra direita
		for (int i = posicao; i >= pos + 1; i--) {
			lista[i + 1] = lista[i];
		}
		
		lista[pos + 1] = e;
		++posicao;
	}

	@Override
	public void removeValor(E e) {
		// Validações
		if (listaVazia()) {
			System.out.println("Lista vazia. Adicione o primeiro elemento.");
			return;
		}
		
		for (int i = 0; i <= posicao; i++) {
			if (lista[i] == e) {
				int posRemovida = i;

				for (int indice = posRemovida; indice < posicao; indice++) {
					lista[indice] = lista[indice + 1];
				}
				
				lista[posicao--] = null;
			}
			
		}
		
		
		
	}

	@Override
	public void removePosicao (int pos) {
		// Validações
		if (listaVazia()) {
			System.out.println("Lista vazia. Adicione o primeiro elemento.");
			return;
		}
		
		if (pos > (lista.length - 1) || pos < 0 || pos > posicao) {
			System.out.println("Posição inválida.");
			return;
		}
		
		// Deslocamento dos elementos pra esquerda
		for (int i = pos; i < posicao; i++) {
			lista[i] = lista[i + 1];
		}
		
		lista[posicao--] = null;
	}

	@Override
	public E first() {
		return lista[0];
	}

	@Override
	public E last() {
		return lista[posicao];
	}

	@Override
	
	public E anterior(int pos) {
		// Validações		
		if (listaVazia()) {
			System.out.println("Lista vazia.");
			return null;
		}
		
		if (pos > (lista.length - 1) || pos < 0 || pos > posicao) {
			System.out.println("Posição inválida.");
			return null;
		}
		
		
		return lista[pos - 1];
	}

	@Override
	public E posterior(int pos) {
		// Validações		
		if (listaVazia()) {
			System.out.println("Lista vazia.");
			return null;
		}
		
		if (pos > (lista.length - 1) || pos < 0 || pos > posicao) {
			System.out.println("Posição inválida.");
			return null;
		}
		
		
		return lista[pos + 1];
	}

	@Override
	public boolean listaCheia() {
		if (posicao == lista.length - 1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean listaVazia() {
		if (posicao == -1) {
			return true;
		}
		return false;
	}

	@Override
	public void imprimeLista() {
		
		for (int i = 0; i <= posicao; i++) {
			System.out.print(lista[i] + "\t");
		}
		System.out.println();		
	}
	
}
