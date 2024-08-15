import java.util.Arrays;

public class StaticStacks {
    //cria uma variavel para definir o topo da pilha
    private int topPilha;
    //cria um array para a pilha
    private Object[] pilha;

    //cria um construtor para definir o tamanho da pilha e o topo (inicio) da pilha
    public StaticStacks(){
        this.pilha = new Object[10];
        this.topPilha = -1;
    }

    //cria um metodo para verificar se a pilha esta vazia
    //se a posição do topo for igual a definida antes (-1)
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

    public void clear() {
        Arrays.fill(pilha, null);
        topPilha = -1;
    }


    //cria um metodo para verificar o tamanho da pilha, ou seja, quantos itens tem dentro da pilha
    public int size(){
        if (this.isEmpty()){
            System.out.println("A pilha está vazia!");
            return 0;
        } else if (this.isFull()) {
            System.out.println("Sua pilha está cheia!");
            return 10;
        }
        return this.topPilha + 1;
    }
}
