public class Number extends Variable{
  double num;
  
  public Number(double num){
    this.num = num;
  }
  
  public String toString(){
    return super.toString();
  }
  
  public boolean equals(double y){
    return this.num == y;
  }
}