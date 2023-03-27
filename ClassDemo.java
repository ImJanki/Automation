package com;

public class ClassDemo {
	int id;
	String name;// variable declare
	private void setData() {// method
		 
		id=1;
		name="ekta";
				
	}
  private void display() {
	  System.out.println("id is"+id);
	  System.out.println("name is"+ name);


	
}
		
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      // classname objectname= new classname
		
		ClassDemo s1=new ClassDemo();
		s1.setData();
		s1.display();
		
	}

}
