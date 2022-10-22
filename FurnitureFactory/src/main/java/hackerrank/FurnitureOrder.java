package hackerrank;

import java.util.HashMap;

public class FurnitureOrder implements FurnitureOrderInterface {
    /**
     * TODO: Create a map of Furniture items to order quantities
     */
    private HashMap<Furniture, Integer> furnitures;
    

    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
    FurnitureOrder() {
        // TODO: Complete the constructor
        furnitures=new HashMap<Furniture,Integer>();
    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
        // TODO: Complete the method
        int count =0;
        if (furnitures.containsKey(type)){
            count=furnitures.get(type);
        }
        furnitures.put(type,count+furnitureCount);
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        return new HashMap<Furniture,Integer>(furnitures);
    }

    public float getTotalOrderCost() {
        // TODO: Complete the method
        return -1.0f;
    }

    public int getTypeCount(Furniture type) {
        // TODO: Complete the method
        if (furnitures.containsKey(type))
        {
            return furnitures.get(type);
        }
        return -1;
    }

    public float getTypeCost(Furniture type) {
        // TODO: Complete the method
          if (furnitures.containsKey(type))
          {
              return furnitures.get(type)*type.cost();
          }

        return -1.0f;
    }

    public int getTotalOrderQuantity() {
        // TODO: Complete the method
        return -1;
    }
}
