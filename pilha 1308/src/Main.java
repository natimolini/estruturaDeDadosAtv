public class Main {
    public static void main(String[] args) {
        StaticStacks s = new StaticStacks();
        s.push(2);
        s.push(3);
        s.push(40);
        s.push(43);
        s.push(21);
        s.push(1);

        System.out.println("__________________________");
        System.out.println("Valor removido: " + s.pop());
        System.out.println("Valor removido: " + s.pop());

        System.out.println("__________________________");
        s.clear();

        System.out.println("__________________________");
        s.pop();

        System.out.println("__________________________");
        s.size();
        s.push(1);
        s.push(7);
        s.size();
        s.push(2);
        s.push(4);
        s.push(8);
        s.size();
    }
}