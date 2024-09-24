class ArvoreBinariaDeBusca {
    private NoArvoreBinaria raiz;

    public ArvoreBinariaDeBusca(int valorRaiz) {
        this.raiz = new NoArvoreBinaria(valorRaiz);
    }

    // Método para adicionar um novo valor na árvore
    public void adicionar(int valor) {
        raiz = adicionarRecursivo(raiz, valor);
    }

    private NoArvoreBinaria adicionarRecursivo(NoArvoreBinaria atual, int valor) {
        if (valor < 0) {
            System.out.println(valor + " não pode ser adicionado, ele é menor que zero!");
            return atual;
        }

        if (atual == null) {
            System.out.println("Inserido " + valor + " na árvore...");
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
            // Caso 1: Nó folha (sem filhos)
            if (atual.esquerda == null && atual.direita == null) {
                System.out.println("Removendo " + valor + " que não possui filhos!");
                return null; // Remove o nó folha
            }

            // Caso 2: Nó com apenas um filho
            if (atual.esquerda == null) {
                System.out.println("Removendo " + valor + " que possui 1 filho (direito)");
                return atual.direita; // Substitui pelo filho direito
            }
            if (atual.direita == null) {
                System.out.println("Removendo " + valor + " que possui 1 filho (esquerdo)");
                return atual.esquerda; // Substitui pelo filho esquerdo
            }

            // Caso 3: Nó com dois filhos
            System.out.println("Removendo " + valor + " que possui 2 filhos");
            NoArvoreBinaria menorValor = encontrarMenorValor(atual.direita); // Encontra o menor valor da subárvore direita
            atual.valor = menorValor.valor; // Substitui o valor do nó a ser removido pelo menor da subárvore direita

        }

        return atual;
    }


    private NoArvoreBinaria encontrarMenorValor(NoArvoreBinaria atual) {
        while (atual.esquerda != null) {
            atual = atual.esquerda;
        }
        return atual;
    }

    public boolean buscar(int valor) {
        return buscarRecursivo(raiz, valor);
    }

    private boolean buscarRecursivo(NoArvoreBinaria atual, int valor) {
        if (atual == null) {
            return false;
        }
        if (valor == atual.valor) {
            return true;
        }

        return valor < atual.valor
                ? buscarRecursivo(atual.esquerda, valor)
                : buscarRecursivo(atual.direita, valor);
    }
    // Método para imprimir a árvore de forma hierárquica
    public void imprimirComoArvoreVisual() {
        imprimirComoArvoreRecursivo(raiz, "", true);
    }

    private void imprimirComoArvoreRecursivo(NoArvoreBinaria atual, String prefixo, boolean isEsquerda) {
        if (atual != null) {
            System.out.println(prefixo + (isEsquerda ? "├── " : "└── ") + atual.valor);
            imprimirComoArvoreRecursivo(atual.esquerda, prefixo + (isEsquerda ? "│   " : "    "), true);
            imprimirComoArvoreRecursivo(atual.direita, prefixo + (isEsquerda ? "│   " : "    "), false);
        }
    }}


