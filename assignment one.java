import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // Java program to check if a student number is valid
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter student Email: ");
        String studentEmail = scan.nextLine();

        Pattern pattern = Pattern.compile("\\+(@students.national-u.edu.ph)");
        Matcher matcher = pattern.matcher(studentEmail);

        boolean match = matcher.matches();

        if (match) {
            System.out.println("valid student email address");
        } else {
            System.out.println("invalid student email address");
        }

        
        }
    }
