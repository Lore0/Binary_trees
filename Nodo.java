public class Nodo {
    Nodo dx;
    Nodo sx;
    int name;

    public Nodo(Nodo dx, Nodo sx) {
        this.dx = null;
        this.sx = null;
    }

    public Nodo(int name){
        this.name = name;
    }

    public int getName() { return name; }

    public void setName(int name) { this.name = name; }
    public Nodo getDx() {
        return dx;
    }
    public void setDx(Nodo dx) {
        this.dx = dx;
    }
    public Nodo getSx() {
        return sx;
    }
    public void setSx(Nodo sx) {
        this.sx = sx;
    }


}
