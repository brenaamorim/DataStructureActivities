package atividadeListaEstatica;

public class TesteLista {
	
	public static void main (String[] args) {
		ListaImplementada<Integer> lista = new ListaImplementada<Integer>(5);
		
        lista.set(2,4);
        lista.imprimeLista();
        
        lista.addPrimeiro(2);
        lista.imprimeLista();
        
        lista.addPrimeiro(3);
        lista.imprimeLista();

        lista.addUltimo(0);
        lista.imprimeLista();

        lista.addApos(1, 1);
        lista.imprimeLista();
        
        lista.addAntes(1, 4);
        lista.imprimeLista();
        
        lista.set(4, 0);
        lista.imprimeLista();
        
        lista.removeValor(4);
        lista.imprimeLista();
        
        lista.removeValor(3);
        lista.imprimeLista();
        
        lista.removePosicao(1);
        lista.imprimeLista();
        
        lista.removePosicao(1);
        lista.imprimeLista();
        
        lista.removePosicao(0);
        lista.imprimeLista();
        
        lista.removePosicao(0);
        lista.imprimeLista();
        
	}

}
