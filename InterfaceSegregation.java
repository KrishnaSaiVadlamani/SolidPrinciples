interface Veg{
void vegMeals();
}
interface NonVeg{
void NonvegMeals();
}

class VegRestaurant implements Veg{
 public void vegMeals(){
 System.out.println("veg meals");
 }
 }
 
class ArabianRestaurant implements Veg,NonVeg{
 public void vegMeals(){
 System.out.println("veg meals");
 }
 public void NonvegMeals(){
 System.out.println("Non-veg meals");
 }
}

class InterfaceSegregation{
public static void main(String args[]){
VegRestaurant vgR=new VegRestaurant();
ArabianRestaurant AR=new ArabianRestaurant();
vgR.vegMeals();
AR.vegMeals();
AR.NonvegMeals();
}
}
