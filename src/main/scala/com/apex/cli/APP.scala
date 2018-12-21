package com.apex.cli

object APP {
  def main(args: Array[String]): Unit = {

    Wallet.load()

    println("Welcome to CLI, type \"help\" for command list:")
    while (true) {
      Command.execute("send -to AP9x3wKTf6GsdbuHa47MmTXdBvv54sAErkx -amount 1")
      Thread.sleep(5000)
    }
  }
}
