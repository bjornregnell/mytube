@main 
def run = 
  println(msg)

def msg = "fatta rekursion!" 

def loop1(n: Int) = 
  var i = n
  while i >= 0 do
    println(i)
    i -= 1

def loop2(n: Int): Unit = 
    if n >= 0 then 
      println(n)
      loop2(n - 1)    

trait Tree
case class Branch(left: Tree, right: Tree) extends Tree
case class Leaf(x: Int) extends Tree

extension (self: Tree) def +(other: Tree) = Branch(self, other)

def show(t: Tree): Unit = 
  t match
    case Leaf(x) => println(x)
    case Branch(left, right) => 
      show(left)
      show(right)

