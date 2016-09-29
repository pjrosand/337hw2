package beersong;

public class Beersong {

    public static void main(String[] args) {
        Beersong s = new Beersong();
       s.Ninety_Nine_Bottles_of_Beer();
       
    }
    
    public void Ninety_Nine_Bottles_of_Beer(){
 for(int i=99; i>0; i--){
   
      System.out.println(i + " bottles of beer on the wall " + i + " bottles of beer. Take one down pass it around " + (i-1) + " bottles of beer on the wall");
  
 }
 
 
}
}

