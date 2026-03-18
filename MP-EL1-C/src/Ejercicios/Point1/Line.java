package src.Ejercicios.Point1;
/**
 * Representa una línea con un punto de inicio y un punto de fin.
 */
public class Line {
    private Point begin;
    private Point end;
    /** Constructor con puntos de inicio y fin.*/
    public Line(Point begin, Point end){
        this.begin=begin;
        this.end=end;
    }
    /** Constructor con coordenadas enteras de inicio y fin.*/
    public Line(int beginX, int beginY, int endX, int endY){
        this.begin=new Point(beginX,beginY);
        this.end=new Point(endX,endY);
    }
    /** Devuelve el punto de inicio de la línea.*/
    public Point getBegin(){
        return begin;
    }
    /** Devuelve el punto de fin de la línea.*/
    public Point getEnd(){
        return end;
    }
    /** Modifica el punto de inicio de la línea.*/
    public void setBegin(Point begin){
        this.begin=begin;
    }
    /** Modifica el punto de fin de la línea.*/
    public void setEnd(Point end){
        this.end=end;
    }
    /** Devuelve la coordenada x del punto de inicio como int.*/
    public int getBeginX(){
        return (int)begin.getX();
    }
    /** Devuelve la coordenada y del punto de inicio como int.*/
    public int getBeginY(){
        return (int)begin.getY();
    }
    /** Devuelve la coordenada x del punto de fin como int.*/
    public int getEndX(){
        return (int)end.getX();
    }
    /** Devuelve la coordenada y del punto de fin como int.*/
    public int getEndY(){
        return (int)end.getY();
    }
    /** Modifica la coordenada x del punto de inicio.*/
    public void setBeginX(int x){
        this.begin.setX(x);
    }
    /** Modifica la coordenada y del punto de inicio.*/
    public void setBeginY(int y){
        this.begin.setY(y);
    }
    /** Modifica la coordenada x del punto de fin.*/
    public void setEndX(int x){
        this.end.setX(x);
    }
    /** Modifica la coordenada y del punto de fin.*/
    public void setEndY(int y){
        this.end.setY(y);
    }
    /** Modifica las coordenadas x e y del punto de inicio a la vez.*/
    public void setBeginXY(int x, int y){
        this.begin.setXY(x,y);
    }
    /** Modifica las coordenadas x e y del punto de fin a la vez.*/
    public void setEndXY(int x, int y){
        this.end.setXY(x,y);
    }
    /** Calcula y devuelve la longitud de la línea.*/
    public double getLength(){
        int xDiff= (int)end.getX()-(int)begin.getX();
        int yDiff= (int)end.getY()-(int)begin.getY();
        return Math.sqrt(xDiff*xDiff+yDiff*yDiff);
    }
    /** Calcula y devuelve el ángulo de inclinación de la línea en radianes.*/
    public double getGradient(){
        int xDiff= (int)end.getX()-(int)begin.getX();
        int yDiff= (int)end.getY()-(int)begin.getY();
        return Math.atan2(yDiff,xDiff);
    }

    /** Devuelve una representación en texto de la línea.*/
    @Override
    public String toString(){
        return "(" + begin.toString() + ", " + end.toString() + ")";
    }
}