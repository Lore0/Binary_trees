public class Tree{
    Nodo root;
    
    public Tree(Nodo root) {
        this.root = root;
    }

    public Tree(){}

    public Nodo getRoot() {
        return root;
    }
    public void setRoot(Nodo root) {
        this.root = root;
    }

    public int findN(Nodo x) {
        if(x == null) 
            return 0;
        return (findN(x.dx) + findN(x.sx)) + 1;
    }

    public int findH(Nodo x){
        if(x == null) return 0;
        int val_sx = findH(x.sx);
        int val_dx = findH(x.dx);
        return 1 + max(val_dx, val_sx);
    }

    public int max(int a, int b){
        if(a > b)
            return a;
        else
            return b;
    }

    public Nodo findNode(int name, Nodo x){
        while(x != null && x.getName() != name){
            if(name < x.getName())
                x = x.sx;
            else
                x = x.dx;
        }
        return x;
    }
}