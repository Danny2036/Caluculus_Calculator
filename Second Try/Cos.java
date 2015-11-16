/** 
 * @author Daniel McKinnon
 */
public class Cos extends Function{
  
  /**Represents the operand in the cos*/
  private Function operand;
  
  /**The constructor
    * @param The operand being passed into cos
    */
  public Cos(Function operand){
    this.operand = operand;
  }
  
  /**@return The operand in this object
      */
  public Function getOperand(){
    return this.operand;
  }
  
  /**@param Any function to be compared
     @return True if the the param matches the object calling the method
     */
  public boolean equals(Function other){
    return this.operand.value(Math.PI) == other.value(Math.PI);
  }
  
  /**@override
    * @return String representation of cos(operand)
    */
  @Override
  public String toString(){
    return "cos(" + this.operand + ")";
  }
  
  /**
   * @param A double value of x 
   * @return Cos evaluated with the operand in terms of x
   */
  public double value(double x){
    return Math.cos(operand.value(x));
  }
  
  /**@return Cos evaluated with no variable
   */
  public double value(){
    return Math.cos(operand.value());
    //throw new UnsupportedOperationException();
  }
  
  /**@return The function of the derivative of cos(operand)
   */
  public Function derivative(){
    return new binaryOp('*', new Number(-1), new Sin(this.operand));
  }
  
}