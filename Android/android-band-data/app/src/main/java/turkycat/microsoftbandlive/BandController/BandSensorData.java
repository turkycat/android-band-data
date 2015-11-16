package turkycat.microsoftbandlive.BandController;

/**
 * A thread-safe class to manage Microsoft Band sensor data
 * Created by turkycat on 11/15/2015.
 */
public class BandSensorData
{

    //current sensor data
    private AccelerometerData accelerometerData;

    //***************************************************************
    // constructors
    //***************************************************************/

    public BandSensorData()
    {
        accelerometerData = new AccelerometerData( 0.0, 0.0, 0.0 );
    }

    //***************************************************************
    // public getters
    //***************************************************************/

    public AccelerometerData getAccelerometerData()
    {
        synchronized( this )
        {
            return accelerometerData;
        }
    }

    //***************************************************************
    // public setters
    //***************************************************************/

    public void setAccelerometerData( AccelerometerData accelerometerData )
    {
        synchronized( this )
        {
            this.accelerometerData = accelerometerData;
        }
    }
}