import java.lang.reflect.*;
public class CreateObject
{
public static void main(String args[]) throws ClassNotFoundException , NoSuchMethodException , InstantiationException, InstantiationException, IllegalAccessException, InvocationTargetException
{
		Class<?> theClass =  Class.forName("java.lang.Integer");
		Constructor<?> constr = theClass.getConstructor(String.class);
		String one = "1";
	Object i =	constr.newInstance(new Object[]{one});



Integer ii = (Integer)i;
System.out.println(ii.intValue());


}
}
