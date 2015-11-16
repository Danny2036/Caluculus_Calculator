/** 
 * @author Daniel McKinnon
 */
public class Variable extends Function{
  
  /**@return String representation on variable
   */
  @Override
  public String toString(){
    return "x";
  }
  
/**@return The operand in this object
   */
  public Function getOperand(){
    return null;
  }
  
/**@return True if the objects are equal, false if not
   */
  public boolean equals(){
    return true;
  }
  
  /**@param The value to be used to evaluate the function
    * @return The value of the function evaluated as x
    */
  public double value(double x){
    return x;
  }
  
  /**@return Cos evaluated with no variable
   */
  public double  value(){
    throw new UnsupportedOperationException();
  }
  
  /**@return The function of the derivative of sin(operand)
    */
  public Function derivative(){
    return new Number(1);
  }
}