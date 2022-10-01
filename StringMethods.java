public class StringMethods {
  public static void main(String[] args) {
    String str = "Hello World!";
    System.out.println(str.length()); 	// 12

    String name = "Code";
    name = name.concat("cademy");
    System.out.println(name); 	// Codecademy

    String flavor1 = "Mango";
    String flavor2 = "Matcha";
    System.out.println(flavor1.equals(flavor2)); 	// false

    String letters = "ABCDEFGHIJKLMN";
    System.out.println(letters.indexOf("C")); 	// 2
    System.out.println(letters.indexOf("EFG")); 	// 4

    String currency = "Yen";
    System.out.println(currency.charAt(2)); 	// n

    String line = "It was the best of times, it was the worst of times.";
    System.out.println(line.substring(26)); 	// it was the worst of times.
    System.out.println(line.substring(7, 24)); 	// the best of times

    String input = "Cricket!";
    System.out.println(input.toUpperCase());	// CRICKET!
    System.out.println(input.toLowerCase()); 	// cricket!

  }
}