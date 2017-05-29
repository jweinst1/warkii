package warkii

import twitter4j.conf.ConfigurationBuilder
import twitter4j.{StatusUpdate, TwitterFactory}
import scala.io.Source

object Tweet {
	def postStories(twitterKey:String, twitterSecret:String, token:String, secret:String, amount:Int, interval:Int, hashtag:String = ""):Unit = {
		val config = new ConfigurationBuilder()
		.setOAuthConsumerKey(twitterKey)
		.setOAuthConsumerSecret(twitterSecret)
		.setOAuthAccessToken(token)
		.setOAuthAccessTokenSecret(secret)
		.build()
		val twitter = new TwitterFactory(config).getInstance()
		var post:String = ""
		for(_ <- 1 to amount) {
			post = Story()
			twitter.updateStatus(post + s" $hashtag")
			println(s"POSTED Story::= '$post'")
			Thread.sleep(interval * 1000)
		}
	}

	def runFromKeysFile():Unit = {
		val keyFile:String = readLine("keyfilename> ")
		val amount:Int = readLine("amount> ").toInt
		val interval:Int = readLine("interval> ").toInt
		val hashtag:String = readLine("hashtag> ")
		val keys = Source.fromFile(keyFile).getLines().toArray
		postStories(keys(0), keys(1), keys(2), keys(3), amount, interval, hashtag)
	}
}