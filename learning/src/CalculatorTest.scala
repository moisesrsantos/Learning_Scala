import util.Calculator

object CalculatorTest {
  def main(args: Array[String]) = {
    val calc = new Calculator()
    val result_1 = calc.+(15.5, 10)
    val result_2 = calc.-(15.5, 10)
    val result_3 = calc.*(15.5, 10)
    val result_4 = calc.div(0, 0)

    println(s"The result is $result_1!")
    println(s"The result is $result_2!")
    println(s"The result is $result_3!")
    println(s"The result is $result_4!")
  }
}
