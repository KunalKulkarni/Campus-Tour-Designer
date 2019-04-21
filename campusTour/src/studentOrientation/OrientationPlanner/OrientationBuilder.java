package studentOrientation.OrientationPlanner;

import studentOrientation.buildingTour.BuildingEnums;
import studentOrientation.buildingTour.BuildingVisit;
import studentOrientation.buildingTour.BuildingVisitI;
import studentOrientation.cafeteriaSelection.CafeteriaVisit;
import studentOrientation.cafeteriaSelection.CafeteriaVisitI;
import studentOrientation.cafeteriaSelection.CafeteriaEnums;
import studentOrientation.giftPicking.GiftLocationSelect;
import studentOrientation.giftPicking.GiftLocationSelectI;
import studentOrientation.giftPicking.Giftenums;
import studentOrientation.lectureSelect.LectureEnums;
import studentOrientation.lectureSelect.LectureSelect;
import studentOrientation.lectureSelect.LectureSelectI;
import studentOrientation.util.Results;

public class OrientationBuilder implements OrientationCreator{

	BuildingEnums buildingEnums1;
	BuildingEnums buildingEnums2;
	CafeteriaEnums cafeteriaEnums;
	Giftenums giftEnums;
	LectureEnums lectureEnums;
	BuildingVisitI buildingVisitI1;
	BuildingVisitI buildingVisitI2;
	GiftLocationSelectI giftLocationSelectI;
	CafeteriaVisitI cafeteriaVisitI;
	LectureSelectI lectureSelectI;

	public static Results r=new Results();

	
	String details="";
	public OrientationBuilder(BuildingEnums buildingEnumsIn1,BuildingEnums buildingEnumsIn2,CafeteriaEnums cafeteriaEnumsIn,
			Giftenums giftenumsIn,LectureEnums lectureEnumsIn) {
		
		buildingEnums1=buildingEnumsIn1;
		buildingEnums2=buildingEnumsIn2;
		cafeteriaEnums=cafeteriaEnumsIn;
		giftEnums=giftenumsIn;
		lectureEnums=lectureEnumsIn;
		
	}
	@Override
	public void buildBuilding() {
		
		buildingVisitI1=BuildingVisit.createVisit(buildingEnums1);
		details+=buildingVisitI1.BuildingVisitDetails()+"\n";
		buildingVisitI2=BuildingVisit.createVisit(buildingEnums2);
		details+=buildingVisitI2.BuildingVisitDetails()+"\n";		

	}

	@Override
	public void buildGiftLocation() {
		
		giftLocationSelectI=GiftLocationSelect.createGiftLocationVisit(giftEnums);
		details+=giftLocationSelectI.GiftLocationvisitDetails()+"\n";
	}

	@Override
	public void buildCafetaria() {
		
		cafeteriaVisitI=CafeteriaVisit.createCafeteriaVisit(cafeteriaEnums);
		details+=cafeteriaVisitI.CafeteriaVisitdetails()+"\n";

	}

	@Override
	public void buildLecture() {
		
		lectureSelectI=LectureSelect.createLectureSelect(lectureEnums);
		details+=lectureSelectI.LectureSelectDetails()+"\n";
	}

	public String toString() {
		
		details+=r.printTotalEstimate();
		return details;
	}
}
