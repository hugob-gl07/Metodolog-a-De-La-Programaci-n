package BloqueB.MyTriangle;

public class MyTriangle {/** creamos la clase mytriangle e importamos las variables que vamos a usar con ayuda de mypoint */
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {/** definimos las variables en funcion a los puntos de mypoint*/
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {/** en un string decimos cuales son los diversos vertices del triangulo junto a sus puntos */
        return "MyTriangle[v1=" + v1 + ",v2=" + v2 + ",v3=" + v3 + "]";
    }

    public double getPerimeter() {/** sumamos las distancias entre los puntos de los vertices y obtenemos el perimtro */
        return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
    }

    public String getType() {/** en funcion de cuantos lados se asemejan, es decir, cuantas distancias son iguales, definimos distintos tipos de triangulos*/
        double d1 = v1.distance(v2);
        double d2 = v2.distance(v3);
        double d3 = v3.distance(v1);

        if (d1 == d2 && d2 == d3) {
            return "Equilateral";
        } else if (d1 == d2 || d1 == d3 || d2 == d3) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }
}
