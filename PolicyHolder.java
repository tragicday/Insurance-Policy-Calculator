public class PolicyHolder
{
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height;                   
    private double weight;                 
 
    public PolicyHolder(String firstName, String lastName, int age,
                        String smokingStatus, double height, double weight)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.height = height;
        this.weight = weight;
    }
        public int getAge() 
    {
        return age;
    }
 
      public String getSmokingStatus()
    {
        return smokingStatus;
    }
       public double calculateBMI()
    {
        double bmi = (weight * 703) / (height * height);
        return bmi;
    }
      public String toString()
    {
        return "Policyholder's First Name: " + firstName + "\n\n" +
               "Policyholder's Last Name: " + lastName + "\n\n" +
               "Policyholder's Age: " + age + "\n\n" +
               "Policyholder's Smoking Status (Y/N): " + smokingStatus + "\n\n" +
               "Policyholder's Height: " + height + " inches\n\n" +
               "Policyholder's Weight: " + weight + " pounds\n\n" +
               String.format("Policyholder's BMI: %.2f", calculateBMI());
    }
}