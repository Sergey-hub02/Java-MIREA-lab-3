package ru.mirea;

import ru.mirea.classes.*;

public class FurnitureShop {
  public static void main(String[] args) {
    Furniture[] goods = new Furniture[5];

    goods[0] = new Table("Table #1", "Famous Furniture", 12.02, 5.0, 2.0, 3.0);
    goods[1] = new Table("Table #2", "Infamous Furniture", 5.123, 5.0, 2.0, 3.0);
    goods[2] = new Table("Table #3", "Notorious Furniture", 2.3, 4.0, 2.5, 1.0);
    goods[3] = new Chair("Chair #1", "Good Furniture", 2.3, 4.0, 2.5, 1.0);
    goods[4] = new Chair("Chair #2", "Bad Furniture", 0.2235, 4.0, 2.5, 1.0);

    System.out.println("Список доступной мебели:");

    for (Furniture good : goods) {
      System.out.println(good);
      System.out.println();
    }
  }
}
