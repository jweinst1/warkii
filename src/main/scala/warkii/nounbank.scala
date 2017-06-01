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
		"bunny",
		"lizard",
		"rhino",
		"eagle",
		"pelican",
		"puppy",
		"giraffe",
		"dolphin"
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
		"bunnies",
		"lizards",
		"rhinoes",
		"eagles",
		"pelicans",
		"puppies",
		"giraffes",
		"dolphins"
	)

	val fruits_s:Array[String] = Array(
		"mango",
		"apple",
		"pear",
		"banana",
		"orange",
		"coconut",
		"fruit",
		"berry",
		"plum",
		"peach"
	)

	val fruits_p:Array[String] = Array(
		"mangoes",
		"apples",
		"pears",
		"bananas",
		"oranges",
		"coconuts",
		"fruit",
		"berries",
		"plums",
		"peaches"
	)

	val places_s:Array[String] = Array(
		"house",
		"cottage",
		"hut",
		"tent",
		"river",
		"cave",
		"villa",
		"street",
		"alley",
		"park",
		"mountain",
		"pier",
		"harbor",
		"dock",
		"city"
	)

	val places_p:Array[String] = Array(
		"houses",
		"cottages",
		"huts",
		"tents",
		"rivers",
		"caves",
		"villas",
		"streets",
		"alleys",
		"parks",
		"mountains",
		"piers",
		"harbors",
		"docks",
		"cities"
	)
	/** unmeasurable mass nouns
	  *
	  */
	val mass_s:Array[String] = Array(
		"blood",
		"water",
		"steel",
		"iron",
		"steam",
		"fire",
		"dirt",
		"earth",
		"mud",
		"grass",
		"darkness",
		"sand",
		"air",
		"wind",
		"thunder",
		"lightning",
		"lava",
		"rock",
		"stone",
		"marble",
		"gravel",
		"ice",
		"dirt",
		"dust",
		"grain",
		"salt"
	)
}

/** Contains methods to access noun bank
  *
  */
object Noun {
	/** Selects from several buckets of single nouns
	  *
	  */
	def sing():String = Sampler.choice(animals_s, fruits_s, places_s, mass_s)
	def plur():String = Sampler.choice(animals_p, fruits_p, places_p)

	def animals_s():String = Sampler.arr(NounBank.animals_s)
	def animals_p():String = Sampler.arr(NounBank.animals_p)

	def fruits_s():String = Sampler.arr(NounBank.fruits_s)
	def fruits_p():String = Sampler.arr(NounBank.fruits_p)

	def places_s():String = Sampler.arr(NounBank.places_s)
	def places_p():String = Sampler.arr(NounBank.places_p)

	def mass_s():String = Sampler.arr(NounBank.mass_s)

}