public abstract class Parent {
    private int a = 1;
    protected int b = 2;
    public int c = 3;
    public static int d = 4;

    public int getA(){
        return a;
    }
    public abstract int getB();
    public int getC(){
        return c;
    }
}
