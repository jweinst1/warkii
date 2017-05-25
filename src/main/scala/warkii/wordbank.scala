package warkii

/** Carries bins of words for story construction
  *
  */
object WordBank {

	val pron_pos:Array[String] = Array(
		"my",
		"your",
		"his",
		"her",
		"their"
	)
	//singular detrminers
	val s_det:Array[String] = Array(
		"the", 
		"this", 
		"that", 
		"any", 
		"every"
		)
	//plural detrminers
	val p_det:Array[String] = Array(
		"those", 
		"these", 
		"few", 
		"many", 
		"most", 
		"some"
		)

	//conjunctions which connect objects on both sides
	val d_conj:Array[String] = Array(
		"nor", 
		"or", 
		"and", 
		"either", 
		"neither"
		)

	//visual adjectives
	val vis_adj:Array[String] = Array(
		"red", 
		"blue", 
		"yellow", 
		"green", 
		"large", 
		"small", 
		"pretty",
		"ugly",
		"sharp",
		"soft",
		"hard",
		"glossy",
		"round",
		"squre"
		)

	//singular object oriented nouns
	val s_obj:Array[String] = Array(
		"apple", 
		"plane", 
		"plum", 
		"fruit", 
		"vegetable", 
		"wire",
		"thread",
		"cable",
		"fish",
		"lion",
		"person",
		"planet",
		"log",
		"bat",
		"ball",
		"table",
		"tree"
		)

	val p_obj:Array[String] = Array(
		"apples", 
		"planes", 
		"pears", 
		"fruits", 
		"vegetables", 
		"wires",
		"threads",
		"cables",
		"humans",
		"chairs",
		"sofas",
		"creatures",
		"phones",
		"computers",
		"logs",
		"plants",
		"dogs",
		"animals",
		"cats"
		)

	val s_act:Array[String] = Array(
		"runs",
		"weeps",
		"walks",
		"throws",
		"leaps",
		"trots",
		"looks",
		"feels"
		)

	val p_act:Array[String] = Array(
		"run",
		"weep",
		"walk",
		"throw",
		"leap",
		"trot",
		"look",
		"feel",
		"grab",
		"squeeze",
		"grasp",
		"swim",
		"play"
		)

	/** Past tense actions
	  *
	  */
	val past_act:Array[String] = Array(
		"passed",
		"died",
		"failed",
		"flew",
		"rolled",
		"looked",
		"fought",
		"sat",
		"ran",
		"drifted",
		"rose"
		)
	/** Collection of adverbs
	  *
	  */
	val adv:Array[String] = Array(
		"accidentally",
		"always",
		"angrily",
		"anxiously",
		"awkwardly",
		"badly",
		"blindly",
		"boastfully",
		"boldly",
		"bravely",
		"brightly",
		"cheerfully",
		"coyly",
		"crazily",
		"defiantly",
		"deftly",
		"deliberately",
		"devotedly",
		"doubtfully",
		"dramatically",
		"dutifully",
		"eagerly",
		"elegantly",
		"enormously",
		"evenly",
		"eventually",
		"exactly",
		"faithfully",
		"finally",
		"foolishly",
		"fortunately",
		"frequently",
		"gleefully",
		"gracefully",
		"happily",
		"hastily",
		"honestly",
		"hopelessly",
		"hourly",
		"hungrily",
		"innocently",
		"inquisitively",
		"irritably",
		"jealously",
		"justly",
		"kindly",
		"lazily",
		"loosely",
		"madly",
		"merrily",
		"mortally",
		"mysteriously",
		"nervously",
		"never",
		"obediently",
		"obnoxiously",
		"occasionally",
		"often",
		"only",
		"perfectly",
		"politely",
		"poorly",
		"powerfully",
		"promptly",
		"quickly",
		"rapidly",
		"rarely",
		"regularly",
		"rudely",
		"safely",
		"seldom",
		"selfishly",
		"seriously",
		"shakily",
		"sharply",
		"silently",
		"slowly",
		"solemnly",
		"sometimes",
		"speedily",
		"sternly",
		"technically",
		"tediously",
		"unexpectedly",
		"usually",
		"victoriously",
		"vivaciously",
		"warmly",
		"wearily",
		"weekly",
		"wildly"
		)
}

/** Handles generation of determiners
  *
  */
object Det {
	def sing():String = Sampler.arr(WordBank.s_det)
	def plur():String = Sampler.arr(WordBank.p_det)
}
/** Handles adverb sampling
  *
  */
object Adv {
	def apply():String = Sampler.arr(WordBank.adv)
}