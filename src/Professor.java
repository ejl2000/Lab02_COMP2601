/**
 * Class representing a Professor.
 *
 * @author Emma Lee, Walter Chu
 */
public class Professor extends Employee implements Comparable<Professor>
{
    /**
     * The major subject taught by the professor.
     */
    private String teachingMajor;

    /**
     * Constructs a Professor with the given name and teaching major.
     *
     * @param name the name of the professor.
     * @param teachingMajor the teaching major of the professor.
     */
    public Professor(final String name, final String teachingMajor)
    {
        super(name);
        this.teachingMajor = teachingMajor;
    }


    /**
     * Gets the dress code of the professor.
     */
    @Override
    public String getDressCode()
    {
        return "fancy";
    }

    /**
     * Gets whether the professor is paid or not.
     */
    @Override
    public boolean isPaidSalary()
    {
        return true;
    }

    /**
     * Gets whether the professor requires post-secondary education or not.
     */
    @Override
    public boolean postSecondaryEducationRequired()
    {
        return true;
    }

    /**
     * Gets the type of work that the professor does.
     */
    @Override
    public String getWorkVerb()
    {
        return "teach";
    }

    /**
     * Gets the overtime pay rate of the professor.
     */
    @Override
    public double getOverTimePayRate()
    {
        return 2.0;
    }

    /**
     * Compares this Professor with another based on the teaching major.
     *
     * @param other the other Professor to compare to.
     * @return a negative integer, zero, or a positive integer in terms of teaching major.
     */
    @Override
    public int compareTo(final Professor other)
    {
        if (this.teachingMajor.equals("Computer Systems") && !other.teachingMajor.equals("Computer Systems"))
        {
            return -1;
        }
        else if (!this.teachingMajor.equals("Computer Systems") && other.teachingMajor.equals("Computer Systems"))
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     *
     * @param obj the reference object with which to compare.
     * @return true if this object is the same as the obj argument; false otherwise.
     */
    @Override
    public boolean equals(final Object obj)
    {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Professor that = (Professor) obj;

        return teachingMajor.equals(that.teachingMajor);
    }

    /**
     * Returns a hash code value for the object.
     *
     * @return a hash code value for this object.
     */
    @Override
    public int hashCode()
    {
        return teachingMajor.hashCode();
    }
}