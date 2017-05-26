package warkii



object One {
	def apply():String = s"${Sampler.choice(obj, pron_obj, act_past)}"

	def obj():String = Sampler.choice(obj_s, obj_p)
	def obj_s():String = Obj.sing()
	def obj_p():String = Obj.plur()
	def pron_obj():String = Sampler.arr(WordBank.pron_obj)
	def act_past():String = Act.past()
}