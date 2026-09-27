import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class InsuranceCalcuator
{
    public static void main(String[] args)
    {
        ArrayList<Policy> policies = new ArrayList<Policy>();

        try
        {
            Scanner inputFile = new Scanner(new File("PolicyInformation.txt"));

            while (inputFile.hasNextLine())
            {
                String policyNumberLine = inputFile.nextLine();

                while (policyNumberLine.equals("") && inputFile.hasNextLine())
                {
                    policyNumberLine = inputFile.nextLine();
                }

                if (!policyNumberLine.equals(""))
                {
                    Policy policy = new Policy();

                    policy.setPolicyNumber(policyNumberLine);
                    policy.setProviderName(inputFile.nextLine());
                    policy.setFirstName(inputFile.nextLine());
                    policy.setLastName(inputFile.nextLine());
                    policy.setAge(inputFile.nextInt());

                    if (inputFile.hasNextLine())
                    {
                        inputFile.nextLine();
                    }

                    policy.setSmokingStatus(inputFile.nextLine());
                    policy.setHeight(inputFile.nextDouble());
                    policy.setWeight(inputFile.nextDouble());

                    if (inputFile.hasNextLine())
                    {
                        inputFile.nextLine();
                    }

                    policies.add(policy);
                }
            }

            inputFile.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("The Policy Information File was not found. :(");
        }

        int smokerCount = 0;
        int nonSmokerCount = 0;

        for (Policy policy : policies)
        {
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
            System.out.printf("BMI: %.2f%n", bmi);
            System.out.printf("Policy Price: $%.2f%n", price);
            System.out.println("|---------------------------|");
            System.out.println();

            if (policy.getSmokingStatus().equalsIgnoreCase("smoker"))
            {
                smokerCount = smokerCount + 1;
            }
            else
            {
                nonSmokerCount = nonSmokerCount + 1;
            }
        }

        System.out.println("The number of policies with a smoker is: " + smokerCount);
        System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);
    }
}
