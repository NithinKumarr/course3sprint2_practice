public class FurnitureItem {
    String GradeOfFurniture;
    String ColorsOfFurniture;
    String furnitureUsage  ;
    int furnitureCode;
    String furnitureType;
    float Discount;
    float price;
    float discountedAmount;
    FurnitureItem() {
        furnitureCode=88255;
        ColorsOfFurniture="Red";
        furnitureType="Stool";
        GradeOfFurniture="Grade1";
        furnitureUsage="Outdoor";
        Discount=5;
        price=1000;
    }
    void Discounts() {

        if(furnitureType.equals("Stool") || furnitureType.equals("Chair")) {
            furnitureUsage = "Outdoor";
            float priceAfterDiscount = price - (price * 5) / 100;
            discountedAmount=priceAfterDiscount;

        }
        else
            furnitureUsage="Indoor";
    }
    void Display() {
        Discounts();
        System.out.println("Color of Furniture:- " + furnitureCode);
        System.out.println("Color of Furniture:- " + furnitureType);
        System.out.println("Color of Furniture:- " + ColorsOfFurniture);
        System.out.println("Usage of Furniture:- " + furnitureUsage);
        System.out.println("Grade of Furniture:- " + GradeOfFurniture);
        System.out.println("Price of Furniture:- " + price);
        System.out.println(" Discounted Price :- " +discountedAmount );
    }
}
