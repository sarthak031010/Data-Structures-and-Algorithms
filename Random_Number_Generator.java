import java.util.Random;
class otp {
  public static void main(String [] args){
  Random random = new Random();
  int otp = random.nextInt(9000)+1000;
  System.out.println("Your OTP Number Is :" + otp);
}
}
