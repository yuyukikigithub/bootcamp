package com.javahongkong.bootcamp.exercise;

import java.util.HashMap;
import java.util.Map.Entry;

public class FurnitureOrder implements FurnitureOrderInterface {
    /**
     * TODO: Create a map of Furniture items to order quantities
     */
    HashMap<Furniture, Integer> ordersOfFurnitures;

    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
    FurnitureOrder() {
        // TODO: Complete the constructor
        this.ordersOfFurnitures = new HashMap<>();
    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
        // TODO: Complete the method
        this.ordersOfFurnitures.put(type, furnitureCount);

    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        // TODO: Complete the method
        return this.ordersOfFurnitures;
    }

    public float getTotalOrderCost() {
        // TODO: Complete the method
    
        float fl = 0f;
        if (this.ordersOfFurnitures.size()>0) {
            for (Entry<Furniture, Integer> order : this.ordersOfFurnitures.entrySet()) {
                fl +=(float) order.getKey().cost()*order.getValue();
            }
        }
        return fl;
    }

    public int getTypeCount(Furniture type) {
        int result=0;
        // TODO: Complete the method
        if (this.ordersOfFurnitures.containsKey(type)) {
            for (Entry<Furniture, Integer> order : this.ordersOfFurnitures.entrySet()){
                if (order.getKey().label().equals(type.label())) {
                    result +=order.getValue();
                }
            }
            
        }
        return result;
    }

    public float getTypeCost(Furniture type) {
        // TODO: Complete the method
        float result=0f;
        if (this.ordersOfFurnitures.containsKey(type)) {
            result=type.cost()*this.getTypeCount(type);
        }
        return result;
    }

    public int getTotalOrderQuantity() {
        // TODO: Complete the method
        int result=0;
        if (this.ordersOfFurnitures.size()>0) {
            for (Entry<Furniture, Integer> order : this.ordersOfFurnitures.entrySet()) {
                result += order.getValue();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        FurnitureOrder furnitureFactory = new FurnitureOrder();
        furnitureFactory.addToOrder(Furniture.CHAIR, 4);
        System.out.println(furnitureFactory.getTypeCost(Furniture.CHAIR));

    }

    
}