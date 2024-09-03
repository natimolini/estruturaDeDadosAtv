public class Encadeada<T> {
    private Node<T> inicio;  // Referência para o primeiro nó da lista
    private Node<T> fim;     // Referência para o último nó da lista
    private int tamanho;     // Armazena o número de elementos na lista

    // Classe interna para representar um nó da lista duplamente encadeada
    private static class Node<T> {
        T dado;              // O dado que o nó armazena
        Node<T> anterior;    // Referência para o nó anterior na lista
        Node<T> proximo;     // Referência para o próximo nó na lista

        // Construtor do nó que inicializa o dado
        Node(T dado) {
            this.dado = dado;
        }
    }

    // Construtor da lista, inicializa uma lista vazia
    public Encadeada() {
        this.inicio = null;  // A lista começa vazia, então o início é null
        this.fim = null;     // A lista começa vazia, então o fim é null
        this.tamanho = 0;    // O tamanho inicial da lista é 0
    }

    // Adiciona um elemento no início da lista
    public void adicionarInicio(T dado) {
        Node<T> novoNo = new Node<>(dado);  // Cria um novo nó com o dado fornecido
        if (inicio == null) {  // Se a lista estiver vazia
            inicio = fim = novoNo;  // O novo nó é tanto o início quanto o fim da lista
        } else {  // Se a lista não estiver vazia
            novoNo.proximo = inicio;  // O próximo do novo nó é o antigo início
            inicio.anterior = novoNo; // O anterior do antigo início é o novo nó
            inicio = novoNo;          // Atualiza o início para o novo nó
        }
        tamanho++;  // Incrementa o tamanho da lista
    }

    // Adiciona um elemento no final da lista
    public void adicionarFim(T dado) {
        Node<T> novoNo = new Node<>(dado);  // Cria um novo nó com o dado fornecido
        if (fim == null) {  // Se a lista estiver vazia
            inicio = fim = novoNo;  // O novo nó é tanto o início quanto o fim da lista
        } else {  // Se a lista não estiver vazia
            fim.proximo = novoNo;   // O próximo do antigo fim é o novo nó
            novoNo.anterior = fim;  // O anterior do novo nó é o antigo fim
            fim = novoNo;           // Atualiza o fim para o novo nó
        }
        tamanho++;  // Incrementa o tamanho da lista
    }

    // Adiciona um elemento em um índice específico da lista
    public void adicionarPorIndice(int indice, T dado) {
        if (indice < 0 || indice > tamanho) {  // Verifica se o índice é válido
            System.out.println("Indice inválido!");
            return;  // Sai do método se o índice for inválido
        }

        if (indice == 0) {  // Se o índice for 0, adiciona no início
            adicionarInicio(dado);
        } else if (indice == tamanho) {  // Se o índice for igual ao tamanho, adiciona no fim
            adicionarFim(dado);
        } else {  // Caso contrário, adiciona em um índice intermediário
            Node<T> novoNo = new Node<>(dado);  // Cria um novo nó com o dado fornecido
            Node<T> atual = inicio;  // Começa a partir do início da lista

            for (int i = 0; i < indice - 1; i++) {  // Navega até o nó na posição (indice - 1)
                atual = atual.proximo;
            }

            novoNo.proximo = atual.proximo;  // O próximo do novo nó é o próximo do nó atual
            novoNo.anterior = atual;         // O anterior do novo nó é o nó atual
            atual.proximo.anterior = novoNo; // O anterior do próximo nó é o novo nó
            atual.proximo = novoNo;          // O próximo do nó atual é o novo nó

            tamanho++;  // Incrementa o tamanho da lista
        }
    }

    // Remove um elemento específico da lista
    public void remover(T dado) {
        Node<T> atual = inicio;  // Começa a partir do início da lista
        while (atual != null) {  // Percorre a lista
            if (atual.dado.equals(dado)) {  // Encontra o nó com o dado correspondente
                if (atual.anterior != null) {  // Se não for o primeiro nó
                    atual.anterior.proximo = atual.proximo;  // O próximo do nó anterior agora é o próximo do nó atual
                } else {  // Se for o primeiro nó
                    inicio = atual.proximo;  // Atualiza o início para o próximo nó
                }
                if (atual.proximo != null) {  // Se não for o último nó
                    atual.proximo.anterior = atual.anterior;  // O anterior do próximo nó agora é o anterior do nó atual
                } else {  // Se for o último nó
                    fim = atual.anterior;  // Atualiza o fim para o nó anterior
                }
                tamanho--;  // Decrementa o tamanho da lista
                return;  // Sai do método após remover o elemento
            }
            atual = atual.proximo;  // Vai para o próximo nó
        }
    }

    // Exibe todos os elementos da lista
    public void exibirLista() {
        Node<T> atual = inicio;  // Começa a partir do início da lista
        while (atual != null) {  // Percorre a lista
            System.out.print(atual.dado + " ");  // Exibe o dado do nó atual
            atual = atual.proximo;  // Vai para o próximo nó
        }
        System.out.println();  // Nova linha após exibir todos os elementos
    }

    // Exibe os elementos anteriores e próximos de um nó específico
    public void exibirNosAnterioresEProximos(T dado) {
        Node<T> atual = inicio;  // Começa a partir do início da lista
        while (atual != null) {  // Percorre a lista
            if (atual.dado.equals(dado)) {  // Encontra o nó com o dado correspondente
                System.out.print("Nó Anterior: ");
                if (atual.anterior != null) {  // Se houver nó anterior, exibe o dado dele
                    System.out.println(atual.anterior.dado);
                } else {  // Se não houver nó anterior, exibe null
                    System.out.println("null");
                }

                System.out.print("Contéudo (nó atual): ");
                System.out.println(atual.dado);  // Exibe o dado do nó atual

                System.out.print("Nó Próximo: ");
                if (atual.proximo != null) {  // Se houver nó próximo, exibe o dado dele
                    System.out.println(atual.proximo.dado);
                } else {  // Se não houver nó próximo, exibe null
                    System.out.println("null");
                }
                return;  // Sai do método após exibir os dados
            }
            atual = atual.proximo;  // Vai para o próximo nó
        }
        System.out.println("Elemento não encontrado.");  // Se não encontrar o elemento, exibe uma mensagem
    }

    // Retorna o tamanho da lista
    public int getTamanho() {
        return tamanho;  // Retorna o número de elementos na lista
    }

    // Verifica se a lista está vazia
    public boolean estaVazia() {
        return tamanho == 0;  // Retorna true se a lista estiver vazia, false caso contrário
    }
}

