import java.util.ArrayList; 
import java.util.List; 
 
public class hotel { 
    public static void main(String[] args) { 
        List mh = new ArrayList<>(); 
 
        mh.add("puran poli"); 
        mh.add("tambda pandra rassa"); 
        mh.add("vadapav"); 
        mh.add("kombdi vade"); 
        System.out.println("mh :-" + mh); 
 
        List south = new ArrayList<>(); 
        south.add("idli"); 
        south.add("sambar "); 
        south.add("dhosa"); 
        south.add("chatni chatni"); 
 
        System.out.println("south :-" + south); 
 
        List north = new ArrayList<>(); 
 
        north.add("chole bhature"); 
        north.add("buter chiken"); 
        north.add("rajma"); 
        System.out.println("north :-" + north); 
 
        List hotel = new ArrayList<>(); 
 
        hotel.addAll(mh); 
        hotel.addAll(south); 
        hotel.addAll(north); 
 
        System.out.println("Qspider ka dhaba :-" + hotel); 
 
        north.add(2, "naan");//add object in perticular position/index 
 
        System.out.println("north :-" + north); 
 
        List china = new ArrayList<>(); 
 
        china.add("hakka nodels"); 
        china.add("momos"); 
        china.add("mancurian"); 
        china.add("rice"); 
 
        System.out.println("china :-" + china); 
 
 
        hotel.addAll(4, china); 
        System.out.println("Qspider ka dhaba -:" + hotel); 
 
        hotel.removeAll(south); 
        System.out.println("Qspider ka dhaba -:" + hotel); 
 
        if (hotel.containsAll(south)) { 
            System.out.println("south  is present in the dhaba"); 
        } else { 
            System.out.println("south is not present in the qspider ka dhaba"); 
        } 
 
 
    } 
} 