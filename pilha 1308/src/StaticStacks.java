import java.util.Arrays;

public class StaticStacks {
    //cria uma variavel para definir o topo da pilha
    private int topPilha;
    //cria um array para a pilha
    private Object[] pilha;

    //cria um construtor para definir o tamanho da pilha e o topo (inicio) da pilha
    public StaticStacks(){
        this.pilha = new Object[5];
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
        System.out.println("Sua pilha foi esvaziada!");
    }

    public void push(Object valor) {
        //verifica se o topo da pilha é menor que o tamanho da pilha
        if (this.topPilha < this.pilha.length - 1) {
            //se for maior que menor ele insere o valor na pilha e incrementa o valor do indice
            this.pilha[++topPilha] = valor;
            System.out.println("Valor adicionado a pilha: " + valor);
        } else if (this.topPilha == this.pilha.length - 1) {
            System.out.println("Acabou o espaço!");
        }

    }
    public Object pop(){
        if(isEmpty()){
            System.out.println("Sua pilha está vazia!");
            return null;
        }
        //retorna o valor do ultimo elemento da pilha e decrementa o topo
        return this.pilha[this.topPilha--];
    }
    //cria um metodo para verificar o tamanho da pilha, ou seja, quantos itens tem dentro da pilha
    public int size(){
        if (this.isEmpty()){
            System.out.println("A pilha está vazia!");
            return 0;
        } else if (this.isFull()) {
            System.out.println("Sua pilha está cheia!");
            return 5;
        }
        System.out.print("Sua pilha possui ");
        System.out.print(this.topPilha + 1);
        System.out.println(" itens!");
        return this.topPilha + 1;
    }
}
