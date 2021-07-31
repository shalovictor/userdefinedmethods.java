class norecnoreturn
{
    public void fact()
    {
        int n=5,f=1,i;
        for(i=1;i<=n;i++)
        f*=i;
        System.out.println("factorial of "+n+"is"+f);
    }
    public static void main(String args[])
    {
        norecret ob=new norecret();
        ob.fact();
        //System.out.println("Factorial of "+m+"is" +q);
        
        
    }
}
