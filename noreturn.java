class noreturn
{
    public void fact(int x)
    {
        int f=1,i;
        for(i=1;i<=x;i++)
        f*=i;
        System.out.println("factorial of "+x+"is"+f);
    }
    public static void main(String args[])
    {
        noret ob=new noret();
        int n=5,m=8,p,q;
        ob.fact(n);
        //System.out.println("Factorial of "+n+"is" +p);
        ob.fact(m);
        //System.out.println("Factorial of "+m+"is" +q);
        
        
    }
}
