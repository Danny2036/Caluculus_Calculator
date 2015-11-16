/** 
 * @author Daniel McKinnon
 */

public class binaryOp extends Function{
  
  /**Represents left operator*/
  private Function left = null;
  /**represents right operator*/
  private Function right = null;
  /**Represents the the operator*/
  private char operator = 0;
  
  /**The constructor
    * @param The charecter of the operation sign
    * @param The function on the left side of the operation sign
    * @param The function on the right side of the operation sign
    * */
  public binaryOp(char operator, Function left, Function right){
    this.left = left;
    this.right = right;
    this.operator = operator;
  }
  
  /**Gets the operator
    * @return Returns the sign of operation
    */
  public char getOperator(){
    return this.operator;
  }
  
  /**@returns Gets the null because there is no main operand in binaryOp
    */
  public Function getOperand(){
    return null;
  }
  
  /**@return Gets the left operand
    */
  public Function getLeftOperand(){
    return this.left;
  }
  
  /**@return Gets the operand on the right side of operation sign
   */
  public Function getRightOperand(){
    return this.right;
  }
  
  /**@param Takes any binaryOp to use to compare to
    * @return Returns true if the two objects are equal, false if not
    */
  public boolean equals(binaryOp b){
    if ((b.operator == this.operator)&&(b.left == this.left) && (b.right == this.right)){
      return true;
    } else {
      return false;
    }
  }
  
  /**@return The function that is the derivative
    */
  public Function derivative(){
    if((this.getOperator() == '+')){
      return new binaryOp('+', this.left.derivative(), this.right.derivative());
    } else if (this.getOperator() == '-'){
      return new binaryOp('-', this.left.derivative(), this.right.derivative());
    }
    else if (this.getOperator() == '*'){
      return new binaryOp('+', new binaryOp('*', this.left, this.right.derivative()), new binaryOp('*', this.left.derivative(), this.right));
    } else if (this.getOperator() == '/'){
      return new binaryOp('/' ,new binaryOp('-', new binaryOp('*', this.right, this.left.derivative()), new binaryOp('*', this.right.derivative(), this.left)), new binaryOp('*', this.right, new Number(2.0))); 
    } else if (this.getOperator() == '^'){
      return new binaryOp('*', right, new binaryOp('^', left, new binaryOp('-', right, new Number(1))));
    } else  {
      throw new UnsupportedOperationException();
    }
  }
  
  /**@return String representation on binaryOp
   */
  @Override
  public String toString(){
    if (this.left instanceof binaryOp){
      return ("(" +left+ ") " + this.operator + " " + this.right);
    } else if (this.right instanceof binaryOp){
      return ( this.left + " " + this.operator + " (" + this.right + ")");
    } else if((this.left instanceof binaryOp)&&(this.right instanceof binaryOp)){
      return ("("+this.left + ") " + this.operator + " (" + this.right+")");
    } else {
      return (this.left + " " + this.operator + " " + this.right);
    }
  }
  
  /**@return The vaue for binaryOp with input x
    */
  public double value(double x){
    if (this.getOperator() == '+'){
      return left.value(x)+ right.value(x);
    } else if (this.getOperator() == '-'){
      return left.value(x)-right.value(x);
    } else if ((this.getOperator() == '*')){
      return left.value(x)*right.value(x);
    } else if (this.getOperator() == '/'){
      return left.value(x)/right.value(x);
    } else if ((this.getOperator() == '^')){
      return Math.pow(left.value(x),right.value(x));
    } else {
      throw new UnsupportedOperationException();
    }
  }
  
  /**@return The value for binaryOp with no variable input
    */
  public double value(){
    if (this.getOperator() == '+'){
      return left.value()+ right.value();
    } else if (this.getOperator() == '-'){
      return left.value()-right.value();
    } else if ((this.getOperator() == '*')){
      return left.value()*right.value();
    } else if (this.getOperator() == '/'){
      return left.value()/right.value();
    } else if ((this.getOperator() == '^')){
      return Math.pow(left.value(),right.value());
    } else {
      throw new UnsupportedOperationException();
    }
  }
}