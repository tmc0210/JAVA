package Task;

import java.util.Date;
import java.util.Scanner;

public class PeriodicTask extends AbstractTask
{
    private Date executionDate;
    private Date cycle;
    private int repeatTimes;

    public PeriodicTask(String name,Date executionDate, int repeatTimes, Date cycle, String description)
    {
        super(name,description);
        this.executionDate = executionDate;
        this.cycle = cycle;
        this.repeatTimes = repeatTimes;
    }

    @Override
    boolean modify() {
        return false;
    }

    @Override
    void reveal() {
    }

    public Date getCycle() {
        return cycle;
    }

    public Date getExecutionDate() {
        return executionDate;
    }

    public int getRepeatTimes() {
        return repeatTimes;
    }

    public void setCycle(Date cycle) {
        this.cycle = cycle;
    }

    public void setExecutionDate(Date executionDate) {
        this.executionDate = executionDate;
    }

    public void setRepeatTimes(int repeatTimes) {
        this.repeatTimes = repeatTimes;
    }
}
