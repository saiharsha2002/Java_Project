package movieticket;

public class dispmovie
{
public void moviedisplay()                                                                                              //Methods
{
System.out.println("Enter respective number to select the movie");
System.out.println("");
String []movielist = {"sitaramam","bramastra","avatar 2d","avatar 3d","Oke Oka Jeevitam","captian","GodFather"};
for(int i=0;i<movielist.length;i++)
{
System.out.println(" "+(i+1)+"."+movielist[i]);

}
System.out.println("");
}
}