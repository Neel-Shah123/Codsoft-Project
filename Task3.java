import java.util.Scanner;
  class Task3{
	
Scanner sc = new Scanner(System.in);
double AccBal =0.0;		
double NewBal =0.0;
void deposit(){
System.out.println("Enter the amount that you want to deposit");
double amo = sc.nextDouble();

AccBal+=  amo; 
System.out.println(" Deposit Successful.Your new balance is "+ AccBal + " rupees");


}

void withdraw(){

System.out.println("Enter the amount that you want to withdraw");
double withdraw = sc.nextDouble();
if(AccBal >= withdraw){
 NewBal = AccBal - withdraw;
System.out.println("You have withdraw amount"+ withdraw);
System.out.println("So your new balance is "+NewBal+" rupees");

}
else{
System.out.println("Invalid withdrawal or insufficient Balance ");

}

}

void checkbal(){
System.out.println(" Your current balance is "+NewBal);
}

public static void main(String args[]){
Task3 t = new Task3();	
int opt;
Scanner sc = new Scanner(System.in);



do{
System.out.println("ATM MENU");
System.out.println("1. Deposit");
System.out.println("2. Withdraw");
System.out.println("3. Check balance");
System.out.println("4. Exit");

System.out.println("Enter the option");
 opt = sc.nextInt();

switch(opt){

case 1 : t.deposit();
         break;

case 2 : t.withdraw();
         break;

case 3 :t.checkbal();
         break;

case 4 :System.exit(0);
         break;
default:
System.out.println(" Inavild Number");

}

}while(opt !=4);


}}