package warkii



object One {
	def apply():String = s"${Sampler.choice(obj)},"

	def obj():String = Sampler.choice(obj_s, obj_p)
	def obj_s():String = Obj.sing()
	def obj_p():String = Obj.plur()
}