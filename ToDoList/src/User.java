import Task.*;

import java.util.ArrayList;
import java.util.Scanner;

public class User
{
    private ArrayList<TaskList> list = new ArrayList<>();

    public static void main(String[] args)
    {
        User user = new User();
        do {
        }while (user.menu());
    }

    private boolean menu()
    {
        reveal();
        return input();
    }

    private void reveal()
    {
        int i = 0;
        System.out.println("Welcome to the ToDoList");
        System.out.println("Enter the number to the corresponding entries and 0 to modify your GeneralList");
        for (i = 0; i < list.size() ;i++)
        {
            System.out.print((i + 1) + " " +getTaskList(i).getName() + " ");
        }
    }

    private boolean input()
    {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if ( i <= list.size() && i >= 0)
        {
            if (i == 0)
            {
                modify();
            }
            else
            {
                getTaskList(i - 1).menu();
            }
        }
        else
        {
            System.out.println("Please enter the correct number");

        }
        return true;
    }

    private void modify()
    {

    }

    public void addTaskList(TaskList taskList)
    {
        list.add(taskList);
    }

    public void removeTaskList(int i)
    {
        list.remove(i);
    }

    public TaskList getTaskList(int i)
    {
        return list.get(i);
    }
}
