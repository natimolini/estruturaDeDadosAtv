public class Main {
    public static void main(String[] args) {
        ListaEstatica l = new ListaEstatica(5);

        System.out.println("---Lista Estática---");
        l.addFim(6);
        l.add(9,8);
        l.imprimir();
        l.tirar(0);
        l.imprimir();
    }
}
