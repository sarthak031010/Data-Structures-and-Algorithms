import java.util.Scanner;
class Main{
  public static void main(String []args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter array size :");
    int num = sc.nextInt();
    int [] arr = new int[num];
    System.out.println("Enter element :");
    for(int i = 0 ; i< num ; i++){
      arr[i]=sc.nextInt();
    }
    int first = 0;
    int last = arr.length-1;

    while(first<last){
      int temp = arr[first];
      arr[first] = arr[last];
      arr[last] = temp;
      first++;
      last--;
    }
    System.out.println("Reverse array");

    for(int number : arr){
      System.out.print(number);
    }
  }
}
