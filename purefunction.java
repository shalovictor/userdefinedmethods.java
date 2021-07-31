class purefunction
{
    int Show(int a)
    {
        a=2*a+5;
        return(a);
    }
    public static void main(String args[])
    {
        Sample ob=new Sample();
        int p=5,k;
        k=ob.Show(p);
        System.out.println("The actual arguments before performing tasks :"+p);
        System.out.println("The actual arguments after performing tasks :"+k);
    }
}
