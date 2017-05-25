package warkii

/** Generates actions for story components
  *
  */
object Act {
	def sing():String = Sampler.arr(WordBank.s_act)
	def plur():String = Sampler.arr(WordBank.p_act)
	def past():String = Sampler.arr(WordBank.past_act)
}