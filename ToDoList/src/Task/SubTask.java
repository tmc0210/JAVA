package Task;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class SubTask extends TempTask
{
    private ArrayList<SubTask> subTaskList= new ArrayList<>();

    public SubTask(String name, Date deadLine,String description)
    {
        super(name,deadLine,description);
    }

    public SubTask(String name, Date deadLine,String description,ArrayList<SubTask> subTaskList)
    {
        super(name,deadLine,description);
        this.subTaskList = subTaskList;
    }

    @Override
    boolean modify() {
        return false;
    }

    @Override
    void reveal() {
    }
}
