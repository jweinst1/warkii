package warkii

/** Program entry point
  *
  */
object Main extends App {
  for(_ <- 1 to 10) println(Story());
  Thread.sleep(2000)
  println("done")
}