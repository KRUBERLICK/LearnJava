package generics_examples;

class TwoD {
    private int x;
    private int y;
    public TwoD (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

class ThreeD extends TwoD {
    private int z;
    public ThreeD(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }
}

class FourD extends ThreeD {
    private int t;
    public FourD(int x, int y, int z, int t) {
        super(x, y, z);
        this.t = t;
    }

    public int getT() {
        return t;
    }
}

class Coords<T extends TwoD> {
    private T[] coordsArr;
    public Coords(T[] coordsArr) {
        this.coordsArr = coordsArr;
    }
    public static void showXY(Coords<? extends TwoD> c) {
        for (int i = 0; i < c.getCoordsArr().length; i++) {
            System.out.println("X: " + c.getCoordsArr()[i].getX() + " Y: " + c.getCoordsArr()[i].getY());
        }
    }
    public static void showXYZ(Coords<? extends ThreeD> c) {
        for (int i = 0; i < c.getCoordsArr().length; i++) {
            System.out.println("X: " + c.getCoordsArr()[i].getX() + " Y: " + c.getCoordsArr()[i].getY()
                    + " Z: " + c.getCoordsArr()[i].getZ());
        }
    }
    public T[] getCoordsArr() {
        return coordsArr;
    }
}

public class GenCoordDemo {
    public static void main(String[] args) {

    }
}
