package task5.facade;

public class Solution {

    public static String potionName = "Minor Healing Potion";
    public static String type = "stamina";

    public static void main(String[] args) {

        PotionConversionFacade facade = new PotionConversionFacade();

        String result = facade.convertPotion(potionName, type);

        System.out.println(result);
    }
}
