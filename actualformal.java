class actualformal
{
    void show(int x, int y)
    {
        x=x+2;
        y=y+2;
        System.out.println("Values of the formal parameters change :"+x+ ' '+y);
    }
    public static void main (String args[])
    {
        example ob=new example();
        int a=5,b=6;
        ob.show(a,b);
        System.out.println("Value of the actual parameters remain same:" +a+","+b);
    }
}
