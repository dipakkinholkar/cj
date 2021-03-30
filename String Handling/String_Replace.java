    class String_Replace {
   public static void main(String[] var0) {
      String var1 = "dipak kadam";
      System.out.println(var1.replace(' ', '-'));
      System.out.println(var1.replace('i', 'e'));
      String var2 = "dipak";
      String var3 = "kadam";
      System.out.println(var1.replaceAll("dipak", "deepak"));
      System.out.println(var1.replaceAll("(.*)kadam(.*)", "patil maratha"));
      System.out.println(var1.replaceAll("(.*)deepak(.*)", "dipak"));
      String var4 = "kadam patil maratha ";
      String var5 = "dipak";
      System.out.println(var4.replaceFirst("kadam", "dipak"));
      System.out.println(var4.replaceFirst("patil", "dipak"));
   }
}
 