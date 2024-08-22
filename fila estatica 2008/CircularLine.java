public class CircularLine {
    // Atributos da classe
    private int tamanho;  // Número de elementos na fila
    private int qntd;     // Capacidade máxima da fila
    private Object[] fila; // Array que armazena os elementos da fila
    private int base;     // Índice onde o próximo elemento será inserido
    private int topo;     // Índice do próximo elemento a ser removido

    public CircularLine(int qntd){
        this.fila = new Object[qntd];
        this.tamanho = 0;
        this.qntd = qntd;
        this.base = 0;
        this.topo = 0;
    }

    // Verifica se a fila está vazia
    public boolean isEmpty(){
        if(tamanho == 0){ // Se o tamanho é 0, a fila está vazia
            return true;
        }
        return false;
    }

    // Verifica se a fila está cheia
    public boolean isFull(){
        if(tamanho == qntd){ // Se o tamanho é igual à capacidade máxima, a fila está cheia
            return true;
        }
        return false;
    }

    // Adiciona um elemento na fila
    public void add(int valor){
        if(isFull()){ // Verifica se a fila está cheia
            System.out.println("A fila está cheia!");
            return; // Não adiciona o elemento se a fila estiver cheia
        }
        fila[base] = valor; // Insere o valor no índice base
        tamanho++; // Incrementa o tamanho da fila
        //O módulo faz com que, quando base atinge o valor qntd, ele se torne 0 novamente,
        //reiniciando o ciclo do índice dentro dos limites do array.
        base = (base + 1) % qntd;
    }

    // Remove um elemento da fila
    public void remove(){
        if(isEmpty()){ // Verifica se a fila está vazia
            System.out.println("A fila está vazia!");
            return; // Não remove nada se a fila estiver vazia
        }
        tamanho--; // Decrementa o tamanho da fila
        topo = (topo + 1) % qntd; // Atualiza o índice topo com comportamento circular
    }

    // Limpa a fila, redefinindo todos os atributos e o array
    public void clear() {
        this.base = 0; // Redefine o índice base para 0
        this.topo = 0; // Redefine o índice topo para 0
        this.tamanho = 0; // Redefine o tamanho para 0, esvaziando a fila
        for (int i = 0; i < qntd; i++) {
            fila[i] = null; // Define cada elemento como null, limpando o array
        }
    }

    // Imprime os elementos da fila
    public void print() {
        if (isEmpty()) { // Verifica se a fila está vazia
            System.out.println("Sua fila está vazia!");
            System.out.println("Fila: []"); // Imprime que a fila está vazia
            return;
        }

        System.out.print("Fila: ");
        System.out.print("[");
        for (int i = 0; i < tamanho; i++) { // Itera sobre os elementos na fila
            System.out.print(fila[(topo + i) % qntd]); // Imprime o elemento considerando o comportamento circular
            if (i < tamanho - 1) { // Adiciona uma vírgula entre os elementos, exceto no último
                System.out.print(", ");
            }
        }
        System.out.println("]"); // Fecha a impressão da fila
    }
}

