package warkii

/** Synthesizes story components of three words each
  *
  */
object Three {
	/** Top level caller
	  *
	  */
	def apply():String = Sampler.choice(obj_3)

	def obj_act_adv():String = ""
	def obj_act_adv_s():String = ""
	def obj_act_adv_p():String = ""
	def obj_act_adv_past():String = ""

	def obj_3():String = Sampler.choice(obj_3_p, obj_3_s)
	def obj_3_p():String = s"${Obj.plur()}, ${Obj.plur()}, ${Obj.plur()}"
	def obj_3_s():String = s"${Obj.sing()}, ${Obj.sing()}, ${Obj.sing()}"

}