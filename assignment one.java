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

         // Java program to check if a phone number is valid
         Scanner scan = new Scanner(System.in);
         System.out.print("Enter your phone number: ");
         String phoneNum = scan.nextLine();
 
      
         Pattern pattern = Pattern.compile("\\+63\\d{10}");
         Matcher matcher = pattern.matcher(phoneNum);
 
         boolean match = matcher.matches();
 
          if (match) {
          System.out.println("valid phone number");
          } else {
          System.out.println("invalid phone number");
      }
 
    
 
 
         // Java program to check if a birth date is valid
         Scanner scan = new Scanner(System.in);
         System.out.print("What's your birthday? ");
         String dday = scan.nextLine();
 
         
         Pattern pattern = Pattern.compile("\\d{4}-\\d{2}-\\d{2}");
         Matcher matcher = pattern.matcher(dday);
 
         boolean match = matcher.matches();
 
         if (match) {
             System.out.println("valid birth date");
         } else {
             System.out.println("invalid birth date");
         }
 
 
        }
    }
