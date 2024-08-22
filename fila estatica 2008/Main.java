public class Main {
    public static void main(String[] args) {
        StaticLine e = new StaticLine(5);

        System.out.println("----Fila Estática!----");
        e.add(1);
        e.add(2);
        e.add(3);
        e.print();
        e.remove();
        e.add(4);
        e.add(5);
        e.add(6);
        e.isFull();
        e.print();
        e.add(7);
        e.clear();
        e.isEmpty();
        e.print();
        e.remove();


    }
}
