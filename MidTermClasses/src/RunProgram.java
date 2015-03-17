/**
 * Main class
 * @author jmosco
 *
 */
public class RunProgram {

	public static void main(String[] args) {

		Person student1 = new Student("Jon Mosco", "5206 New Kent Road, Compton CA", "3023456863", "jonny.mosco@gmail.com", "FRESHMAN");
		Person employee1 = new Employee("Jessica Mosco", "5206 New Kent Road, Compton CA", "3023456863", "jonny.mosco@gmail.com");
		Person student2 = new Student("SuperMan", "123 MiddleOf, Nowhere, USA", "3023456863", "jonny.mosco@gmail.com", "SOPHMORE");
		
		System.out.println(student1.toString() + " \n");
		
		System.out.println("Number of Student Objects created: " + Student.getCount());
		
		student1 = null;
		
		System.gc();
		
		System.out.println("Number of Student Objects created after deltion: " + Student.getCount());
		
		System.out.println(employee1.toString() + "\n");
		System.out.println(student2.toString() + " \n");
		
	}

}
