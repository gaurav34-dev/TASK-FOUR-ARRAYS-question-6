class Main{
  public static void main(String[]args)
  {
    int a[]={2,2,3,3,4,4,4,11,11,11,11};
      int[] temp=new int[a.length];

    int j=0;
    for(int i=0;i<a.length-1;i++)
      {
        if(a[i]!=a[i+1])
        {
          temp[j]=a[i];
          j++;
        }
      }
    temp[j]=a[a.length-1];

  for(int i=0;i<temp.length;i++)
    {
      System.out.println(temp[i]+" ");
    }
  }
}