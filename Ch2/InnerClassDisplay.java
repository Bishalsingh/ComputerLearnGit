public class InnerClassDisplay{
  public static void main(String[] args) {

    OuterClass myOuter = new OuterClass();   //normal object

    OuterClass.InnerClass myInner = myOuter.new InnerClass();    //Parentclass.innerclass = parentObject.new InnerclassName();

    System.out.println(myInner.y + myOuter.x);
  }
}
