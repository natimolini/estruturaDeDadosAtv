// Classe da árvore binária de busca
class ArvoreBinariaDeBusca {
    private NoArvoreBinaria raiz;

    public ArvoreBinariaDeBusca(int valorRaiz) {
        this.raiz = new NoArvoreBinaria(valorRaiz);
    }

    // Método para adicionar um novo valor na árvore
    public void adicionar(int valor) {
        raiz = adicionarRecursivo(raiz, valor);
    }

    // Método recursivo para inserir o valor na posição correta
    private NoArvoreBinaria adicionarRecursivo(NoArvoreBinaria atual, int valor) {
        if (atual == null) {
            return new NoArvoreBinaria(valor); // Insere o novo nó onde for nulo
        }

        if (valor == atual.valor) {
            System.out.println("O valor " + valor + " já existe na árvore.");
            return atual; // Não permite duplicação
        }

        if (valor < atual.valor) {
            atual.esquerda = adicionarRecursivo(atual.esquerda, valor);
        } else if (valor > atual.valor) {
            atual.direita = adicionarRecursivo(atual.direita, valor);
        }

        return atual;
    }
    // Método para remover um valor da árvore
    public void remover(int valor) {
        raiz = removerRecursivo(raiz, valor);
    }

    private NoArvoreBinaria removerRecursivo(NoArvoreBinaria atual, int valor) {
        if (atual == null) {
            return null;
        }

        if (valor < atual.valor) {
            atual.esquerda = removerRecursivo(atual.esquerda, valor);
        } else if (valor > atual.valor) {
            atual.direita = removerRecursivo(atual.direita, valor);
        } else {
            // Encontrou o nó a ser removido
            // Caso 1: nó folha (sem filhos)
            if (atual.esquerda == null && atual.direita == null) {
                return null;
            }

            // Caso 2: nó com apenas um filho
            if (atual.esquerda == null) {
                return atual.direita; // Substitui o nó pelo seu filho direito
            }
            if (atual.direita == null) {
                return atual.esquerda; // Substitui o nó pelo seu filho esquerdo
            }

            // Caso 3: nó com dois filhos
            // Escolhe o menor valor da subárvore direita (nó mais próximo)
            NoArvoreBinaria menorValor = encontrarMenorValor(atual.direita);
            atual.valor = menorValor.valor;
            // Remove o menor valor encontrado na subárvore direita
            atual.direita = removerRecursivo(atual.direita, menorValor.valor);
        }

        return atual;
    }

    // Método para encontrar o menor valor em uma subárvore
    private NoArvoreBinaria encontrarMenorValor(NoArvoreBinaria atual) {
        while (atual.esquerda != null) {
            atual = atual.esquerda;
        }
        return atual;
    }
    // Método para verificar se a árvore contém um determinado valor
    public boolean buscar(int valor) {
        return buscarRecursivo(raiz, valor);
    }

    // Método recursivo para buscar o valor na árvore
    private boolean buscarRecursivo(NoArvoreBinaria atual, int valor) {
        if (atual == null) {
            return false; // Valor não encontrado
        }
        if (valor == atual.valor) {
            return true; // Valor encontrado
        }

        return valor < atual.valor
                ? buscarRecursivo(atual.esquerda, valor)
                : buscarRecursivo(atual.direita, valor);
    }

    // Método para imprimir a árvore de forma hierárquica
    public void imprimirComoArvore() {
        imprimirComoArvoreRecursivo(raiz, 0);
    }

    // Método recursivo para imprimir a árvore de forma visual
    private void imprimirComoArvoreRecursivo(NoArvoreBinaria atual, int nivel) {
        if (atual == null) {
            return;
        }

        imprimirComoArvoreRecursivo(atual.direita, nivel + 1);

        for (int i = 0; i < nivel; i++) {
            System.out.print("    "); // Indentação para mostrar o nível
        }
        System.out.println(atual.valor);

        imprimirComoArvoreRecursivo(atual.esquerda, nivel + 1);
    }
}


