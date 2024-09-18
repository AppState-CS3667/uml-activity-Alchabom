public class GasBurner extends Burner
{
    public GasBurner(double maxTemp, double minTemp, double diameter) 
    {
        super(maxTemp, minTemp, diameter); 
    }

    private String gasType;



    public boolean Spark()
    {
        return false;
    }

    public String getGasType()
    {
        return "";
    }

    private void increaseGasFlow()
    {

    }

    private void decreaseGasFlow()
    {

    }
}
