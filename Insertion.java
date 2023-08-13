
import java.util.*;

// array to arraylist to insert element
class Insertion{
    static void displayelement(Integer[] array){
        System.out.println("Element present in array -\n");
       for(int i=0;i<array.length;i++){
        System.out.println(array[i]);
       }
    }

    static void  position(Integer[] arra,int element ,int pos){
// we are creating arrayList
List<Integer> list = new ArrayList<>( Arrays.asList(arra));
    list.add(pos - 1, element);
    arra=list.toArray(arra);
    System.out.println("\nArray with " + element
                        + " inserted at position "
                        + pos + ":\n"
                        + Arrays.toString(arra));

   
}
public static void main(String[] args) {
   Integer[] arr={7,8,35,26,78,9,10};
    Scanner sc=new Scanner(System.in);
    displayelement(arr);
    System.out .println("enter the element you want to insert");
    int element=sc.nextInt();
    System.out .println("enter the position for insertion");
    int pos=sc.nextInt();
    displayelement(arr);
    position(arr, element , pos);
}

}