package studentOrientation.OrientationPlanner;

public class TourBuilder implements OrientationWorkshop {
	 
	private OrientationCreator orientationCreator;
	
	
	
	@Override
	public void createOrientation(OrientationCreator orientationCreator) {
		
		orientationCreator.buildBuilding();
		orientationCreator.buildGiftLocation();
		orientationCreator.buildCafetaria();
		orientationCreator.buildLecture();
		
	}
	public String toString() {
		return "Class that implements and combines all Orientation Activities";
	}
}
