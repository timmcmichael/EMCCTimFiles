/*
 * PoolRecordDemo
 *
 * Models a record off pool water records for a single day, using properties.
 *
 * This class works with the version of the PoolRecordDemo program found in PoolRecordDemoProperties.cs.
 *
 */
public class PoolRecord
{
    // Fields
    private string date;
    private int waterTemp;
    private double phLevel;

    // Properties
    public string Date
    {
        get { return this.date; }
        set { this.date = value; }
    }
    public int WaterTemp
    {
        get { return this.waterTemp; }
        set { this.waterTemp = value; }
    }
    public double PhLevel
    {
        get { return this.phLevel; }
        set 
        { 
            if (value >= 0.0 && value <= 14.0)
            {
                this.phLevel = value; 
            }
        }
    }

    // Constructors
    public PoolRecord()
    {
        this.Date = "2025-01-01";
        this.WaterTemp = 0;
        this.PhLevel = 0.0;
    }
    
    public PoolRecord(string date)
    {
        this.Date = date;
        this.WaterTemp = 0;
        this.PhLevel = 0.0;
    }
}
