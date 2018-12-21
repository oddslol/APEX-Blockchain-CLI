package com.apex.cli

object APP {
  def main(args: Array[String]): Unit = {

    Wallet.load()

    println("Welcome to CLI, type \"help\" for command list:")
    while (true) {
      val privKey = Wallet.Default.getPrivKey()
      val account = RPC.post("showaccount", s"""{"address":"${privKey.publicKey.address}"}""")
      var nextNonce: Long = 0
      nextNonce = (account \ "nextNonce").as[Long]
      var nonce1 = nextNonce + 1
      var nonce2 = nonce1 + 1
      var nonce3 = nonce2 + 1
      var nonce4 = nonce3 + 1
      Command.execute("sendrawtransaction -privkey 8d3d3ff1ebf1141000e9d844a3920a3bd4377f9bc5a4151b6eb30367785658ea -address AP9x3wKTf6GsdbuHa47MmTXdBvv54sAErkx -assetId 0000000000000000000000000000000000000000000000000000000000000000 -amount 0.001 -nonce "+nextNonce.toString)
      Command.execute("sendrawtransaction -privkey 8d3d3ff1ebf1141000e9d844a3920a3bd4377f9bc5a4151b6eb30367785658ea -address AP9x3wKTf6GsdbuHa47MmTXdBvv54sAErkx -assetId 0000000000000000000000000000000000000000000000000000000000000000 -amount 0.001 -nonce "+nonce1.toString)
      Command.execute("sendrawtransaction -privkey 8d3d3ff1ebf1141000e9d844a3920a3bd4377f9bc5a4151b6eb30367785658ea -address AP9x3wKTf6GsdbuHa47MmTXdBvv54sAErkx -assetId 0000000000000000000000000000000000000000000000000000000000000000 -amount 0.001 -nonce "+nonce2.toString)
      Command.execute("sendrawtransaction -privkey 8d3d3ff1ebf1141000e9d844a3920a3bd4377f9bc5a4151b6eb30367785658ea -address AP9x3wKTf6GsdbuHa47MmTXdBvv54sAErkx -assetId 0000000000000000000000000000000000000000000000000000000000000000 -amount 0.001 -nonce "+nonce3.toString)
      Command.execute("sendrawtransaction -privkey 8d3d3ff1ebf1141000e9d844a3920a3bd4377f9bc5a4151b6eb30367785658ea -address AP9x3wKTf6GsdbuHa47MmTXdBvv54sAErkx -assetId 0000000000000000000000000000000000000000000000000000000000000000 -amount 0.001 -nonce "+nonce4.toString)
      Thread.sleep(100)
    }
  }
}
