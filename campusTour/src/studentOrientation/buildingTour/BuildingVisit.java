package studentOrientation.buildingTour;

public class BuildingVisit {
	
public static BuildingVisitI createVisit(BuildingEnums BuildEnumIn) {
	
	
	BuildingVisitI buildingVisitI=null;
	BuildingEnums bus=BuildingEnums.BUS_TOUR;
	BuildingEnums foot=BuildingEnums.FOOT_TOUR;
	if(BuildEnumIn==bus) {
		buildingVisitI=new BusTour();
		
	}
	else if(BuildEnumIn==foot) {
		buildingVisitI=new OnFootTour();
	}
	
	
	return buildingVisitI;
}
	public String toString() {
		
		return "Class used to return object of type of tour";
	}
}
