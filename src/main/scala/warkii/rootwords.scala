package warkii


/** Generates object words
  *
  */
object Obj {
	/** Gets one random singular object
	  *
	  */
	def sing():String = Sampler.arr(WordBank.s_obj)
	/** Gets one random plural object
	  *
	  */
	def plur():String = Sampler.arr(WordBank.p_obj)
}


object Des {
	def apply():String = Sampler.arr(WordBank.vis_adj)
}