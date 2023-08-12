class Reverse_an_array{
public static void main(String[] args) {
    int arra[]={3,6,8,2,9,1};
     int n= arra.length;

     printarray(arra, n)  ;
     reversearray(arra,n);
}



static void printarray(int arr[],int size){
    System.out.println("original array");
    for(int i=0;i<size;i++ ){
        System.out.println(arr[i]);
    }
    }


   static void reversearray(int arr[],int n){
    int start=0;
    int end=n-1;
    while(start<end){
     int temp;
     temp=arr[start];
   arr[start] = arr[end];
    arr[end]=temp;
    start++;
    end--;
    }
    System.out.println("reversed array");
    for(int i=0;i<n;i++ ){
        System.out.println(arr[i]);
        }


    
  }

}