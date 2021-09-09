package util

import scala.util.Try

class Calculator {

  def sum(x:Double, y:Double): Double = x+y

  def sub(x:Double, y:Double): Double = x-y

  def multi(x:Double, y:Double): Double = x*y

  def div(x:Int, y:Int): Int = Try(x/y).getOrElse(0)

  def + = sum _

  def - = sub _

  def * = multi _

  def / = div _





}
