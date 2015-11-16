/** 
 * @author Daniel McKinnon
 */
public class Number extends Function{
  
  /**Represents the double value of this object*/
  double num;
  
  /**The constructor*/
  public Number(double num){
    this.num = num;
  }
  
  /**@return String representation on Number
   */
  @Override
  public String toString(){
    return this.num+"";
  }
  
/**@return The operand in this object
   */
  public Function getOperand(){
    return null;
  }
  
/**@return True if the objects are equal, false if not
   */
  public boolean equals(Object o){
    if ((o instanceof Number)&&((((Number)o).value() == this.num))){
      return true;
    } else {
      return false;
    }
  }
  
  /**@param The value to be used to evaluate the function
    * @return The value of the function evaluated as x
    */
  public double value(double x){
    return this.num;
  }
  
  /**@return Cos evaluated with no variable
   */
  public double value(){
    return this.num;
  }
  
  /**@return The function of the derivative the number*/
  public Function derivative(){
    return new Number(0);
  }
}