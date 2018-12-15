package $organization__packed$

import java.util.concurrent.ThreadLocalRandom

import org.scalajs.dom
import org.scalajs.dom.html.Input
import org.scalajs.dom.{UIEvent, document}
import rescala.core.ReSerializable
import rescala.restoration.{LocalStorageStore, ReCirce}
import rescala.restoration.ReCirce.{recirce, varDecoder, varEncoder}
import rescalatags._
import scalatags.JsDom.all._
import scalatags.JsDom.tags2.section

import scala.scalajs.js.annotation.JSExportTopLevel

object $name;format="Camel"$ {

  @JSExportTopLevel("$organization__packed$.$name;format="Camel"$.main")
  def main(): Unit = {
    val content = p("Hello World!")
    document.body.replaceChild(content.render, document.body.getElementsById("$name;format="Camel"$")).

    // render element
    val allScriptElems = document.getElementsByTagName("script")
    val myPosition = allScriptElems(allScriptElems.length - 1)
    myPosition.parentNode.insertBefore(html.render, myPosition)
  }
}
