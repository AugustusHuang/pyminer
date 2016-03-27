package org.augustushwang.pyminer.Output

case class Config(maxDepth: Int = 3)

class OutHTML {
  def run(input: Option[String]): Unit = {
  }
}

object OutHTML {
  def main(args: Array[String]): Unit = {
    val input = args(0)
    val output = args(1)
    val parser = new scopt.OptionParser[Config]("pyminer") {
      head("pyminer", "0.1")
      opt[Int]('m', "maxDepth") action {
        (x, c) => c.copy(maxDepth = x)
      } text("maximum depth of the current traversed files.")
      note("Some useful notes.")
      help("help") text("Help information")
    }

    parser.parse(args, Config()) match {
      case Some(config) =>
        ???

      case None =>
        ???
    }
  }
}
