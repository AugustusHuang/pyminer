package org.augustushwang.pyminer

import org.apache.commons.io.FileUtils
import org.apache.commons.lang3.StringUtils

import org.augustushwang.pyminer.State.Reader

object Util {
  def hashName(name: String): String = {
    return name.hashCode().toString()
  }

  def abnormalExit(message: String, exception: Exception): Unit = {
    Console.err.println(message)

    if (exception != None) {
      Console.err.println("Exception: " + exception + "\n")
    }

    System.exit(2)
  }

  def fileReader(name: String): Option[Reader] = {
    try {
      val reader = new Reader()
      return Option(reader)
      ???
    } catch (exception: RuntimeException) {
      return None
    }
  }
}
