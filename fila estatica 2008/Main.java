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

        CircularLine c = new CircularLine(5);
        System.out.println();
        System.out.println("----Fila Circular----");
        c.add(1);
        c.add(2);
        c.add(3);
        c.print();
        c.remove();
        c.add(4);
        c.add(5);
        c.add(6);
        c.isFull();
        c.print();
        c.add(7);
        c.clear();
        c.isEmpty();
        c.print();
        c.remove();
        c.add(8);
        c.print();
        c.add(9);
        c.print();
        c.add(10);
        c.print();
        c.add(11);
        c.print();
        c.add(12);
        c.print();
        c.add(13);
        c.print();
    }
}
