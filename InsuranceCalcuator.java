import java.util.Scanner;

public class InsuranceCalcuator
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        {
            Policy policy = new Policy();

            System.out.print("Please enter the policy number: ");
            policy.setPolicyNumber(keyboard.nextLine());

            System.out.print("Please enter the provider name: ");
            policy.setProviderName(keyboard.nextLine());

            System.out.print("Please enter the policyholder's first name: ");
            policy.setFirstName(keyboard.nextLine());

            System.out.print("Please enter the policyholder's last name: ");
            policy.setLastName(keyboard.nextLine());

            System.out.print("Please enter the policyholder's age: ");
            policy.setAge(keyboard.nextInt());

            keyboard.nextLine(); 

            System.out.print("Is the policyholder a smoker or non-smoker? ");
            policy.setSmokingStatus(keyboard.nextLine());

            System.out.print("Please enter the policyholder's height (in inches): ");
            policy.setHeight(keyboard.nextDouble());

            System.out.print("Please enter the policyholder's weight (in pounds): ");
            policy.setWeight(keyboard.nextDouble());

            keyboard.nextLine(); 

            double bmi = policy.calculateBMI();
            double price = policy.calculatePrice();

            System.out.println();
            System.out.println("|------ Policy Summary -----|");
            System.out.println("Policy Number: " + policy.getPolicyNumber());
            System.out.println("Provider: " + policy.getProviderName());
            System.out.println("Policyholder: " + policy.getFirstName() + " " + policy.getLastName());
            System.out.println("Age: " + policy.getAge());
            System.out.println("Smoking Status: " + policy.getSmokingStatus());
            System.out.println("Height: " + policy.getHeight() + " inches");
            System.out.println("Weight: " + policy.getWeight() + " lbs");
            System.out.println("BMI: " + bmi);
            System.out.println("Policy Price: $" + price);
            System.out.println("|---------------------------|");
            System.out.println();
        }

        System.out.println("You have finished using the Insurance Policy Calculator!");
        keyboard.close();
    }
}