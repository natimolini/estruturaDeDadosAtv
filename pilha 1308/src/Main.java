public class Main {
    public static void main(String[] args) {
        System.out.println("----PILHA ESTÁTICA----");
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

        System.out.println();
        System.out.println("---------PILHA DINÂMICA---------");
        System.out.println("---Essa pilha não fica cheia---");
        DynamicStacks d = new DynamicStacks();
        d.push(2);
        d.push(3);
        d.push(40);
        d.push(43);
        d.push(21);
        d.push(1);

        System.out.println("__________________________");
        System.out.println("Valor removido: " + s.pop());
        System.out.println("Valor removido: " + s.pop());

        System.out.println("__________________________");
        d.clear();

        System.out.println("__________________________");
        d.pop();

        System.out.println("__________________________");
        d.push(1);
        d.push(7);
        d.push(2);
        d.push(4);
        d.push(8);
        d.push(54);
        d.push(32);
        d.push(2);
        d.push(9);



    }
}