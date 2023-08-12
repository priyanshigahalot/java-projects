import java.util.*;
class Commonele{

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
   
    System.out.println("enter the no of elements that you want to put in this array");
    int n=sc.nextInt();        //n is the no of element
    int arra1[]=new int[n];
    boolean efound=false;
    System.out.println("enter the array elements");
    for(int i=0;i<n;i++){
      arra1[i]=sc.nextInt();
                        }
      System.out.println("enter the element to be searched");
      int key=sc.nextInt();
      for(int i=0;i<n;i++){
        if(key==arra1[i]){
        System.out.println("okk let me search the element "+arra1[i]+" \nthe loc is : "+(i+1)+"th element");
                   efound=true;
                   
    }
        if(!efound){
            System.out.println("element is not present ");
            break;
        }               
                          }         }

}