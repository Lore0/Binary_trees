public class main {
    public static void main(String[] args) {
        Tree a = new Tree(new Nodo(8));
        Nodo x = a.getRoot();
        a.getRoot().setSx(new Nodo(6));
        a.getRoot().setDx(new Nodo(9));
        a.getRoot().getSx().setSx(new Nodo(3));
        System.out.println(a.findN(x));
        System.out.println(a.findH(x));
        System.out.println(a.findNode(9, x).getName());
    }
}
