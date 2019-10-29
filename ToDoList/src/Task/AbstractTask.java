package Task;

import java.util.Scanner;

public abstract class AbstractTask
{
    private String name;
    private String description;
    private boolean finished = false;

    protected AbstractTask(String name, String description)
    {
        this.name = name;
        this.description = description;
    }

    abstract boolean modify();

    abstract void reveal();

    public String isFinishedByString()
    {
        if (finished)
            return name + "is finished";
        else
            return name + "is not finished";
    }

    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return description;
    }

    public boolean isFinished()
    {
        return finished;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public void setFinished(boolean finished)
    {
        this.finished = finished;
    }
}
