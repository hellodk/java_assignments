/*
 * You are given a class CanYouAccess and an inner class Inner.Private. 
 * You have to call the method print() of the class Inner.
 * Private from the main method of the class CanYouAccess and print the output.
 * 
 */
 

public class AccessInnerClassMethod {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object o;
		Inner inner = new Inner();
		System.out.println(inner.getClass());
		o = inner.new Private();
		System.out.println(o.getClass());
		
		Inner.Private innerPrivate = (Inner.Private) o;
		innerPrivate.print();
	}
	
	static class Inner{
		private class Private{
			private void print()
			{
				System.out.println("This is the method in the Private inner class");
			}
		}
	} 	
 
}