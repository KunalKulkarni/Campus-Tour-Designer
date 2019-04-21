package studentOrientation.cafeteriaSelection;

public class CafeteriaVisit{
public static CafeteriaVisitI createCafeteriaVisit (CafeteriaEnums cafeteriaEnumsIn){
	
	CafeteriaVisitI cafeteriaVisitI=null;
	CafeteriaEnums ciw=CafeteriaEnums.CIW;
	CafeteriaEnums mountain_view=CafeteriaEnums.MOUNTAIN_VIEW;
	
	if(cafeteriaEnumsIn==ciw) {
		cafeteriaVisitI=new CafeteriaCiw();
		
	}
	else if(cafeteriaEnumsIn==mountain_view) {
		cafeteriaVisitI=new CafeteriaMountainView();
	}
	
	return cafeteriaVisitI;
}

public String toString() {
	return "Class to identify type of Cafeteria";
}
}
