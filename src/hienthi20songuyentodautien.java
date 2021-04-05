import java.util.Scanner;
public class hienthi20songuyentodautien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        int count = 0;
        for (int i=2;i<=number+1;i++){
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    count++;
                }
            }
            if (count <= 2){
                System.out.println(i);
            }else {
                number++;
            }
            count=0;
        }
    }
}
