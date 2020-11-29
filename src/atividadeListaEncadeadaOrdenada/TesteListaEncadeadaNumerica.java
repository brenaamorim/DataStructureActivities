package atividadeListaEncadeadaOrdenada;

public class TesteListaEncadeadaNumerica {

	public static void main(String[] args) {

		TADListaEncadeada<Integer> listaEncadeada = new ListaEncadeada<Integer>();
				
		listaEncadeada.removeValor(4);
		listaEncadeada.imprimeLista();
		
		listaEncadeada.insereInicio(8);
		listaEncadeada.imprimeLista();
		
		listaEncadeada.insereInicio(6);
		listaEncadeada.imprimeLista();
				
		listaEncadeada.inserePosicao(2, 0);
		listaEncadeada.imprimeLista();
		
		listaEncadeada.insereOrdenado(4);
		listaEncadeada.imprimeLista();
		
		listaEncadeada.insereOrdenado(10);
		listaEncadeada.imprimeLista();
	

	}

}
