package ExceptionHandling;

public class ThrowConcept {

	public static void main(String[] args) {
		
		
		try {
			throw new Exception ("This is my Exception");
		} catch (Exception e) {
				e.printStackTrace();
		}
		
		String colval = null;
		if (colval==null){
			try {
				throw new Exception ("This is my Exception");
			} catch (Exception e) {
							e.printStackTrace();
			}
		}
	}

}
