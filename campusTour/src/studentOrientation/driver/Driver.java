package studentOrientation.driver;

import studentOrientation.OrientationPlanner.OrientationBuilder;
import studentOrientation.OrientationPlanner.OrientationCreator;
import studentOrientation.OrientationPlanner.OrientationWorkshop;
import studentOrientation.OrientationPlanner.TourBuilder;
import studentOrientation.buildingTour.BuildingEnums;
import studentOrientation.cafeteriaSelection.CafeteriaEnums;
import studentOrientation.giftPicking.Giftenums;
import studentOrientation.lectureSelect.LectureEnums;
/*
 * Driver class which takes in input for the kind of Orientation program wanted by the user in form of Enums.
 * This plan is forwarded to a Orienation Workshop which creates the Orientation and then returns the details of
 * the Tour.
 */
public class Driver {

	/**
	 * Parameters to the Builder in the following order:
	 * Builder(Bus/On Foot to Watson,Bus/On Foot to SOM, Cafeteria,Gift Location,Lecture type)
	 * @param args
	 */
	public static void main(String[] args) {

		argCheck(args);
		BuildingEnums buildenum1=BuildingEnums.FOOT_TOUR;
		BuildingEnums buildenum2=BuildingEnums.BUS_TOUR;
		CafeteriaEnums cafeteriaEnums=CafeteriaEnums.CIW;
		LectureEnums lectureEnums=LectureEnums.CS542;
		Giftenums giftenums=Giftenums.EVENT_CENTER;
		
		OrientationWorkshop orientationWorkshop;
		OrientationCreator orientationCreator;
		try {
		orientationCreator= new OrientationBuilder(buildenum1,buildenum2,cafeteriaEnums,giftenums,lectureEnums);
		orientationWorkshop=new TourBuilder();
		orientationWorkshop.createOrientation(orientationCreator);
		System.out.println(orientationCreator);
		
		}
		catch (Exception e) {
			System.err.println("Incorrect number of arguments provided");
			System.exit(1);
		}finally {
			
		}
	}
	public String toString() {
		return "Driver Class to Make the orientation";
	}
	
	static void argCheck(String arr[]){
			
			if(arr.length!=0){
				
				System.err.println("Invalid Number of Arguments. No arguments Allowed.");
				System.exit(1);
			}
			
		
	}
}
