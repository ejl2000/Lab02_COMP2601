/**
 * Abstract class representing an Employee.
 *
 * @author Emma Lee, Walter Chu
 * @version 2024
 */
public abstract class Employee implements Employable
{
    /**
     * The name of the employee.
     */
    protected String name;

    /**
     * Constructs an Employee with the given name.
     *
     * @param name the name of the employee.
     */
    public Employee(final String name)
    {
        this.name = name;
    }

    /**
     * Returns the overtime pay rate for the employee.
     *
     * @return the overtime pay rate as a double.
     */
    public abstract double getOverTimePayRate();

    /**
     * Returns a hash code value for the object.
     *
     * @return a hash code value for this object.
     */
    @Override
    public int hashCode()
    {
        return 0;
    }
}
