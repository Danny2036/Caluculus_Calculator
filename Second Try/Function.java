/** 
 * @author Daniel McKinnon
 */
public abstract class Function{
  
  /**@param The value to be used to evaluate the function
    * @return The value of the function evaluated as x
    */
  public abstract double value(double x);
  
  /**@return Cos evaluated with no variable
   */
  public abstract double value();
  
  /**@return The function of the derivative of sin(operand)
    */
  public abstract Function derivative();
  
/**@return The operand in this object
   */
  public abstract Function getOperand();
}