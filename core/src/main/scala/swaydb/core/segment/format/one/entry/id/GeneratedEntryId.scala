package swaydb.core.segment.format.one.entry.id

trait GeneratedEntryId {

  def headId: Int

  def lastId: Int

  def contains(id: Int): Option[Int]

  def keyIdsList: List[EntryId]

}
