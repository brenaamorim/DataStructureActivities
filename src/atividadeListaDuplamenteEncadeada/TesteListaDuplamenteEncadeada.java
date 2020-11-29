package atividadeListaDuplamenteEncadeada;

public class TesteListaDuplamenteEncadeada {

	public static void main(String[] args) {
		
		TADListaDuplamenteEncadeada<Integer> lista = 
				new ListaDuplamenteEncadeada<Integer>(); 
		
		lista.imprimeLista();
		
		lista.insereValor(1, 0);
		lista.imprimeLista();
		
		lista.insereValor(0, 1);
		lista.imprimeLista();
		
		lista.insereValor(4, 2);
		lista.imprimeLista();
		
		lista.insereValor(6, 3);
		lista.imprimeLista();

		lista.insereValor(8, 4);
		lista.imprimeLista();
		
		lista.insereValor(10, 6);
		lista.imprimeLista();
		
		lista.insereValor(10, 5);
		lista.imprimeLista();

		// Inserção na primeira metade
		lista.insereValor(2, 2);
		lista.imprimeLista();
		
		// Inserção na segunda metade
		lista.insereValor(12, 7);
		lista.imprimeLista();
		
		lista.insereValor(14, 8);
		lista.imprimeLista();	
		
		System.out.println();
		
		lista.removeValor(0);
		lista.imprimeLista();

		// Remoção na primeira metade
		lista.removeValor(4);
		lista.imprimeLista();
		
		lista.removeValor(3);
		lista.imprimeLista();
		
		lista.removeValor(2);
		lista.imprimeLista();
		
		lista.removeValor(1);
		lista.imprimeLista();
		
		// Remoção na segunda metade
		lista.removeValor(4);
		lista.imprimeLista();
		
		lista.removeValor(3);
		lista.imprimeLista();
		
		lista.removeValor(2);
		lista.imprimeLista();
		
		lista.removeValor(1);
		lista.imprimeLista();
		
	}
	
}
