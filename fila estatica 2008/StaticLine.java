public class StaticLine {
    //para o indice do topo da fila
    private int topo;
    //para o indice da base da fila
    private int base;
    private Object[] fila;
    //para a qntd de elementos que podem ter na fila
    private int qntd;
    //para o numero de elementos que tem na fila
    private int tamanho;

    public StaticLine(int qntd){
        this.base = -1;
        this.topo = -1;
        this.qntd = qntd;
        this.tamanho = 0;
        this.fila = new Object[5];
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
}
