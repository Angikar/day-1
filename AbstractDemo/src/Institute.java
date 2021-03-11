
public class Institute {
public static void main(String[] args) {
	StudentAbstract student1 = new HighSchoolAbstract();
	student1.admit();
	student1.study();
	StudentAbstract student2 = new CollegeStudent();
	student2.study();
}
}
