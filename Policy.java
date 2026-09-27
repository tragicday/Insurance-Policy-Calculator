public class Policy
{
    private String policyNumber;
    private String providerName;
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;   // "smoker" / "non-smoker"
    private double height;          // inches
    private double weight;          // pounds

    /**
     * creates a policy object with default values
     */
    public Policy()
    {
        policyNumber = "N/A";
        providerName = "N/A";
        firstName = "N/A";
        lastName = "N/A";
        age = 0;
        smokingStatus = "non-smoker";
        height = 0.0;
        weight = 0.0;
    }

    /**
     * creates a policy object initialized with the given values.
     *
     * @param policyNumber the policy's ID number
     * @param providerName the name of the insurance provider
     * @param firstName the policyholder's first name
     * @param lastName the policyholder's last name
     * @param age the policyholder's age
     * @param smokingStatus the policyholder's smoking status ("smoker" or "non-smoker")
     * @param height the policyholder's height in inches
     * @param weight the policyholder's weight in pounds
     */
    public Policy(String policyNumber, String providerName, String firstName,
                  String lastName, int age, String smokingStatus,
                  double height, double weight)
    {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.height = height;
        this.weight = weight;
    }

    // Setters

    /**
     * sets the policy number
     *
     * @param policyNumber the policy's identification number
     */
    public void setPolicyNumber(String policyNumber)
    {
        this.policyNumber = policyNumber;
    }

    /**
     * sets the provider name
     *
     * @param providerName the name of the insurance provider
     */
    public void setProviderName(String providerName)
    {
        this.providerName = providerName;
    }

    /**
     * sets the policyholder's first name
     *
     * @param firstName the policyholder's first name
     */
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    /**
     * sets the policyholder's last name
     *
     * @param lastName the policyholder's last name
     */
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    /**
     * sets the policyholder's age
     *
     * @param age the policyholder's age
     */
    public void setAge(int age)
    {
        this.age = age;
    }

    /**
     * sets the policyholder's smoking status
     *
     * @param smokingStatus the policyholder's smoking status ("smoker" or "non-smoker")
     */
    public void setSmokingStatus(String smokingStatus)
    {
        this.smokingStatus = smokingStatus;
    }

    /**
     * sets the policyholder's height
     *
     * @param height the policyholder's height, in inches
     */
    public void setHeight(double height)
    {
        this.height = height;
    }

    /**
     * sets the policyholder's weight
     *
     * @param weight the policyholder's weight, in pounds
     */
    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    // Accessors

    /**
     * returns the policy number
     *
     * @return the policy's identification number
     */
    public String getPolicyNumber()
    {
        return policyNumber;
    }

    /**
     * returns the provider name
     *
     * @return the name of the insurance provider
     */
    public String getProviderName()
    {
        return providerName;
    }

    /**
     * returns the policyholder's first name
     *
     * @return the policyholder's first name
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * returns the policyholder's last name
     *
     * @return the policyholder's last name
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * returns the policyholder's age
     *
     * @return the policyholder's age
     */
    public int getAge()
    {
        return age;
    }

    /**
     * returns the policyholder's smoking status
     *
     * @return the policyholder's smoking status ("smoker" or "non-smoker")
     */
    public String getSmokingStatus()
    {
        return smokingStatus;
    }

    /**
     * returns the policyholder's height
     *
     * @return the policyholder's height, in inches
     */
    public double getHeight()
    {
        return height;
    }

    /**
     * returns the policyholder's weight
     *
     * @return the policyholder's weight, in pounds
     */
    public double getWeight()
    {
        return weight;
    }

   // BMI calculator

    /**
     * calculates the policyholder's BMI using their height and weight
     *
     * @return the policyholder's BMI
     */
    public double calculateBMI()
    {
        double bmi = (weight * 703) / (height * height);
        return bmi;
    }

    /**
     * calculates the price of the insurance policy based on a $600
     * fee plus more fees for ages over 50, smoking status, and a
     * BMI over 35
     *
     * @return the total price of the insurance policy
     */
      public double calculatePrice()
    {
        double price = 600.0;

        if (age > 50)
        {
            price = price + 75.0;
        }

        if (smokingStatus.equalsIgnoreCase("smoker"))
        {
            price = price + 100.0;
        }

        double bmi = calculateBMI();
        if (bmi > 35)
        {
            price = price + (bmi - 35) * 20;
        }

        return price;
    }
}