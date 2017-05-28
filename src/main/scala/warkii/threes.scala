package warkii

/** Synthesizes story components of three words each
  *
  */
object Three {
	/** Top level caller
	  *
	  */
	def apply():String = Sampler.choice(obj_3, obj_act_adv, det_obj_act, adv_conj_adv, obj_p_adv_act_past)

	def obj_act_adv():String = Sampler.choice(obj_act_adv_s, obj_act_adv_p, obj_act_adv_past)
	def obj_act_adv_s():String = s"${Obj.sing()} ${Act.sing()} ${Adv()}"
	def obj_act_adv_p():String = s"${Obj.plur()} ${Act.plur()} ${Adv()}"
	def obj_act_adv_past():String = s"${Obj.plur()} ${Act.past()} ${Adv()}"

	def obj_3():String = Sampler.choice(obj_3_p, obj_3_s)
	def obj_3_p():String = s"${Obj.plur()}, ${Obj.plur()}, ${Obj.plur()}"
	def obj_3_s():String = s"${Obj.sing()}, ${Obj.sing()}, ${Obj.sing()}"

	def det_obj_act():String = Sampler.choice(det_obj_act_s, det_obj_act_p, det_obj_act_s_past, det_obj_act_p_past)
	def det_obj_act_s():String = s"${Det.sing()} ${Obj.sing()} ${Act.sing()}"
	def det_obj_act_s_past():String = s"${Det.sing()} ${Obj.sing()} ${Act.past()}"
	def det_obj_act_p():String = s"${Det.plur()} ${Obj.plur()} ${Act.plur()}"
	def det_obj_act_p_past():String = s"${Det.plur()} ${Obj.plur()} ${Act.past()}"

	/** Produces 3-length component of adv conj adv
	  *
	  */
	def adv_conj_adv():String = s"${Adv()} ${Sampler.arr(WordBank.d_conj)} ${Adv()}"
	/** Specific pattern to combine plural objects with past actions
	  *
	  */
	def obj_p_adv_act_past():String = s"${Obj.plur()} ${Adv()} ${Act.past()}"
}