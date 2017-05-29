package warkii

/** Generates a noun from a variety of different possible topics
  * @note a noun here is different than an object because it can contain names of places too.
  */
object NounBank {
	/** Singular animals
	  *
	  */
	val animals_s:Array[String] = Array(
		"vulture",
		"howler",
		"wallaby",
		"dalmatian",
		"koala",
		"elephant",
		"frog",
		"turtle",
		"rabbit",
		"chicken",
		"bunny"
	)

	val animals_p:Array[String] = Array(
		"vultures",
		"howlers",
		"wallabies",
		"dalmatians",
		"koalas",
		"elephants",
		"frogs",
		"turtles",
		"rabbits",
		"chickens",
		"bunnies"
	)

	val fruits_s:Array[String] = Array(
		"mango",
		"apple",
		"pear",
		"banana",
		"orange",
		"coconut",
		"fruit",
		"berry"
	)

	val fruits_p:Array[String] = Array(
		"mangoes",
		"apples",
		"pears",
		"bananas",
		"oranges",
		"coconuts",
		"fruit",
		"berries"
	)
}

/** Contains methods to access noun bank
  *
  */
object Noun {
	/** Selects from several buckets of single nouns
	  *
	  */
	def sing():String = Sampler.choice(animals_s, fruits_s)
	def plur():String = Sampler.choice(animals_p, fruits_p)

	def animals_s():String = Sampler.arr(NounBank.animals_s)
	def animals_p():String = Sampler.arr(NounBank.animals_p)

	def fruits_s():String = Sampler.arr(NounBank.fruits_s)
	def fruits_p():String = Sampler.arr(NounBank.fruits_p)
}