public class Questions {
  public static void main(String args[]){
    printPattern(4);
  }
  public static void printPattern(int n){  // remember this is only valid since this is static method and this an instance of the class blueprint
    for(int i=0; i<n; i++) print(i,n);
    for(int i=n-1; i>=0; i--) print(i,n);
  }
  public static void print(int i, int n) {
    String line = "";
    int spaces = (n-i-1)*2;
    int stars = (i+1)*2;
    for(int j=0;j<stars/2;j++) line+="*";
    for(int j=0;j<spaces;j++) line+=" ";
    for(int j=0;j<stars/2;j++) line+="*";
    System.out.println(line);
  }
}
