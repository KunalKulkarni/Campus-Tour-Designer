package studentOrientation.lectureSelect;

public class LectureSelect {
public static LectureSelectI createLectureSelect(LectureEnums LectureEnumsIn ) {
	LectureSelectI lectureSelectI=null;
	
	LectureEnums cs240=LectureEnums.CS240;
	LectureEnums cs542=LectureEnums.CS542;
	
	if(cs240==LectureEnumsIn) {
		lectureSelectI=new InClassLecture();
	}else if(cs542==LectureEnumsIn) {
		lectureSelectI=new VideoStreamLecture();
	}
	return lectureSelectI;
	
}
public String toString() {
	return "Class to identify type of Lecture";
}
}
