package com.apex.cli

object APP {
  def main(args: Array[String]): Unit = {

    Wallet.load()

    println("Welcome to CLI, type \"help\" for command list:")
    while (true) {
      Command.execute(Console.in.readLine()) match {
        case UnKnown(cmd) => println(s"unknown command: $cmd")
        case InvalidParams(input) => println(s"invalid parameters: $input")
        case Success(result) => Command.execute(Console.in.readLine())
        case Help(message) => println(message)
        case Error(e) => println(e)
        case NoInput() => {}
        case Quit() => sys.exit()
      }
      Thread.sleep(5000)
    }
  }
}
