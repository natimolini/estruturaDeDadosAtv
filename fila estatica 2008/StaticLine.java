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
            System.out.println("Sua fila está vazia!");
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
    public void remove(){
        if (isEmpty()){
            System.out.println("Não tem o que retirar!");
            return;
        }
        
    }
}
