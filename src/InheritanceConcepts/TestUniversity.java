package InheritanceConcepts;

public class TestUniversity {

	public static void main(String[] args) {
	
		Sanford s = new Sanford();
		s.classroom();
		s.regularclasses();
		s.eveningclasses();
		s.dualdegreecourses();
		s.playground();
		s.specialcourses();
		s.Phdcourses();
		
		MIT m = new MIT();
		m.classroom();
		m.regularclasses();
		m.eveningclasses();
		m.dualdegreecourses();
		m.Phdcourses();
		m.playground();
		m.specialcourses();
		
		NYU n = new NYU();
		n.regularclasses();
		n.eveningclasses();
		n.classroom();
		n.playground();
		n.Phdcourses();
		n.specialcourses();
		n.dualdegreecourses();
		
					
		University u = new University();
		u.classroom();
		u.regularclasses();
		u.eveningclasses();
		u.playground();
		
		//Top casting
		University u1 = new Sanford();
		u1.classroom();
		u1.regularclasses();
		u1.eveningclasses();
		u1.playground();
		
		//Down casting
		
		//MIT mit = (MIT) new University();
		
		
		
		
		
		
	}

}
