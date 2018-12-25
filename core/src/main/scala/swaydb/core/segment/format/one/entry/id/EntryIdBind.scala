package swaydb.core.segment.format.one.entry.id

import scala.annotation.implicitNotFound
import swaydb.core.data.Transient

@implicitNotFound("Type class implementation not found for EntryIdBind of type ${T}")
sealed trait EntryIdBind[T] {
  val entryId: GeneratedEntryId
}

object EntryIdBind {

  implicit object Remove extends EntryIdBind[Transient.Remove] {
    override val entryId: GeneratedEntryId = RemoveEntryId
  }

  implicit object Update extends EntryIdBind[Transient.Update] {
    override val entryId: GeneratedEntryId = UpdateEntryId
  }

  implicit object Group extends EntryIdBind[Transient.Group] {
    override val entryId: GeneratedEntryId = GroupEntryId
  }

  implicit object Range extends EntryIdBind[Transient.Range] {
    override val entryId: GeneratedEntryId = RangeEntryId
  }

  implicit object Put extends EntryIdBind[Transient.Put] {
    override val entryId: GeneratedEntryId = PutEntryId
  }
}
