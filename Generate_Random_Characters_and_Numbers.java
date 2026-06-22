import java.util.Random;
class Main{
  public static void main(String [] args){
    String chars = "abcdefghijklmopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890" ;
    Random rand = new Random();
    String otp = " ";
    for (int i =1 ; i<8 ; i++){
      otp += chars.CharAt(rand.nextInt(chars.length()));
      System.out.println(otp);
    }
  }
}
