public class ReadStrings{
   static String[] readStrings(){
    /*das Aarry der Größe 5   
    String[] s=new String[5];
          for(int i=0;i<5;i++){
            s[i]=StdIn.readString();
            } 
            return s;*/
    /*das Aarry der Größe 10   
    String[] s1=new String[10];
    for(int i=0;i<10;i++){
      s1[i]=StdIn.readString();
      } 
      return s1;*/

    //das Aarry der Größe 5 
    int a=Stdin.readInt();  
    String[] s=new String[a];
        for(int i=0;i<a;i++){
            s[i]=StdIn.readString();
        } 
      return s;

    
    }    
public static void main(String[] args) {
   String[] b=ReadStrings.readStrings();
}
}
