/*🔸 Question 9: Media Player – Play Different Media Types
Description:
Create a MediaFile class with method play().
Subclasses:
AudioFile: prints "Playing audio..."
VideoFile: prints "Playing video..."
ImageFile: prints "Displaying image..."
Task:
Write a method startPlayer(MediaFile m) that plays the file based on the object passed.
Goal:
Demonstrate how the same method call behaves differently depending on the runtime object.*/


import java.util.*;

class MediaFile
{
   play()
   {
     System.out.println(" ");
   }
}
class AudioFile extends MediaFile
{
   play()
   {
     System.out.println("Playing audio...");
   }
}
class VideoFile extends MediaFile
{
   play()
   {
     System.out.println("Playing Video...");
   }
}
class ImageFile extends MediaFile
{
  play()
  {
    System.out.println("Displaying Image...");
  }
}

class Player
{
   startPlayer(MediaFile m)
   {
     m.void();
   }
}
public class MPlayerApp
{
  public static void main(String[]args)
  {
     Scanner sc = new Scanner(System.in);
	 
	 Player p1 = new Player();
	 
	 boolean running = false;
	 
	 System.out.pintln("Enter Choice...");
	 int choice = sc.nextInt();
	 
	 while(true)
	 {
	 System.out.println("====Choice====");
	 System.out.println("1.Play Audio File...");
	 System.out.println("2. Play Video File...");
	 System.out.println("3. Play Image File...");
	 
	 S
	 
     
	 
	 
  }

}



