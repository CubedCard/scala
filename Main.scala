object Hello extends App {
  var num : Int = 10

  if (num > 1) {
    num = 1
    println("Hello World")
  }

  if (args.size > 0) {
    println("Hello " + args(0))
  }
}
