/** 
 * @author Daniel McKinnon
 */
public class Exp extends Function{
  
  /**Represents the operand of this object*/
  private Function operand;
  
  /**The constructor
    * @param the operand for exp
    */
  public Exp(Function operand){
    this.operand = operand;
  }
  
  /**@return The operand in this object
   */
  public Function getOperand(){
    return this.operand;
  }
  
/**@return True if the objects are equal, false if not
   */
  public boolean equals(Function other){
    return this.operand == other.getOperand();
  }
  
  /**@return String representation on exp
   */
  @Override
  public String toString(){
    return "Exp(" + this.operand + ")";
  }
  
  /**@param The value to be used to evaluate the function
    * @return The value of the function evaluated as x
    */
  public double value(double x){
    return Math.exp(operand.value(x));
  }
  
  /**@return Cos evaluated with no variable
   */
  public double value(){
    return Math.exp(operand.value());
    //throw new UnsupportedOperationException();
  }
  
  /**@return The function of the derivative of exp^(operand)*/
  public Function derivative(){
    return new binaryOp('*', operand.derivative(), this);
  }
  
}