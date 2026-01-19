import java.util.*;
public class SimpleIntrest{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter Principle Amount: ");
double Principle= sc.nextDouble();
System.out.println("Enter Rate: ");
double Rate= sc.nextDouble();
System.out.println("Enter Time: ");
int Time=sc.nextInt();
double SimpleInterest=(Principle*Rate*Time)/100;
System.out.println("SimpleInterest=" + SimpleInterest);
}}