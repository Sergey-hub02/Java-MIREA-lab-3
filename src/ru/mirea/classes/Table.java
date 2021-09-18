package ru.mirea.classes;

public class Table extends Furniture {
  protected double width;           // ширина стола
  protected double length;          // длина стола
  protected double height;          // высота стола

  /**
   * Конструктор по умолчанию
   */
  public Table() {
    super();
    this.width = 0.0;
    this.length = 0.0;
    this.height = 0.0;
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
  public Table(String name,
               String brand,
               double price,
               double width,
               double length,
               double height
  ) {
    super(name, brand, price);
    this.width = width;
    this.length = length;
    this.height = height;
  }

  /**
   * Геттер для поля width
   * @return        ширина стола
   */
  public double getWidth() {
    return this.width;
  }

  /**
   * Геттер для поля length
   * @return          длина стола
   */
  public double getLength() {
    return this.length;
  }

  /**
   * Геттер для поля height
   * @return          высота стола
   */
  public double getHeight() {
    return this.height;
  }

  /**
   * Сеттер для поля width
   * @param width       новая ширина стола
   */
  public void setWidth(double width) {
    this.width = width;
  }

  /**
   * Сеттер для поля length
   * @param length       новая длина стола
   */
  public void setLength(double length) {
    this.length = length;
  }

  /**
   * Сеттер для поля height
   * @param height      новая высота стола
   */
  public void setHeight(double height) {
    this.height = height;
  }

  /**
   * Объединяет всю информацию об объекте в одну строку
   * @return      строка с информацией об объекте
   */
  @Override
  public String toString() {
    return ("Table {\n"
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
