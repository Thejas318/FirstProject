package Practice.OOPS.Inheritance;

public class Box {
   double l;
   double w;
   double h;


   Box(){
       l = -1;
       w = -2;
       h = -3;
   }

   //Cube
   Box(double val){
       this.l = val;
       this.w = val;
       this.h = val;
   }

   Box(double l, double w, double h){
       this.l = l;
       this.w = w;
       this.h = h;
   }


}
