package swaydb.core.segment.format.one.entry.id

trait GeneratedEntryId {

  def headId: Int

  def lastId: Int

  def contains(id: Int): Boolean

  def keyIdsList: List[EntryId]

  def emptyMeta: EntryId.Meta.Empty

  def nonEmptyMeta: EntryId.Meta.NonEmpty

}
