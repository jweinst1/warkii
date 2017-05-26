package warkii



object One {
	def apply():String = s"${Sampler.choice(obj, pron_obj, act_past)}${rand_punc()}"

	def obj():String = Sampler.choice(obj_s, obj_p)
	def obj_s():String = Obj.sing()
	def obj_p():String = Obj.plur()
	def pron_obj():String = Sampler.arr(WordBank.pron_obj)
	def act_past():String = Act.past()

	def rand_punc():String = Sampler.arr(puncs)
	/** Generates a random puncuation for ones
	  *
	  */
	val puncs:Array[String] = Array("?", "!", ",", ",", ",")
}