package krishna.Additional;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true)
        {
            System.out.println("Choose an option:");
            System.out.println("1. Case-sensitive matching");
            System.out.println("2. Case-insensitive matching");
            System.out.println("0. Exit");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice)
            {
                case 1:
                    performCaseSensitiveMatching(scanner);
                    break;
                case 2:
                    performCaseInsensitiveMatching(scanner);
                    break;
                case 0:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void performCaseSensitiveMatching(Scanner scanner)
    {
        String regex = regexInput(scanner);
        String input = patternInput(scanner);

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        int count = 0;
        while (matcher.find())
        {
            count++;
        }

        if (count>0)
        {
            System.out.println("The match is found : ");
            System.out.println(STR."Number of occurrences (case-insensitive) of \"\{regex}\": is \n \{count}");
        }
        else
        {
            System.out.println("Match is not found.");
        }
    }

    private static void performCaseInsensitiveMatching(Scanner scanner)
    {
        String regex = regexInput(scanner);
        String input = patternInput(scanner);

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);

        int count = 0;
        while (matcher.find())
        {
            count++;
        }
       if (count>0)
       {
           System.out.println("The match is found : ");
           System.out.println(STR."Number of occurrences (case-insensitive) of \"\{regex}\": is \n \{count}");
       }
       else
       {
          System.out.println("Match is not found.");
       }
    }
    private static String regexInput(Scanner scanner)
    {
        System.out.println("Enter the regex pattern:");
        return scanner.nextLine();
    }
    private static String patternInput(Scanner scanner)
    {
        // Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input string:");
        return scanner.nextLine();
    }
}
