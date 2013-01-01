package com.dchan.awesomebank
import com.mongodb.MongoClient
import com.mongodb.DB

object MongoUtil {
  val client: MongoClient = new MongoClient()
  val db = client.getDB("awesomeApp")
  def getDB(): DB = {
    return db
  }
}