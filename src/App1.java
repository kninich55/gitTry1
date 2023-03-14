import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your name: ");
        String username=input.nextLine();
        int rand=(int) (Math.random()*100);
        String user_id=username+"_"+String.valueOf(rand);
        User user=new User(username,user_id);
        System.out.println("Your user_id: " + user.toString());

    }
}
