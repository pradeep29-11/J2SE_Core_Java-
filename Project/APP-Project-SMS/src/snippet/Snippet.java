package snippet;

public class Snippet {
	StudentDao dao = new StudentDao();
			
			List<Student> L = dao.getAllStudents();
			
			if(L.isEmpty())
			{
				System.out.println("No Records Found !!");
			}
			else
			{
			
				for(Student S : L)
				{
					S.display();
				}
			}
			System.out.println("done....");
	
}

