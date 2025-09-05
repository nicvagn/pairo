package swiss

class IdIterator(maxIds: Int) extends Iterator[Int] {
  private var counter = 0

  def hasNext: Boolean = counter < maxIds

  def next(): Int = {
    if (!hasNext) throw new NoSuchElementException("No more IDs available")
    counter += 1
    counter
  }

  def remaining: Int = maxIds - counter
}

object SwissIdFactory {
  val itr = new IdIterator(900000)

  def newId(): Int = itr.next()

}
