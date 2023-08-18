import java.io.*;
public class Compare3nos{
    public static void main(String args[]){
        int a=6,b=4,c=1;
        if(a>b){
            if(a>c){
                System.out.println(a+" is greater.");
            }
            else{
                System.out.println(c+" is greater.");
            }
        }
        else{
            System.out.println(b+" is greater.");
        }
    }
}
