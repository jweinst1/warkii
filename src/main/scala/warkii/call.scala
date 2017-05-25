package warkii

import scala.util.Random

/** Methods for sampling callers or strings
  *
  */
object Sampler {
  //gets random element from array
  def arr[T](items:Array[T]):T = {
    items(Random.nextInt(items.length))
  }
  //samples callable sentence component and calls it
  def choice(items:Sgen*):String = items(Random.nextInt(items.length))()
}