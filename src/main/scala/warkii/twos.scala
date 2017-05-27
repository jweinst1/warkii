package warkii

/** Handles 2 word story components
  *
  */
object Two {
	/** Top level caller for two word story-components
	  *
	  */
	def apply():String = Sampler.choice(det_obj, des_obj, obj_act, act_act, adv_act, adj_obj, adv_des)
	/** Generates a story component of a determiner and an object
	  * @note obj refers to an object
	  */
	def det_obj():String = Sampler.choice(det_obj_s, det_obj_p, det_obj_ex)
	/** Synthesizes a det-obj pair but adds exclamation mark.
	  *
	  */
	def det_obj_ex():String = s"${Sampler.choice(det_obj_s, det_obj_p)}!"
	def det_obj_s():String = s"${Det.sing()} ${Obj.sing()}"
	def det_obj_p():String = s"${Det.plur()} ${Obj.plur()}"

	def des_obj():String = Sampler.choice(des_obj_s, des_obj_p)
	def des_obj_s():String = s"${Des()} ${Obj.sing()}"
	def des_obj_p():String = s"${Des()} ${Obj.plur()}"

	def obj_act():String = Sampler.choice(obj_act_s, obj_act_p, obj_act_p_past)
	def obj_act_s():String = s"${Obj.sing()} ${Act.sing()}"
	def obj_act_p():String = s"${Obj.plur()} ${Act.plur()}"
	/** Uses past tense action
	  *
	  */
	def obj_act_p_past():String = s"${Obj.plur()} ${Act.past()}"

	def act_act():String = Sampler.choice(obj_act_s, obj_act_p)
	def act_act_p():String = s"${Act.plur()} ${Act.plur()}"
	def act_act_s():String = s"${Act.sing()} ${Act.sing()}"

	/** Synthesizes an adverb and action
	  *
	  */
	def adv_act():String = Sampler.choice(adv_act_p, adv_act_past, act_adv_past)
	def adv_act_p():String = s"${Adv()} ${Act.plur()}"
	def adv_act_past():String = s"${Adv()} ${Act.past()}"

	def act_adv_past():String = s"${Act.past()} ${Adv()}"

	def adj_obj():String = Sampler.choice(adj_obj_s, adj_obj_p)
	def adj_obj_s():String = s"${Adj()} ${Obj.sing()}"
	def adj_obj_p():String = s"${Adj()} ${Obj.plur()}"

	def adv_des():String = s"${Adv()} ${Adj()}"
	/** Generates a story component of a negator and action
	  * @note a negator nullifies some next word
	  */
	def neg_act():String = ""
	def neg_obj():String = ""
	def neg_adv():String = ""
	/** Generates a story component of a pronoun and action
	  * @note pron refers to pronoun like I or You
	  */
	def pron_act():String = ""
	def pron_obj():String = ""
}