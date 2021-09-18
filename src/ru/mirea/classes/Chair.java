package ru.mirea.classes;

public class Chair extends Table {
  /**
   * Конструктор по умолчанию
   */
  public Chair() {
    super();
  }

  /**
   * Конструктор не по умолчанию
   * @param name          название мебели
   * @param brand         фирма, производившая мебель
   * @param price         цена мебели
   * @param width         ширина стола
   * @param length        длина стола
   * @param height        высота стола
   */
  public Chair(String name,
               String brand,
               double price,
               double width,
               double length,
               double height
  ) {
    super(name, brand, price, width, length, height);
  }
  /**
   * Объединяет всю информацию об объекте в одну строку
   * @return        строка с информацией об объекте
   */
  @Override
  public String toString() {
    return ("Chair {\n"
      + "\tname: " + this.name + "\n"
      + "\tbrand: " + this.brand + "\n"
      + "\tprice: " + this.price + "\n"
      + "\twidth: " + this.width + "\n"
      + "\tlength: " + this.length + "\n"
      + "\theight: " + this.height + "\n"
      + "}"
    );
  }
}
