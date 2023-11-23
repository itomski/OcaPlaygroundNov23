package übung1;

public class Rechner {
    private int x;
    private int y;

    public Rechner() {
    }

    public Rechner(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * 获取
     * @return x
     */
    public int getX() {
        return x;
    }

    /**
     * 设置
     * @param x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * 获取
     * @return y
     */
    public int getY() {
        return y;
    }

    /**
     * 设置
     * @param y
     */
    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        return "Rechner{x = " + x + ", y = " + y + "}";
    }

    public int addMethode(int x,int y) {
        int add = x+y;
        return add;
    }

    public int minusMethode(int x,int y) {
        int minus = x-y;
        return minus;
    }

    public int malMethode(int x,int y) {
        int mal = x*y;
        return mal;
    }

    public int durchMethode(int x,int y) {
        int durch = x/y;
        return durch;
    }
}
