
public class TestProgram {

	public static void main(String[] args) {
		EngineProgram eng = new EngineProgram();
		
		eng.examAbiturients();
		eng.ShowAllTheAbiturients();
		System.out.println("Making a rating depends on everage marks: ");
		eng.countEverage();
		eng.makeRating();
		eng.ShowAllTheAbiturients();    
		eng.whoEnroll();
		  
		 
		

	}

}
