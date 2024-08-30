public class ListaEstatica {

    private int[] lista;
    private int tamanho;
    private int capacidade;

    public ListaEstatica(int capacidade) {
        this.tamanho = 0;
        this.lista = new int[capacidade];
        this.capacidade = capacidade;
    }

    public boolean isFull() {
        return tamanho == capacidade;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public void addFim(int valor) {
        if (isFull()) {
            System.out.println("Sua lista está cheia!");
            return;
        }
        this.lista[tamanho] = valor;
        tamanho++;
    }

    public void add(int valor, int indice) {
        if (indice < 0 || indice >= capacidade) {
            System.out.println("Índice fora dos limites!");
            return;
        }
        if (!isFull() && lista[indice] != 0) {
            ir(indice);
        }
        this.lista[indice] = valor;
        tamanho++;
    }

    public int tirar(int indice) {
        if (indice < 0 || indice >= tamanho) {
            System.out.println("Índice fora dos limites!");
            return 0;
        }
        int valor = lista[indice];
        voltar(indice);
        tamanho--;
        return valor;
    }

    public void ir(int indice) {
        if (indice < 0 || indice >= tamanho) {
            System.out.println("Índice fora dos limites!");
            return;
        }
        for (int i = tamanho; i > indice; i--) {
            this.lista[i] = this.lista[i - 1];
        }
    }

    public void voltar(int indice) {
        if (indice < 0 || indice >= tamanho - 1) {
            System.out.println("Índice fora dos limites!");
            return;
        }
        for (int i = indice; i < tamanho - 1; i++) {
            this.lista[i] = this.lista[i + 1];
        }
        this.lista[tamanho - 1] = 0;  // Limpa o último elemento
    }

    public int encontrar(int valor) {
        for (int i = 0; i < tamanho; i++) {
            if (valor == lista[i]) {
                return i;
            }
        }
        return -1;  // Retorna -1 se o valor não for encontrado
    }

    public int getData(int indice) {
        if (indice < 0 || indice >= tamanho) {
            System.out.println("Índice fora dos limites!");
            return -1;
        }
        return lista[indice];
    }

    public void imprimir() {
        if (isEmpty()) {
            System.out.println("A lista está vazia.");
            return;
        }
        System.out.print("Elementos da lista: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(lista[i] + " ");
        }
        System.out.println();
    }
}
