class Lab extends Student
	{
		String b_id;
		String b_name;
		String b_author;
		String b_issue;
		String b_return;
		
		public void Stud_Lab_Detail(String b_id, String b_name, String b_author, String b_issue, String b_return)
			{
				
			System.out.println("Id:"+id+"Name:"+name+"Class:"+sclass
			+"Book_Id:"+b_id+"Book_Name:"+b_name+"Book_Author:"+b_author
			+"Book_Issue:"+b_issue+"Book_Return:"+b_return);
				
			}

	
		public static void main(String args[])
			{
			
			Lab s1=new Lab();
			s1.Display(101,"Dipak","M.sc");
			s1.Stud_Lab_Detail("B1345","C++","dipak","10/10/2020","12/10/2020");
			}	
	
	}

