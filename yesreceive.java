class yesrec
{
    public int fact(int x)
    {
        int f=1,i;
        for(i=1;i<=x;i++)
        f*=i;
        return(f);
    }
    public static void main(String args[])
    {
        yesrec ob=new yesrec();
        int n=5,m=8,p,q;
        p=ob.fact(n);
        System.out.println("Factorial of "+n+"is" +p);
        q=ob.fact(m);
        System.out.println("Factorial of "+m+"is" +q);
        
        
    }
}
