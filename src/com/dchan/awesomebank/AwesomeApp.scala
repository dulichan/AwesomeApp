package com.dchan.awesomebank

import scala.swing.SimpleSwingApplication
import scala.swing.MainFrame
import scala.swing.Button
import javax.swing.JPanel
import java.awt.BorderLayout
import scala.swing.FlowPanel
import scala.swing.TextField
import scala.swing.Label
import scala.swing.TextArea
import scala.swing.Action
import scala.swing.event.ButtonClicked

object AwesomeApp extends SimpleSwingApplication {

  def createTxt = new TextField {
    columns = 5
  }
  def createTxArea = new TextArea { columns = 10; rows = 10; }
  val eventTxt = createTxt
  val descriptionTxt = createTxArea
  val confirmButton = new Button { text = "Remember" }
  def top = new MainFrame {
    title = "Hellow World"
    contents = new FlowPanel(
      new Label("Event"), eventTxt, new Label("Description"), descriptionTxt, confirmButton)
  }
  listenTo(confirmButton)
  reactions += {
    case e: ButtonClicked => {
      var collection = MongoUtil.getDB().getCollection("inspriations")
      
    }
  }

}