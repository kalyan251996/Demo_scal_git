import scala.io.StdIn
object Program2 {
  def main(args: Array[String]): Unit = {
    var a= StdIn.readInt()
    var b =0
    var temp=a
    while(temp>0)
    {
      var result=temp%10
      b =(b*10)+result
      temp=temp/10

    }
    if (a==b)
    println("the number is palindrome " )
    else
      print("its not a palindrome ")
  }

}
