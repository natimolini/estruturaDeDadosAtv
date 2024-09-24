public class Main {
    public static void main(String[] args) {
        ArvoreBinariaDeBusca arvore = new ArvoreBinariaDeBusca(10);

        arvore.adicionar(7);
        arvore.adicionar(3);
        arvore.adicionar(15);
        arvore.adicionar(12);
        arvore.adicionar(-18);
        arvore.adicionar(13);
        arvore.adicionar(11);
        arvore.adicionar(11);
        System.out.println();
        arvore.imprimirComoArvoreVisual();

        // Remover o nó 12 (com dois filhos)
        System.out.println("\nRemovendo o nó 12:");
        arvore.remover(12);


        // Remover um nó folha
        System.out.println("\nRemovendo o nó folha 3:");
        arvore.remover(3);

        // Remover um nó com um filho
        System.out.println("\nRemovendo o nó 7 (com um filho):");
        arvore.remover(7);


    }
}