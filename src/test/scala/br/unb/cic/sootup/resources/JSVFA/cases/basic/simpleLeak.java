package br.unb.cic.sootup.resources.JSVFA.cases.basic;

public class simpleLeak {

    public void main(String[] var0)
    {
        int a, b, result;

        a = source();
        b = 2;
        result = a + b;

        sink(result);
    }

    public int source()
    {
        return 0;
    }

    public void sink(int value)
    {
        System.out.println(value);
    }
}