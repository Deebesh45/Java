
import java.io.*;
public class Fibonacci{
    public static void main(String args[]){
        int first=0,second=1,result=0;
        System.out.println("1");
        for(int i=0;i<12;i++){
            result=first+second;
            first=second;
            second=result;
            System.out.println(result);
        }
        
    }

}