package BloqueB.Arrays;

public class MyPoint { /** definimos la clase MyPointt que sera donde le demos a los puntos i de la clase Matriz su valor en x y en y en el plano */
    private int x = 0;
    private int y = 0;

    public MyPoint() {}

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() { return x; } /** deinimos aquellos elementos que nos van a dejar obtener el valor a la x e y en el plano */
    public void setX(int x) { this.x = x; }
    public int getY() { return y; }
    public void setY(int y) { this.y = y; }

    public double distance(MyPoint another) { /** definimos el metodo que nos va a permitir calcular la distancia entre i y j en la clase Matriz */
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    @Override
    public String toString() { /** colocamos un string, un texto que nos devuelva por texto en que punto estamos de (x,y) */
        return "(" + x + "," + y + ")";
    }
}