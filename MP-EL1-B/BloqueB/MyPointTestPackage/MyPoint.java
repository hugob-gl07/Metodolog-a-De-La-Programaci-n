package BloqueB.MyPointTestPackage;

public class MyPoint {/** creamos la clase mypoint e indicamos sus puntos x,y en el plano */
    private int x = 0;
    private int y = 0;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {/** definimos las variables */
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }/** usamos getters y setters para avanzar y obtener los datos de las variables*/

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        return new int[]{this.x, this.y};
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(int x, int y) {/** calculamos la distancia de distintos puntos x e y, tanto los que ya tenimos, como sus siguientes, junto a otros puntos distintos */
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double distance(MyPoint another) {
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double distance() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
