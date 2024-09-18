public class ElectricBurner extends Burner
{

    private double voltReq;
    private double ampReq;

  public ElectricBurner(double voltReq)
  {
    super(voltReq, voltReq, voltReq);
  }

  public void increaseCurrent()
  {

  }

  public void decreaseCurrent()
  {

  }

  public double getVoltReq()
  {
    return 0.0;
  }
}