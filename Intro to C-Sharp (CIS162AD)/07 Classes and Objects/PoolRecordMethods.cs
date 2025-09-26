/*
 * PoolRecordDemo
 *
 * Models a record off pool water records for a single day, using traditional getter and setter methods.
 *
 * This program works with the version of the PoolRecordDemo program found in PoolRecordDemoMethods.cs.
 *
 */
public class PoolRecord
{
    // Fields
    private string date;
    private int waterTemp;
    private double phLevel;

    // Getters
    public string GetDate()
    {
        return this.date;
    }

    public int GetWaterTemp()
    {
        return this.waterTemp;
    }

    public double GetPhLevel()
    {
        return this.phLevel;
    }

    // Setters and Mutators
    public void SetDate(string date)
    {
        this.date = date;
    }

    public void SetWaterTemp(int waterTemp)
    {
        this.waterTemp = waterTemp;
    }

    public void SetPhLevel(double phLevel)
    {
        this.phLevel = phLevel;
    }
}
