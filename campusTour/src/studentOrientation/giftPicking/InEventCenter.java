package studentOrientation.giftPicking;

import studentOrientation.Measures.CarbonFootprintI;
import studentOrientation.Measures.CostI;
import studentOrientation.Measures.DurationI;
import studentOrientation.Measures.EffortI;
import studentOrientation.OrientationPlanner.OrientationBuilder;
import studentOrientation.util.Results;

public class InEventCenter implements CarbonFootprintI,CostI,EffortI,DurationI,GiftLocationSelectI {

	private final int Effort=157;
	private final double Cost=2.00;
	private final double CarbonFootprint= 0.265;
	private final double Duration=18;

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
	public String GiftLocationvisitDetails() {
		
		OrientationBuilder.r.findTotalEstimate(Effort, Cost, CarbonFootprint, Duration);
		String details="Event Center to Collect Gift\n"+ "Effort in Calories: "+getEffort()+" Cost= "+getCost()+
				" Carbon Footprint= "+getCarbonFootprint()+" Duration="+getDuration()+"\n";
		return details;
	}
	
	public String toString() {
		return "Class for Event Center";
	}

}
