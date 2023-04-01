package title2;

public class Mpoint {
    private double x;
    private double y;

    public Mpoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Mpoint mpoint = (Mpoint) o;
        return Double.compare(mpoint.x, x) == 0 && Double.compare(mpoint.y, y) == 0;
    }

    @Override
    public String toString() {
        return "point:" +
                "x=" + x +
                ", y=" + y ;
    }
}
