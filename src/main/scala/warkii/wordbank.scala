package warkii

/** Carries bins of words for story construction
  *
  */
object WordBank {

	/** Singular to-be verbs
	  *
	  */
	val to_be_s:Array[String] = Array(
		"is",
		"was"
	)

	val to_be_p:Array[String] = Array(
		"are",
		"were"
	)

	val pron_obj:Array[String] = Array(
		"me",
		"you",
		"him",
		"her"
	)

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

	/** Adjectives that aren't visual but ideal
	  *
	  */
	val idea_adj:Array[String] = Array(
		"strong",
		"weak",
		"powerful",
		"superb",
		"wonderful",
		"thoughtful",
		"mystical"
	)

	//singular object oriented nouns
	val s_obj:Array[String] = Array(
		"apple",
		"leaf",
		"plane", 
		"plum", 
		"fruit", 
		"vegetable", 
		"wire",
		"stick",
		"cable",
		"fish",
		"lion",
		"person",
		"planet",
		"log",
		"bat",
		"ball",
		"table",
		"tree",
		"beast",
		"lord",
		"tissue"
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
		"cats",
		"sticks",
		"stones",
		"leaves",
		"branches",
		"carrots",
		"twigs",
		"oaks",
		"willows",
		"maples",
		"arches",
		"cabbages",
		"rats"
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
		"rose",
		"walked",
		"moved",
		"left",
		"soared",
		"torn"
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

/** Handles adjectives
  *
  */
object Adj {
	def apply():String = Sampler.choice(vis, idea)

	def vis():String = Sampler.arr(WordBank.vis_adj)
	def idea():String = Sampler.arr(WordBank.idea_adj)
}