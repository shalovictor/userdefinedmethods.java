class reference
{
    void add(int b[])
    {
        int i,p=b.length;
        for(i=0;i<p;i++)
        b[i]=b[i]+2;
        System.out.println("Parameter after change");
        for(i=0;i<p;i++)
        System.out.print(b[i]+ "\t");
        System.out.println();
    }
    public static void main(String args[])
    {
        int a[]={2,4,6,8,15};
        reference ob=new reference();
        ob.add(a);
        System.out.println("Function arguments after function operation");
        for(int j=0;j<=a.length;j++)
        System.out.println(a[j]+ "\t");
    }
}
