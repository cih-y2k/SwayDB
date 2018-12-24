package swaydb.core.segment.format.one.entry.id

trait GeneratedEntryId {

  def headId: Int

  def lastId: Int

  def contains(id: Int): Option[Int]

  def keyIdsList: List[EntryId]

//  def emptyAppliedFunctions: EntryId.AppliedFunctions.Empty
//
//  def nonEmptyAppliedFunctions: EntryId.AppliedFunctions.NonEmpty

}
