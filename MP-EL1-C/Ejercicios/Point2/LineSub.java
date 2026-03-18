package Ejercicios.Point2;
/**
 * Representa una línea como subclase de Point,
 * usando el propio punto como inicio y añadiendo un punto de fin.
 */
public class LineSub extends Point {
    Point end;
    /** Constructor con coordenadas enteras de inicio y fin.*/
    public LineSub(int beginX, int beginY, int endX, int endY){
        super(beginX,beginY);
        this.end=new Point(endX,endY);
    }
    /** Constructor con puntos de inicio y fin.*/
    public LineSub(Point begin, Point end){
        super(begin.getX(), begin.getY());
        this.end=end;
    }
    /** Devuelve el punto de inicio de la línea.*/
    public Point getBegin(){
        return this;
    }
    /** Devuelve el punto de fin de la línea.*/
    public Point getEnd(){
        return this.end;
    }
    /** Devuelve la coordenada x del punto de inicio.*/
    public int getBeginX(){
        return getX();
    }
    /** Devuelve la coordenada y del punto de inicio.*/
    public int getBeginY(){
        return getY();
    }
    /** Devuelve la coordenada x del punto de fin.*/
    public int getEndX(){
        return end.getX();
    }
    /** Devuelve la coordenada y del punto de fin.*/
    public int getEndY(){
        return end.getY();
    }

    /** Modifica la coordenada x del punto de inicio.*/
    public void setBeginX(int x){
        setX(x);
    }
    /** Modifica la coordenada y del punto de inicio.*/
    public void setBeginY(int y){
        setY(y);
    }
    /** Modifica las coordenadas x e y del punto de inicio a la vez.*/
    public void setBeginXY(int x, int y){
        setXY(x,y);
    }
    /** Modifica la coordenada x del punto de fin.*/
    public void setEndX(int x){
        this.end.setX(x);
    }

    /** Modifica la coordenada y del punto de fin.*/
    public void setEndY(int y){
        this.end.setY(y);
    }
    /** Modifica las coordenadas x e y del punto de fin a la vez.*/
    public void setEndXY(int x, int y){
        this.end.setXY(x,y);
    }

    /** Calcula y devuelve la longitud de la línea.*/
    public double getLength(){
        int xDiff=end.getX()-getX();
        int yDiff=end.getY()-getY();
        return Math.sqrt(xDiff*xDiff+yDiff*yDiff);
    }
    /** Calcula y devuelve el ángulo de inclinación de la línea en radianes.*/
    public double getGradient(){
        int xDiff=end.getX()-getX();
        int yDiff=end.getY()-getY();
        return Math.atan2(yDiff,xDiff);
    }
    /** Devuelve una representación en texto de la línea.*/
    public String toString(){
        return "LineSub[begin=" + super.toString() + ", end=" + end.toString() + ")";
    }
}