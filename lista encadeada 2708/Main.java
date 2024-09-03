public class Main {
    public static void main(String[] args) {
        Encadeada<Integer> lista = new Encadeada<>();

        System.out.println("Adicionando...");
        lista.adicionarInicio(10);
        lista.adicionarInicio(20);
        lista.adicionarFim(30);
        lista.adicionarFim(40);

        System.out.print("Lista: ");
        lista.exibirLista();

        lista.adicionarPorIndice(2, 25);
        System.out.print("Após adicionar 25 no índice 2: ");
        lista.exibirLista();

        System.out.println();
        System.out.println("Nós do 20:");
        lista.exibirNosAnterioresEProximos(20);
        System.out.println();
        System.out.println("Nós do 30:");
        lista.exibirNosAnterioresEProximos(30);

        System.out.println();
        System.out.println("Removendo...");
        lista.remover(20);
        System.out.print("Após remover 20: ");
        lista.exibirLista();
        lista.remover(25);
        System.out.print("Após remover 25: ");
        lista.exibirLista();

        System.out.println();
        System.out.println("Nós do 30:");
        lista.exibirNosAnterioresEProximos(30);
        System.out.println();
        System.out.println("Tamanho da lista: " + lista.getTamanho());
    }
}
