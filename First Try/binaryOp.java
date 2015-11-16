public class binaryOp{
  
  Number nleft;
  Number nright;
  Variable vleft;
  Variable vright;
  char operator;
  binaryOp bleft;
  binaryOp bright;
  
  public binaryOp(Number left, Number right, char operator){
    this.nleft = left;
    this.nright = right;
    this.operator = operator;
  }
  public binaryOp(Variable left, Variable right, char operator){
    this.vleft = left;
    this.vright = right;
    this.operator = operator;
  }
  
    public binaryOp(binaryOp left, binaryOp right, char operator){
    this.bleft = left;
    this.bright = right;
    this.operator = operator;
  }
    public char getOperator(){
      return this.operator;
    }
    
    public Object getLeftOperand(){
      if(this.
}
