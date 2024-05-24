/**
 * Class representing a Gas Station Attendant.
 *
 * @author Emma Lee, Walter Chu
 * @version 2024
 */
public class GasStationAttendant extends Employee implements Comparable<GasStationAttendant>
{
    /**
     * The amount of money stolen per day by the gas station attendant.
     */
    private double numberOfDollarsStolenPerDay;

    /**
     * Constructs a GasStationAttendant with the given name and amount of money stolen per day.
     *
     * @param name the name of the gas station attendant.
     * @param numberOfDollarsStolenPerDay the amount of money stolen per day.
     */
    public GasStationAttendant(final String name, final double numberOfDollarsStolenPerDay)
    {
        super(name);
        this.numberOfDollarsStolenPerDay = numberOfDollarsStolenPerDay;
    }

    @Override
    public String getDressCode()
    {
        return "uniform";
    }

    @Override
    public boolean isPaidSalary()
    {
        return false;
    }

    @Override
    public boolean postSecondaryEducationRequired()
    {
        return false;
    }

    @Override
    public String getWorkVerb()
    {
        return "pump";
    }

    @Override
    public double getOverTimePayRate()
    {
        return 1.5;
    }

    /**
     * Compares this GasStationAttendant with another based on the amount of money stolen per day.
     *
     * @param other the other GasStationAttendant to compare to.
     * @return a negative integer, zero, or a positive integer as specified by GasStationAttendant.
     */
    @Override
    public int compareTo(final GasStationAttendant other)
    {
        return Double.compare(other.numberOfDollarsStolenPerDay, this.numberOfDollarsStolenPerDay);
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
        GasStationAttendant that = (GasStationAttendant) obj;

        return Double.compare(that.numberOfDollarsStolenPerDay, numberOfDollarsStolenPerDay) == 0;
    }

    /**
     * Returns a hash code value for the object.
     *
     * @return a hash code value for this object.
     */
    @Override
    public int hashCode()
    {
        return Double.hashCode(numberOfDollarsStolenPerDay);
    }
}
