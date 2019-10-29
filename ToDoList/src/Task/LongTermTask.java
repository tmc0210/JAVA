package Task;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class LongTermTask extends AbstractTask
{
    private Date deadLine;
    private ArrayList<SubTask> subTaskList= new ArrayList<>();

    public LongTermTask(String name, Date deadLine, String description)
    {
        super(name,description);
        this.deadLine = deadLine;
    }

    @Override
    boolean modify() {
        return false;
    }

    @Override
    void reveal() {
    }

    public Date getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(Date deadLine) {
        this.deadLine = deadLine;
    }
}
