public class ListaEstatica {

    private int[] lista;
    private int tamanho;
    private int capacidade;

    public ListaEstatica(int capacidade){
        this.tamanho = 0;
        this.lista = new int[capacidade];
        this.capacidade = capacidade;
    }

    public boolean isFull(){
        return tamanho == capacidade;
    }
    public boolean isEmpty(){
        return tamanho == 0;
    }
    public void addFim(int valor){
        if (isFull()){
            System.out.println("Sua lista está cheia!");
            return;
        }
        this.lista[tamanho-1]=valor;
    }
    public void add(int valor, int indice){
        if (lista[indice] != 0){
            ir(indice);
        }
        this.lista[indice] = valor;
    }
    public int tirar(int indice){
        if (lista[indice] != 0){
            int valor = lista[indice];
            voltar(indice);
            return valor;
        }
        return 0;
    }
    public void ir(int indice){
        if (!isFull() && indice < tamanho-1 && indice>=0){
            for (int i = tamanho; i > indice; i--){
                this.lista[i] =i-1;
            }
        }
    }
    public void voltar(int indice){
        if (!isFull() && indice < tamanho-1 && indice>=0){
            for (int i = tamanho; i > indice; i++){
                this.lista[i] =i+1;
            }
        }
    }
    public int encontrar(int valor) {
        for (int i = 0; i < tamanho - 1; i++) {
            if (valor == lista[i]) {
                return i;
            }
        }
        return 0;
    }
    public int getData(int indice){
        return lista[indice];
    }
}
