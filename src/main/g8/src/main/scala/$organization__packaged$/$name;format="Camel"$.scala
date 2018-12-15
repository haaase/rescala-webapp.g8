package $organization$.$name;format="lower"$

import java.util.concurrent.ThreadLocalRandom

import org.scalajs.dom
import org.scalajs.dom.html.Input
import org.scalajs.dom.{UIEvent, document}
import rescala.core.ReSerializable
import rescalatags._
import scalatags.JsDom.all._

import scala.scalajs.js.annotation.JSExportTopLevel

object App {

  @JSExportTopLevel("main")
  def main(): Unit = {
    val content = p("Hello World!")
    document.body.replaceChild(content.render, document.getElementById("$name;format="Camel"$"))

    // render element
    //val allScriptElems = document.getElementsByTagName("script")
    //val myPosition = allScriptElems(allScriptElems.length - 1)
    //myPosition.parentNode.insertBefore(html.render, myPosition)
  }
}
