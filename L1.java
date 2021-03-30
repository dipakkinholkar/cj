interface lambda
{
	void show();

}


	class L1
	{
		public static void main(String args[])
		{
			lambda l;
			
			l=new lambda()
			{
				
				public void show()
				{

				System.out.println("show");
				}


			};

			l.show();

		}

	}