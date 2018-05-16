import java.util.*;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;
    
    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }
    
    // Print person data
    public void printPerson(){
         System.out.println(
                "Name: " + lastName + ", " + firstName 
            +   "\nID: " + idNumber); 
    }
     
}
class Student extends Person{
    private int[] testScores;
Student(String f,String l,int i,int[] scores)
{
 super(f,l,i); 
 testScores=scores;
}
    int average()
    {
        int sum=0;
        for(int i=0;i<testScores.length;i++)
           sum+=testScores[i]; 
        return sum/testScores.length;
    }
char calculate()
{
    int x=average();
    if(x>=90)return 'O';
    else if(x<90&&x>=80)return 'E';
    else if(x>=70&&x<80)return 'A';
    else if(x>=55&&x<70)return 'P';
    else if(x>=40&&x<55)return 'D';
    else return 'T';
}
}
class Day12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();
        
        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}