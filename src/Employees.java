import java.util.*;

/**
 * Class representing a collection of Employees.
 *
 * @author Emma Lee, Walter Chu
 * @version 2024
 */
public class Employees
{
    private List<HockeyPlayer> hockeyPlayers;
    private List<Professor> professors;
    private List<Parent> parents;
    private List<GasStationAttendant> gasStationAttendants;

    /**
     * Constructs an Employees object and initializes the employee lists.
     */
    public Employees()
    {
        hockeyPlayers = new ArrayList<>();
        professors = new ArrayList<>();
        parents = new ArrayList<>();
        gasStationAttendants = new ArrayList<>();

        // Adding HockeyPlayers
        hockeyPlayers.add(new HockeyPlayer("Wayne Gretzky", 894));
        hockeyPlayers.add(new HockeyPlayer("Who Ever", 0));
        hockeyPlayers.add(new HockeyPlayer("Brent Gretzky", 1));
        hockeyPlayers.add(new HockeyPlayer("Pavel Bure", 437));
        hockeyPlayers.add(new HockeyPlayer("Jason Wilder", 0));

        // Adding Professors
        professors.add(new Professor("Albert Einstein", "Physics"));
        professors.add(new Professor("Jason Wilder", "Computer Systems"));
        professors.add(new Professor("Richard Feynman", "Physics"));
        professors.add(new Professor("BCIT Instructor", "Computer Systems"));
        professors.add(new Professor("Kurt Godel", "Logic"));

        // Adding Parents
        parents.add(new Parent("Tiger Woods", 1));
        parents.add(new Parent("Super Mom", 168));
        parents.add(new Parent("Lazy Larry", 20));
        parents.add(new Parent("Ex Hausted", 168));
        parents.add(new Parent("Super Dad", 167));

        // Adding GasStationAttendants
        gasStationAttendants.add(new GasStationAttendant("Joe Smith", 10));
        gasStationAttendants.add(new GasStationAttendant("Tony Baloney", 100));
        gasStationAttendants.add(new GasStationAttendant("Benjamin Franklin", 100));
        gasStationAttendants.add(new GasStationAttendant("Mary Fairy", 101));
        gasStationAttendants.add(new GasStationAttendant("Bee See", 1));
    }

    /**
     * Displays and sorts the employee lists.
     */
    public void displayAndSortEmployees()
    {
        System.out.println("Before sorting:");
        displayEmployees();

        Collections.sort(hockeyPlayers);
        Collections.sort(professors);
        Collections.sort(parents);
        Collections.sort(gasStationAttendants);

        System.out.println("\nAfter sorting:");
        displayEmployees();
    }

    /**
     * Displays the employees in the lists.
     */
    private void displayEmployees()
    {
        System.out.println("HockeyPlayers:");
        for (final HockeyPlayer player : hockeyPlayers)
        {
            System.out.println(player.name + " scored " + player.numberOfGoals + " goals");
        }

        System.out.println("Professors:");
        for (final Professor professor : professors)
        {
            System.out.println(professor.name + " teaches " + professor.teachingMajor);
        }

        System.out.println("Parents:");
        for (final Parent parent : parents)
        {
            System.out.println(parent.name + " spends " + parent.weeklyHoursWithKids + " hours/week with kids");
        }

        System.out.println("GasStationAttendants:");
        for (final GasStationAttendant attendant : gasStationAttendants)
        {
            System.out.println(attendant.name + " steals " + attendant.numberOfDollarsStolenPerDay + " dollars/day");
        }
    }

    /**
     * Displays all employees that are equal to one another.
     */
    public void displayEqualEmployees()
    {
        System.out.println("\nEqual employees:");

        printEqualEmployees(hockeyPlayers);
        printEqualEmployees(professors);
        printEqualEmployees(parents);
        printEqualEmployees(gasStationAttendants);
    }

    /**
     * Prints equal employees from the given list.
     *
     * @param list the list of employees to check for equality.
     * @param <T> the type of employees in the list.
     */
    private <T> void printEqualEmployees(final List<T> list)
    {
        for (int i = 0; i < list.size(); i++)
        {
            for (int j = i + 1; j < list.size(); j++)
            {
                if (list.get(i).equals(list.get(j)))
                {
                    System.out.println(list.get(i) + " and " + list.get(j) + " are equal.");
                }
            }
        }
    }

    /**
     * The main method to run the Employees class.
     *
     * @param args the command line arguments.
     */
    public static void main(final String[] args)
    {
        Employees employees = new Employees();
        employees.displayAndSortEmployees();
        employees.displayEqualEmployees();
    }
}
