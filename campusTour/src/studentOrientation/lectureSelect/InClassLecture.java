package studentOrientation.lectureSelect;

import studentOrientation.Measures.CarbonFootprintI;
import studentOrientation.Measures.CostI;
import studentOrientation.Measures.DurationI;
import studentOrientation.Measures.EffortI;
import studentOrientation.OrientationPlanner.OrientationBuilder;
import studentOrientation.util.Results;

public class InClassLecture implements CarbonFootprintI,CostI,EffortI,DurationI,LectureSelectI{

	private final int Effort=84;
	private  double Cost=0.00;
	private final double CarbonFootprint= 0.094;
	private final double Duration=24;
	VideoStreamLecture videoStreamLecture=new VideoStreamLecture();
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
		
		Cost=videoStreamLecture.getCost()+videoStreamLecture.getCost()*0.1;
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
	public String LectureSelectDetails() {
		
		OrientationBuilder.r.findTotalEstimate(Effort, Cost, CarbonFootprint, Duration);
		String details= "Effort in Calories: "+getEffort()+" Cost= "+getCost()+
				" Carbon Footprint= "+getCarbonFootprint()+" Duration"+getDuration()+"\n";
		return details;
	}
	public String toString() {
		return "In class lecture class";
	}

}
