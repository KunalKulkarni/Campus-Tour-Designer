package studentOrientation.giftPicking;

public class GiftLocationSelect {
	public static GiftLocationSelectI createGiftLocationVisit(Giftenums GiftenumsIn ) {
		
		GiftLocationSelectI giftlocationselectI=null;
		Giftenums universityUnion=Giftenums.UNIVERSITY_UNION;
		Giftenums eventcenter=Giftenums.EVENT_CENTER;
		
		if (eventcenter==GiftenumsIn) {
			giftlocationselectI=new InEventCenter();
		}else if(universityUnion==GiftenumsIn){
			giftlocationselectI=new InUniversityUnion();
		}
		return giftlocationselectI;
	}
	public String toString() {
		return "Class to identify location to pick a gift";
	}
}
