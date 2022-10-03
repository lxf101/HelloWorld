import java.util.*;

class SetReview {
  public static void main(String[] args) {

    Set<String> colors = new HashSet<String>();
    colors.add("red");
    colors.add("orange");
    System.out.println(colors);			// red, orange
    if (colors.contains("red")){
      System.out.println("Set contains red");		// Set contains red
    }

    Set<String> primary = new HashSet<String>();
    primary.add("red");
    primary.add("yellow");
    primary.add("green");
    primary.remove("green");
    for (String value: primary) {
      System.out.println(value);	// red, yellow
    }

    colors.addAll(primary);		
    System.out.println(colors); 	// red, orange, yellow
    System.out.println(colors.size());	// 3
  }
}