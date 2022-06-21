import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int sum = 0;
    System.out.println("wprowadź cyfry oraz zakończ '-5'");
    while(true){
      int temp = scan.nextInt();
      if ((temp % 2)==0){
        sum += temp;
      }
      if (temp==-5){
        break;
      }
    }
    System.out.print("wynik: ");
    System.out.println(sum);
  }
}