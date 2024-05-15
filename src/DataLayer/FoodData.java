package DataLayer;
public class FoodData{
  
   //dadagdagan pa po namin, finifigure out pa po namin
    public FoodData() {
        Dish1();
        Dish2();
        Dish3();
        Dish4();
     }
    
    public FoodModel Dish1(){
        FoodModel food1 = new FoodModel("Kung Pao Chicken", 150.00);
        return food1;
    }
    
    public FoodModel Dish2(){
        FoodModel food2= new FoodModel("Black Pepper Steak", 140.00);
        return food2;
    }
    
    public FoodModel Dish3(){
        FoodModel food3 = new FoodModel("Mushroom Chicken", 150.00);
        return food3;
    }
    
    public FoodModel Dish4(){
        FoodModel food4= new FoodModel("Orange Chicken", 140.00);
        return food4;
    }
    
    
   
}
