import java.util.Scanner;
class Task2{

public static void main(String args[]){
Scanner sc = new Scanner(System.in);
double totalmrks = 0;

System.out.println("How Many Subjects Do You Have?");
double sub = sc.nextInt();

for(int i=1;i<=sub;i++){
System.out.println("Enter the marks(out of 100) of Subject "+ i);
double mrks = sc.nextInt();
  totalmrks = mrks + totalmrks;

}
System.out.println(" You Have Got "+ totalmrks+" Marks"+" In All Subjects");
System.out.println("");
double AvgPercentage = totalmrks/sub;

System.out.println("Your Average Percentage is"+ AvgPercentage+"%");
System.out.println("");

if(AvgPercentage >=80 && AvgPercentage <=100){
System.out.println("A Grade");
}
else if(AvgPercentage >=60 && AvgPercentage <=79){
System.out.println("B Grade");
}
else if(AvgPercentage >=50 && AvgPercentage <=59){
System.out.println("C Grade");
}
else if(AvgPercentage >=40 && AvgPercentage <=49){
System.out.println("D Grade");
}
else{
System.out.println("Fail");
}
}}