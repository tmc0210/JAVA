package Task;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskList
{
    private String name;
    private String type;
    ArrayList<AbstractTask> taskArrayList = new ArrayList<>();

    public TaskList(String name, String type)
    {
        this.name = name;
        this.type = type;
    }

    public boolean menu()
    {
        reveal();
        return input();
    }

    private void reveal()
    {
        int i = 0;
        System.out.println("This is " + name);
        System.out.println("Enter the number to the corresponding entries and 0 to modify this TaskList");
        for (i = 0; i < taskArrayList.size() ;i++)
        {
            System.out.print((i + 1) + " " + getTask(i).getName() + " ");
        }
    }

    private boolean input()
    {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if ( i <= taskArrayList.size() && i >= 0)
        {
            if (i == 0)
            {
                modify();
            }
            else
            {
                getTask(i - 1).reveal();
                getTask(i - 1).modify();
            }
        }
        else
        {
            System.out.println("Please enter the correct number");
            input();
        }
        return true;
    }

    private void modify()
    {
        //modify the TaskList itself
    }

    public AbstractTask getTask(int i)
    {
        return taskArrayList.get(i);
    }

    public void addTask(AbstractTask task)
    {
        taskArrayList.add(task);
    }

    public void removeTask(int i)
    {
        taskArrayList.remove(i);
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }
}
