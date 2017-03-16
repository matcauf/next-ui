package com.inocybe.models

/**
  * Created by matthieu on 2017-03-16.
  */
case class Node(id: Int, x: Int, y: Int, name: String)
case class Link(source: Int, target: Int)

case class TopologyData(nodes: Seq[Node], sources: Seq[Link])

object TopologyMock {
  var topology = TopologyData(
    List(
      Node(0, 410, 100, "12K-1"),
      Node(1, 410, 280, "12K-2"),
      Node(2, 660, 280, "Of-9k-03"),
      Node(3, 660, 100, "Of-9k-02"),
      Node(4, 180, 190, "Of-9k-01")
    ),
    List(
      Link( 0, 1),
      Link( 1, 2),
      Link( 1, 3),
      Link( 4, 1),
      Link( 2, 3),
      Link( 2, 0),
      Link( 3, 0),
      Link( 3, 0),
      Link( 3, 0),
      Link( 0, 4),
      Link( 0, 4),
      Link( 0, 3)
    )
  )
}
