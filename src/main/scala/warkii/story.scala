package warkii

/** Contains a set of nested production rules to synthesize the story
  * @note Considered top rules, bottom rules stored in other object
  */
object Story {
	/** Top level caller for story synthesis
	  *
	  */
	def apply():String = Sampler.choice(
		pat_222,
		pat_231,
		pat_33,
		pat_132,
		pat_213,
		pat_2112,
		pat_321,
		pat_312,
		pat_1221,
		pat_1212
	)


	/** Method to produce a 2 x 2 X 2 synthesis
	  *
	  */
	def pat_222():String = s"${Two()}, ${Two()}, ${Two()}"

	/** Method to produce a 3 x 3 synthesis
	  *
	  */
	def pat_33():String = s"${Three()}, ${Three()}"
	def pat_321():String = s"${Three()}, ${Two()}, ${One()}"
	def pat_213():String = s"${Two()}, ${One()} ${Three()}"
	def pat_231():String = s"${Two()}, ${Three()}, ${One()}"
	def pat_123():String = s"${One()} ${Two()}, ${Three()}"
	def pat_312():String = s"${Three()}, ${One()} ${Two()}"
	def pat_132():String = s"${One()} ${Three()}, ${Two()}"

	/** Method to produce 2 X 1 X 1 X 2 synthesis
	  *
	  */
	def pat_2112():String = s"${Two()}, ${One()} ${One()} ${Two()}"
	def pat_1212():String = s"${One()} ${Two()}, ${One()} ${Two()}"
	def pat_1122():String = ""
	def pat_1221():String = s"${One()} ${Two()}, ${Two()}, ${One()}"
	def pat_2211():String = ""

}