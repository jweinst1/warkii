package warkii


/** Generates object words
  *
  */
object Obj {
	/** Combinator function for noun and object list singulars
	  *
	  */
	def sing():String = Sampler.choice(obj_sing, Noun.sing)
	def plur():String = Sampler.choice(obj_plur, Noun.plur)
	/** Gets one random singular object from list
	  *
	  */
	def obj_sing():String = Sampler.arr(WordBank.s_obj)
	/** Gets one random plural object from list
	  *
	  */
	def obj_plur():String = Sampler.arr(WordBank.p_obj)
}


object Des {
	def apply():String = Sampler.arr(WordBank.vis_adj)
}