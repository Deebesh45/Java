import java.io.*;
public class Test03{
    public static void main(String args[]){
        int a=5,fact=1,i;
        for(i=1;i<=a;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+a+" is "+fact);
    }
} 