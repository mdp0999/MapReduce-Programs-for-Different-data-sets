
public class stringFns
{
public static void main(String args[])
{
String data = "0067011990999991950051507004+68750+023550FM-12+038299999V0203301N00671220001CN9999999N9+00001+99999999999";
System.out.println(data);
String portion = data.substring(15,19);
System.out.println(portion);

String tempPortion = data.substring(87,92);
System.out.println(tempPortion);
}
}
