package com.inocybe.views

import com.inocybe.{BindingDemoState, DemoStylesState, OpenFlowState}
import com.inocybe.styles.DemoStyles
import io.udash.View
import io.udash.core.DefaultViewPresenterFactory

object OpenFlowPresenter extends DefaultViewPresenterFactory[OpenFlowState.type](() => new IndexView)

class OpenFlowView extends View {

  import com.inocybe.Context._
  import scalatags.JsDom.all._

  private val content = div(
    h2("Open FlowTopology"),
    ul(DemoStyles.stepsList)(
      li(a(DemoStyles.underlineLinkBlack, href := BindingDemoState().url)("Binding demo")),
      li(a(DemoStyles.underlineLinkBlack, href := BindingDemoState("From index").url)("Binding demo with URL argument")),
      li(a(DemoStyles.underlineLinkBlack, href := DemoStylesState.url)("ScalaCSS demo view"))
    ),
  )

  override def getTemplate: Modifier = content

  override def renderChild(view: View): Unit = {}
}