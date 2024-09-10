// Classe de teste
public class Main {
    public static void main(String[] args) {
        // Criação da árvore com o nó raiz de valor 10
        ArvoreBinariaDeBusca arvore = new ArvoreBinariaDeBusca(10);

        // Adicionando valores à árvore
        arvore.adicionar(7);
        arvore.adicionar(3);
        arvore.adicionar(15);
        arvore.adicionar(12);
        arvore.adicionar(18);
        arvore.adicionar(13);
        arvore.adicionar(11);
        arvore.adicionar(11);
        arvore.adicionar(11);
        arvore.adicionar(11);

        // Imprimindo a árvore antes da remoção
        System.out.println("Árvore antes da remoção:");
        arvore.imprimirComoArvore();

        // Remover o nó 12 (caso 3, com dois filhos)
        System.out.println("\nRemovendo o nó 12:");
        arvore.remover(12);

        // Imprimindo a árvore após a remoção
        System.out.println("\nÁrvore após remover o nó 12:");
        arvore.imprimirComoArvore();

        // Remover um nó folha (exemplo: 3)
        System.out.println("\nRemovendo o nó folha 3:");
        arvore.remover(3);
        arvore.imprimirComoArvore();

        // Remover um nó com um filho (exemplo: 7)
        System.out.println("\nRemovendo o nó 7 (com um filho):");
        arvore.remover(7);
        arvore.imprimirComoArvore();
    }
}