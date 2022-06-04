package Ass3;

public enum Stadium {

	EDEN_GARDENS_STADIUM{
		@Override
		public void ground() {
			System.out.println("This is the home ground of KKR");
			System.out.println("Enjoy the Game ");

		}
	},
	WANKHEDE_STADIUM{
		@Override
		public void ground() {
			System.out.println("This is the home ground of Mumbai Indians");
			System.out.println("Enjoy the Game ");

		}
	},
	CHIDAMBARAM_STADIUM{
		@Override
		public void ground() {
			System.out.println("This is the home ground of CSK");
			System.out.println("Enjoy the Game ");

		}
	},
	M_CHINNASWAMY_STADIUM{
		@Override
		public void ground() {
			System.out.println("This is the home ground of RCB");
			System.out.println("Enjoy the Game ");
		}
	};
	
	public void ground() {
	System.out.println("This is the Home Ground");
	}
}
