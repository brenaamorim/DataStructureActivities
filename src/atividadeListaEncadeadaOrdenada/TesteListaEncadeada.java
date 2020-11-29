package atividadeListaEncadeadaOrdenada;

public class TesteListaEncadeada {

	public static void main(String[] args) {

		TADListaEncadeada<String> listaEncadeada = new ListaEncadeada<String>();
				
		listaEncadeada.removeValor("z");
		listaEncadeada.imprimeLista();
		
		listaEncadeada.insereInicio("c");
		listaEncadeada.imprimeLista();
		
		listaEncadeada.insereInicio("b");
		listaEncadeada.imprimeLista();
		
		listaEncadeada.insereInicio("xicara");
		listaEncadeada.imprimeLista();
		
		listaEncadeada.insereInicio("xampu");
		listaEncadeada.imprimeLista();
				
		listaEncadeada.inserePosicao("a", 0);
		listaEncadeada.imprimeLista();
		
		listaEncadeada.insereInicio("xadrez");
		listaEncadeada.imprimeLista();
		
		listaEncadeada.insereFinal("d");
		listaEncadeada.imprimeLista();
		
		listaEncadeada.insereFinal("x");
		listaEncadeada.imprimeLista();
		
		listaEncadeada.removeValor("x");
		listaEncadeada.imprimeLista();		

		listaEncadeada.removeValor("x");
		listaEncadeada.imprimeLista();

	}

}
