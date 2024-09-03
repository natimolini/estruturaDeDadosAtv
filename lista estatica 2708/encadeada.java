public class encadeada {

    // Definindo a classe interna Nodo, que representa cada elemento da lista
    private class Nodo {
        int dado;
        Nodo anterior;
        Nodo proximo;

        Nodo(int dado) {
            this.dado = dado;
            this.anterior = null;
            this.proximo = null;
        }
    }

    private Nodo cabeca; // Primeiro elemento da lista
    private Nodo cauda;  // Último elemento da lista
    private int tamanho; // Tamanho atual da lista

    // Construtor da lista, inicializando como vazia
    public encadeada() {
        cabeca = null;
        cauda = null;
        tamanho = 0;
    }

    // Método para verificar se a lista está vazia
    public boolean estaVazia() {
        return tamanho == 0;
    }

    // Método para adicionar um elemento no início da lista
    public void adicionarNoInicio(int valor) {
        Nodo novoNodo = new Nodo(valor);
        if (estaVazia()) {
            cabeca = novoNodo;
            cauda = novoNodo;
        } else {
            novoNodo.proximo = cabeca;
            cabeca.anterior = novoNodo;
            cabeca = novoNodo;
        }
        tamanho++;
    }

    // Método para adicionar um elemento no final da lista
    public void adicionarNoFim(int valor) {
        Nodo novoNodo = new Nodo(valor);
        if (estaVazia()) {
            cabeca = novoNodo;
            cauda = novoNodo;
        } else {
            novoNodo.anterior = cauda;
            cauda.proximo = novoNodo;
            cauda = novoNodo;
        }
        tamanho++;
    }

    // Método para remover o primeiro elemento da lista
    public void removerDoInicio() {
        if (estaVazia()) {
            System.out.println("A lista está vazia!");
            return;
        }
        cabeca = cabeca.proximo;
        if (cabeca != null) {
            cabeca.anterior = null;
        } else {
            cauda = null; // Lista ficou vazia
        }
        tamanho--;
    }

    // Método para remover o último elemento da lista
    public void removerDoFim() {
        if (estaVazia()) {
            System.out.println("A lista está vazia!");
            return;
        }
        cauda = cauda.anterior;
        if (cauda != null) {
            cauda.proximo = null;
        } else {
            cabeca = null; // Lista ficou vazia
        }
        tamanho--;
    }

    // Método para imprimir a lista do início ao fim
    public void imprimirLista() {
        if (estaVazia()) {
            System.out.println("A lista está vazia!");
            return;
        }
        Nodo atual = cabeca;
        System.out.print("Lista: ");
        while (atual != null) {
            System.out.print(atual.dado + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    // Método para imprimir a lista do fim ao início
    public void imprimirListaInvertida() {
        if (estaVazia()) {
            System.out.println("A lista está vazia!");
            return;
        }
        Nodo atual = cauda;
        System.out.print("Lista Invertida: ");
        while (atual != null) {
            System.out.print(atual.dado + " ");
            atual = atual.anterior;
        }
        System.out.println();
    }

    // Método para obter o tamanho da lista
    public int getTamanho() {
        return tamanho;
    }
}

