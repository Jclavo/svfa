package samples.JSVFA.cases.basic;

public class FunctionCall6 {

    public void main(String[] var0)
    {
        int a, b;

        a = source();

        b = getMagicNumber(a);

        sink(b);
    }

    public int source()
    {
        return 0;
    }

    public void sink(int value)
    {
        System.out.println(value);
    }

    public int getMagicNumber(int x) {
        int z;
        z = 69;
        x = z * 100;
        return x;
    }
}
