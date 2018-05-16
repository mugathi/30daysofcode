public class Solution {
    // Write your code here.
    char[] queue=new char[10000];
    int q=0;
    int s=0;
    int k=0;
    char[] stack=new char[10000];
    void pushCharacter(char c)
    {
    stack[s++]=c;    
    }
    void enqueueCharacter(char c)
    {
    queue[q++]=c;    
    }
    char popCharacter() 
    {
         return stack[--s];
    }
    char dequeueCharacter()
    {
     return queue[k++];   
    }