package Task;

import java.util.Date;
import java.util.Scanner;

public class TempTask extends AbstractTask
{
    private Date deadLine;

    public TempTask(String name, Date deadLine, String description)
    {
        super(name,description);
        this.deadLine = deadLine;
    }

    private boolean menu()
    {
        reveal();
        return modify();
    }

    @Override
    void reveal()
    {
        System.out.println(this.getName() + "is an " + isFinishedByString() + "TempTask ");
        System.out.println("The deadLine is " + getDeadLine());
        System.out.println(getDescription());
        System.out.println("Enter the number to the corresponding entries");
        System.out.println("1.name 2.isfinished 3.deadLine 4.description 5.return");
    }

    @Override
    boolean modify()
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        switch (n)
        {
            case 1:
                System.out.println("Please enter the new name");
                setName(scanner.next());
                return true;
            case 2:
                System.out.println("Please enter the execution");
                setFinished(scanner.nextBoolean());
                return true;
            case 3:
                System.out.println("Please enter the new deadLine");
                setDeadLine(new Date(scanner.nextInt(),scanner.nextInt(),scanner.nextInt()));
                return true;
            case 4:
                System.out.println("Please enter the new description");
                setDescription(scanner.nextLine());
                return true;
            case 5:
                return false;
                default:
                    System.out.println("Please enter the correct number");
                    modify();
        }
        return false;
    }

    public Date getDeadLine()
    {
        return deadLine;
    }

    public void setDeadLine(Date deadLine)
    {
        this.deadLine = deadLine;
    }
}
