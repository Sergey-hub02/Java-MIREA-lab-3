package ru.mirea.classes;

public abstract class Furniture {
  protected String name;            // название мебели
  protected String brand;           // фирма мебели
  protected double price;           // цена мебели

  /**
   * Конструктор по умолчанию
   */
  public Furniture() {
    this.name = "";
    this.brand = "";
    this.price = 0.0;
  }

  /**
   * Конструктор не по умолчанию
   * @param name        название мебели
   * @param brand       фирма, производившая мебель
   * @param price       цена мебели
   */
  public Furniture(String name, String brand, double price) {
    this.name = name;
    this.brand = brand;
    this.price = price;
  }

  /**
   * Геттер для поля name
   * @return      название мебели
   */
  public String getName() {
    return this.name;
  }

  /**
   * Геттер для поля brand
   * @return      фирма, производившая мебель
   */
  public String getBrand() {
    return this.brand;
  }

  /**
   * Геттер для поля price
   * @return        цена мебели
   */
  public double getPrice() {
    return this.price;
  }

  /**
   * Сеттер для поля name
   * @param name        новое название мебели
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Сеттер для поля brand
   * @param brand       новая фирма, производившая мебель
   */
  public void setBrand(String brand) {
    this.brand = brand;
  }

  /**
   * Сеттер для поля price
   * @param price       новая цена мебели
   */
  public void setPrice(double price) {
    this.price = price;
  }

  /**
   * Объединяет всю информацию об объекте в одну строку
   * @return        строка с информацией об объекте
   */
  @Override
  public abstract String toString();
}
