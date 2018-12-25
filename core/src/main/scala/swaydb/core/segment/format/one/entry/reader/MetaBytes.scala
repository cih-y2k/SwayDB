package swaydb.core.segment.format.one.entry.reader

import swaydb.core.data.{AppliedFunctions, UpdateFunctions}

case class MetaBytes(updateFunctions: UpdateFunctions,
                     appliedFunctions: AppliedFunctions)
