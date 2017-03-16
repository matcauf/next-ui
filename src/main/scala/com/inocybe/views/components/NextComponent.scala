package com.inocybe.views.components

import scala.scalajs.js

/**
  * Facade for Next-ui lib.
  */
@js.native
object nx extends js.Object {
  def reset(): Unit = js.native
  def switchType(newtype: String): Unit = js.native
  def getChallenge(): String = js.native
  def getResponse(): String = js.native
  def render(element: String, options: RecaptchaOptions): Unit = js.native
  def destroy(): Unit = js.native
}

@js.native
trait RecaptchaOptions extends js.Object {
  var sitekey: String = js.native
  var size: String = js.native
  var theme: String = js.native
  var callback: js.Function = js.native
  var tabindex: js.Function = js.native
  var expired_callback: js.Function = js.native
}


class NextComponent {

}
