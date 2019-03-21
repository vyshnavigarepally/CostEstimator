package costestimate;
/**
 * 
 * @author vyshn
 *
 */
public class CostEstimation
{
  int materialtype;
  double areaofhouse;
  boolean isAutomated;
  /**
   * 
   * @param materialtype
   * @param areaofhouse
   * @param isAutomated
   */
   public  CostEstimation(int materialtype,double areaofhouse, boolean isAutomated)
   {
	   this.materialtype=materialtype;
	   this.areaofhouse=areaofhouse;
	   this.isAutomated=isAutomated;
   }
   /**
    * 
    * @return cost of the house
    */
   public double findCost()
   {
	   int cost=0;
	   if(materialtype==0)
		   cost=1200;
	   else if(materialtype==1)
		   cost=1500;
	   else if(materialtype==2 && isAutomated)
		   cost=2500;
	   else
		   cost=1800;
	   return areaofhouse*cost;
   }
}
