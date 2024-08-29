public class ListaEstatica {

    private Object[] lista;
    private int tamanho;
    private int capacidade;

    public ListaEstatica(int capacidade){
        this.tamanho = 0;
        this.lista = new Object[capacidade];
        this.capacidade = capacidade;
    }

    public boolean isFull(){
        return tamanho == capacidade;
    }
    public boolean isEmpty(){
        return tamanho == 0;
    }
    public void add(int valor){
        if (isFull()){
            System.out.println("Sua lista está cheia!");
            return;
        }
        this.lista[tamanho-1]=valor;
    }
    
}
