package Adventure;

public class Room{

   Room west;
   Room east;
   Room north;
   Room south;
   String navn;
   int counter=0;

   void setWest(Room room){
     this.west=room;
   }
   void setEast(Room room){
     this.east=room;
   }
   void setNorth(Room room){
     this.north=room;
   }
   void setSouth(Room room){
     this.south=room;
   }

   Room(String navn){
    this.navn=navn;
  }
  void addToCounter(){
    counter+=1;
  }
 }