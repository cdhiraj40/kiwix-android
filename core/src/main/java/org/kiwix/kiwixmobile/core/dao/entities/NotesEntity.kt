/*
 * Kiwix Android
 * Copyright (c) 2020 Kiwix <android.kiwix.org>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 *
 */

package org.kiwix.kiwixmobile.core.dao.entities

import io.objectbox.annotation.Entity
import io.objectbox.annotation.Id
import org.kiwix.kiwixmobile.core.page.notes.adapter.NoteListItem

@Entity
data class NotesEntity(
  @Id var id: Long = 0,
  val zimId: String,
  var zimFilePath: String?,
  var noteTitle: String?,
  var noteBody: String,
  var noteFilePath: String,
  var favicon: String?
) {
  constructor(item: NoteListItem) : this(
    zimId = item.zimId,
    zimFilePath = item.zimFilePath,
    noteTitle = item.title,
    noteBody = item.noteBody,
    noteFilePath = item.noteFilePath,
    favicon = item.favicon
  )
}
