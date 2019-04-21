package studentOrientation.buildingTour;

import studentOrientation.Measures.CarbonFootprintI;
import studentOrientation.Measures.CostI;
import studentOrientation.Measures.DurationI;
import studentOrientation.Measures.EffortI;
import studentOrientation.OrientationPlanner.OrientationBuilder;
import studentOrientation.util.Results;


public class BusTour implements BuildingVisitI,CarbonFootprintI,CostI,EffortI,DurationI{

	private final int Effort=50;
	private final double Cost=1.00;
	private final double CarbonFootprint= 0.5;
	private final double Duration=15.06;

/**
 * This function Returns the value of effort required to perform given activity. 
 * @return An int each time the function is called.
 */	
@Override
public int getEffort() {
	// TODO Auto-generated method stub
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
	// TODO Auto-generated method stub
	return CarbonFootprint;
}

/**
 * This function Returns the time required to perform given activity. 
 * @return An double each time the function is called.
 */	
@Override
public double getDuration() {
	// TODO Auto-generated method stub
	return Duration;
}

/**
 * This function Returns all the details to perform given activity. 
 * @return A String each time the function is called.
 */	

@Override
public String BuildingVisitDetails() {
	// TODO Auto-generated method stub
	OrientationBuilder.r.findTotalEstimate(Effort, Cost, CarbonFootprint, Duration);
	String details= "Bus Tour\n"+"Effort in Calories: "+getEffort()+" Cost= "+getCost()+
			" Carbon Footprint= "+getCarbonFootprint()+" Duration="+getDuration()+"\n";
	return details;
}

public String toString() {
	return "Bus Tour class";
}
}
