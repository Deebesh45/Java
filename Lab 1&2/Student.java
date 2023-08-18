import java.util.Scanner;

public class Student {
    public static void main(String[] args) {

        int a[]= new int[5];
        int total=0;
        float avg=0;

        Scanner s1 = new Scanner(System.in);

        for (int i=0; i<5 ;i++) {
            System.out.println("Enter subject"+(i+1)+" marks:");
            
            a[i]=s1.nextInt();

            total=total+a[i];
        }
        avg=(float) total/5;
        System.out.println("Total is "+total);
        System.out.println("Average is "+avg);
        for(int i=0; i<5; i++){
            if(a[i]>=91){
                System.out.println("Grade of subject"+(i+1)+" is A.");
            }
            else if(a[i]>=81 && a[i]<91){
                System.out.println("Grade of subject"+(i+1)+" is B.");
            }
            else if(a[i]>=65 && a[i]<81){
                System.out.println("Grade of subject"+(i+1)+" is C.");
            }
            else if(a[i]>=50 && a[i]<65){
                System.out.println("Grade of subject"+(i+1)+" is D.");
            }
            else{
                System.out.println("Grade of subject"+(i+1)+" is F.");
            }

        }
        s1.close();
    }
}
