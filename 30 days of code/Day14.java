 class Difference {
    private int[] elements;
    public int maximumDifference;
    // Add your code here
Difference(int[] a)
{
 elements=a;   
}
void computeDifference()
{
    for(int i=0;i<elements.length-1;i++)
    {
        for(int j=1;j<elements.length;j++)
        {
            int k=Math.abs(elements[i]-elements[j]);
            if(k>=maximumDifference)maximumDifference=k;
        }
    }
}