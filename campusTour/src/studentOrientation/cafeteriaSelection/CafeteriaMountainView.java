package studentOrientation.cafeteriaSelection;

import studentOrientation.Measures.CarbonFootprintI;
import studentOrientation.Measures.CostI;
import studentOrientation.Measures.DurationI;
import studentOrientation.Measures.EffortI;
import studentOrientation.OrientationPlanner.OrientationBuilder;

public class CafeteriaMountainView implements CarbonFootprintI,CostI,EffortI,DurationI,CafeteriaVisitI{

	
	private int Effort=40;
	CafeteriaCiw ciw=new CafeteriaCiw();
	private double Cost=0.00;
	private final double CarbonFootprint= 0.025;
	private final double Duration=25;
	

	/**
	 * This function Returns the value of effort required to perform given activity. 
	 * @return An int each time the function is called.
	 */	

	@Override
	public int getEffort() {
		
		return Effort;
	}

	/**
	 * This function Returns the cost required to perform given activity. 
	 * @return A double each time the function is called.
	 */	

	@Override
	public double getCost() {

		Cost=ciw.getCost()+ciw.getCost()*0.05;
		return Cost;
	}

	/**
	 * This function Returns the value of Carbon Foot print emitted to perform given activity. 
	 * @return A double each time the function is called.
	 */	

	@Override
	public double getCarbonFootprint() {
		
		return CarbonFootprint;
	}

	/**
	 * This function Returns the time required to perform given activity. 
	 * @return An double each time the function is called.
	 */	
	@Override
	public double getDuration() {
		
		return Duration;
	}
	/**
 	* This function Returns  all the details to perform given activity. 
 	* @return A String each time the function is called.
 	*/	


	@Override
	public String CafeteriaVisitdetails() {
		
		OrientationBuilder.r.findTotalEstimate(Effort, Cost, CarbonFootprint, Duration);
		String details= "Mountain View Cafeteria\n"+"Effort in Calories: "+getEffort()+" Cost= "+getCost()+
				" Carbon Footprint= "+getCarbonFootprint()+" Duration="+getDuration()+"\n";
		return details;
	}
	public String toString() {
		return "Mountain View Cafeteria class";
	}

}
