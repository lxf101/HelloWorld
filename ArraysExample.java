class ArraysExample {
  public static void main(String[] args) {
    String[] bandInstruments = {"bass", "guitar", "electric keyboard", "drums"};
    System.out.println(bandInstruments[2]);   // electric keyboard
    bandInstruments[2] = "melodica";
    System.out.println(bandInstruments[2]);	// melodica
    System.out.println(bandInstruments.length);	// 4

    String[] quartetInstruments = new String[4];
    quartetInstruments[0] = "violin";
    quartetInstruments[1] = "violin";
    quartetInstruments[2] = "viola";
    quartetInstruments[3] = "cello";

    for (int i = 0; i < quartetInstruments.length; i++) {
      System.out.println(quartetInstruments[i]);	// violin   violin   viola   cello
    }
   
  }
}