package studentOrientation.util;

import java.text.DecimalFormat;

import studentOrientation.OrientationPlanner.OrientationCreator;


public class Results {

	public  int Final_Effort=0;
	public  double Final_Cost=0.0;
	public  double Final_CarbonFootprint= 0.0;
	public  double Final_Duration=0.0;
	
	public  void findTotalEstimate(int EffortIn,double CostIn,double CarbonFPIn,double DurationIn) {
		
		Final_Effort=Final_Effort+EffortIn;
		Final_Cost=Final_Cost+CostIn;
		Final_CarbonFootprint=Final_CarbonFootprint+CarbonFPIn;
		Final_Duration=Final_Duration+DurationIn;
	}
	
	public String printTotalEstimate() {
	
	DecimalFormat df2 = new DecimalFormat("0.##");
	
	String Measures="Total Effort : \t"+Final_Effort+ "\n" +"Total Cost : \t"+Final_Cost+"\n"+"Total Carbon Footprint : "
			+df2.format(Final_CarbonFootprint)+"\n"+ "Total Duration : "+Final_Duration+"\n";
	return Measures; 
	
	}
	public String toString() {
		return "Results class to combine all measures and costs";
	}
}
