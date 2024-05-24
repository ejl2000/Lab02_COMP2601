/**
 * Class representing a Hockey Player.
 *
 * @author Emma Lee, Walter Chu
 * @version 2024
 */
public class HockeyPlayer extends Employee implements Comparable<HockeyPlayer>
{
    /**
     * The number of goals scored by the hockey player.
     */
    private int numberOfGoals;

    /**
     * Constructs a HockeyPlayer with the given name and number of goals.
     *
     * @param name the name of the hockey player.
     * @param numberOfGoals the number of goals scored by the hockey player.
     */
    public HockeyPlayer(final String name, final int numberOfGoals)
    {
        super(name);
        this.numberOfGoals = numberOfGoals;
    }

    /**
     * Overrides the getDressCode method with proper property.
     */
    @Override
    public String getDressCode()
    {
        return "jersey";
    }

    /**
     * Overrides the isPaidSalary method with proper property.
     */
    @Override
    public boolean isPaidSalary()
    {
        return true;
    }

    /**
     * Overrides the postSecondaryEducationRequired method with proper property.
     */
    @Override
    public boolean postSecondaryEducationRequired()
    {
        return false;
    }

    /**
     * Overrides the getWorkVerb method with proper property.
     */
    @Override
    public String getWorkVerb()
    {
        return "play";
    }

    /**
     * Overrides the getOverTimePayRate method with proper property.
     */
    @Override
    public double getOverTimePayRate()
    {
        return 0.0;
    }

    /**
     * Compares this HockeyPlayer with another based on the number of goals scored.
     *
     * @param other the other HockeyPlayer to compare to.
     * @return a negative integer, zero, or a positive integer depending on goals scored.
     */
    @Override
    public int compareTo(final HockeyPlayer other)
    {
        return Integer.compare(other.numberOfGoals, this.numberOfGoals);
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
        HockeyPlayer that = (HockeyPlayer) obj;

        return numberOfGoals == that.numberOfGoals;
    }

    /**
     * Returns a hash code value for the object.
     * @return a hash code value for this object.
     */
    @Override
    public int hashCode()
    {
        return Integer.hashCode(numberOfGoals);
    }
}
