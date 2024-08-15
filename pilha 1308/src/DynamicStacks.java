import java.util.Arrays;

public class DynamicStacks {
    private Object[] pilha;
    private int topPilha;
    private float growth;

    public DynamicStacks(){
        this.growth = 1.5F;
        this.topPilha = -1;
        this.pilha = new Object[5];
    }

    public boolean isEmpty(){
        if (this.topPilha == -1){
            return true;
        }
        return false;}

    public boolean isFull(){
        if (this.topPilha == pilha.length - 1){
            return true;
        }
        return false;
    }


    public Object pop(){
        if(isEmpty()){
            System.out.println("Sua pilha está vazia!");
            return null;
        }
        //retorna o valor do ultimo elemento da pilha e decrementa o topo
        return this.pilha[this.topPilha--];
    }

    public void clear() {
        Arrays.fill(pilha, null);
        topPilha = -1;
        System.out.println("Sua pilha foi esvaziada!");
    }

    public void push(Object valor) {
        //verifica se o topo da pilha é menor que o tamanho da pilha
        if (this.topPilha < this.pilha.length - 1) {
            //se for maior que menor ele insere o valor na pilha e incrementa o valor do indice
            this.pilha[++topPilha] = valor;
            System.out.println("Valor adicionado a pilha: " + valor);
        } else if (this.topPilha == this.pilha.length - 1) {
            resize();
            this.pilha[++topPilha] = valor;
            System.out.println("Valor adicionado a pilha: " + valor);
        }

    }

    private void resize() {
        int newSize = (int)(pilha.length * growth);
        Object[] newPilha = new Object[newSize];
        System.arraycopy(pilha, 0, newPilha, 0, pilha.length);
        pilha = newPilha;
        System.out.println("Redimensionando...");
        System.out.println("Pilha redimensionada para tamanho: " + newSize);
    }
}
