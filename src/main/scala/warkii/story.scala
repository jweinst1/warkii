package warkii

/** Contains a set of nested production rules to synthesize the story
  * @note Considered top rules, bottom rules stored in other object
  */
object Story {
	/** Top level caller for story synthesis
	  *
	  */
	def apply():String = Sampler.choice(
		pat_222
	)

	/** Method to produce 4 X 2 synthesis
	  *
	  */
	def pat_42():String = ""
	def pat_24():String = ""
	def pat_411():String = ""
	def pat_114():String = ""
	def pat_141():String = ""
	/** Method to produce a 2 x 2 X 2 synthesis
	  *
	  */
	def pat_222():String = s"${Two()}, ${Two()}, ${Two()}"

	/** Method to produce a 3 x 3 synthesis
	  *
	  */
	def pat_33():String = ""
	def pat_321():String = ""
	def pat_213():String = ""
	def pat_231():String = ""
	def pat_123():String = ""
	def pat_312():String = ""
	def pat_132():String = ""

	/** Method to produce 2 X 1 X 1 X 2 synthesis
	  *
	  */
	def pat_2112():String = ""
	def pat_1212():String = ""
	def pat_1122():String = ""
	def pat_1221():String = ""
	def pat_2211():String = ""

}