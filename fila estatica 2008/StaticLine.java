public class StaticLine {
    private Object[] fila;
    //para a qntd de elementos que podem ter na fila
    private int qntd;
    //para o numero de elementos que tem na fila
    private int tamanho;

    public StaticLine(int qntd){
        this.qntd = qntd;
        this.tamanho = 0;
        this.fila = new Object[qntd];
    }

    public boolean isEmpty(){
        if (tamanho == 0){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if (tamanho == qntd){
            System.out.println("Sua fila está cheia!");
            return true;
        }
        return false;
    }

    //adiciona um novo valor ao final da fila
    public void add(int valor) {
        if (isFull()) {
            System.out.println("Não é possível adicionar!");
            return;
        }
        //array indice valor
        //indica em qual indice o novo valor sera add em qual array
        fila[tamanho] = valor;
        //atualiza o tamanho da fila
        tamanho++;
    }
    public Object remove(){
        if (isEmpty()){
            System.out.println("Sua fila está vazia!");
            System.out.println("Não tem o que retirar!");
            return null;
        }
        //atributo ara retirar o primeiro valor da fila
        Object removeValor = fila[0];
        //utilizado para iterar sobre os elementos e mover para "frente" o elemento
        for (int i = 0; i < tamanho - 1; i++) {
            fila[i] = fila[i + 1];
        }
        //o ultimo elemento do fila é colocado como null para poder deixar espaço para outros
        fila[tamanho - 1] = null;
        //diminui o numero de valores
        tamanho--;

        return removeValor;
    }
    public void clear() {
        //itera sobre todos os valores da fila e seta como null
        for (int i = 0; i < qntd; i++) {
            fila[i] = null;
        }
        //zera o tamanho
        tamanho = 0;
    }
    public void print() {
        if (isEmpty()) {
            System.out.println("Sua fila está vazia!");
            System.out.println("Fila: []");
            return;
        }

        System.out.print("Fila: ");
        System.out.print("[");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(fila[i]);
            if (i < tamanho - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
