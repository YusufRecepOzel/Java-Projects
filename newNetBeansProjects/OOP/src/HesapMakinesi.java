
public class HesapMakinesi {
  public int sayı1;
  public int sayı2;
  public String color;
  final double PI;
  public HesapMakinesi(int sayı1 , int sayı2 , String color ){
      this.sayı1 = sayı1;
      this.sayı2 = sayı2;
      this.color = color;
  }
  public int sum(){
      return this.sayı1 + this.sayı2;
  }
  public int sub(){
      return this.sayı1 - this.sayı2;
  }
  public int divide(){
      return this.sayı1 / this.sayı2;
  }
  public int multip(){
      return this.sayı1 * this.sayı2;
  }
}
