/** 
 * @author Daniel McKinnon
 */
public class Polynomial extends Function{
 
  /**Represents the exponent the function will be raised too*/
  double power;
  
  /**Represents the operand of this object*/
  Function operand;
  
  /**The constructor
    *@param The operand of the polynomial
    *@param The power of the exponent
    */
  public Polynomial(Function operand, double power){
    this.power = power;
    this.operand = operand;
  }
  
  /**returns the exponent of the function
   */
  public double getPower(){
    return this.power;
  }
  
/**@return The operand in this object
   */
  public Function getOperand(){
    return this.operand;
  }
  
/**@return True if the objects are equal, false if not
   */
  public boolean equals(Function check){
    if (this.operand == check.getOperand()){
      return true;
    } else {
      return false;
    }
  }
  
  /**@return Cos evaluated with no variable
   */
  public double value(){
    return Math.pow(this.operand.value(), power);
    //throw new UnsupportedOperationException();
  }
  
  /**@param The value to be used to evaluate the function
    * @return The value of the function evaluated as x
    */
  public double value(double x){
    return Math.pow(this.operand.value(x), power);
  }
  
  /**@return The function of the derivative of (operand)^power*/
  public Function derivative(){
    return new binaryOp('*', new binaryOp('*', new Number(power), new Polynomial(this.operand,(power-1))), this.operand.derivative());
   // return new binaryOp('*', new binaryOp('*', new binaryOp('*', new Number(power), new Polynomial(this.operand, this.power - 1)), this.operand.derivative()));
  }
  
  /**@return String representation on polynomial
   */
  public String toString(){
    return "(" + operand + "^" + power + ")";
  }
}
